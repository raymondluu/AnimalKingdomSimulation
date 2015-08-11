import java.util.Random;

public class Bird extends Animal {
    public Bird(int worldHeight, int worldWidth) {
        super(worldHeight,worldWidth);           
    }
	 public boolean willEat(Animal anim) { //returns true if bird meets worm
	 	  if( anim instanceof Worm ) {
				return true;
		  }
        return false;
    }
	 public void move() {
	 	  Random r = new Random();
	     int direction = r.nextInt(4);
		  //test the borders so that bird doesn't leave area
	 	  if( getCol() == 0 && getRow() == 3 ) {
			  direction = 3;
		  }
	     else if( getCol() == 0 && getRow() == 0 ) {
			  direction = 2;
		  }
		  else if( getCol() == 3 && getRow() == 0 ) {
			  direction = 1;
		  }
		  else if( getCol() == 3 && getRow() == 3 ) {
			  direction = 0;
		  }
		  else if(getCol() == 0) {
		     direction = r.nextInt(2) + 2;
		  }
		  else if(getCol() == 3) {
		     direction = r.nextInt(2);
		  }
		  else if(getRow() == 0) {
		     direction = r.nextInt(2) + 1;
		  }
		  else if(getRow() == 3) {
		     direction = r.nextInt(4);
			  if( direction == 2 || direction == 1 || direction == 0 ) {
			     direction = 0;
			  }
		  }
		  //tests check for random number
		  //then move in a certain diagonal direction for that randon number
		  if (direction == 0) {
			  setCol(getCol() - 1);
			  setRow(getRow() - 1);
		  }
		  else if (direction == 1) {
			  setCol(getCol() - 1);
			  setRow(getRow() + 1);
		  }
		  else if (direction == 2) {
			  setCol(getCol() + 1);
			  setRow(getRow() + 1);
		  }
		  else if (direction == 3) {
			  setCol(getCol() + 1);
			  setRow(getRow() - 1);
		  }
    }
    public String toString() {
        return "B";
    }
}