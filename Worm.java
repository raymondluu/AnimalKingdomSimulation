public class Worm extends Animal {
	private boolean direction = true;
   public Worm(int worldHeight, int worldWidth) {
      super(worldHeight,worldWidth);           
   }
	public void move() {
		if( getCol() + 1 == getWorldWidth() ) {
			direction = false;
		}
		if( getCol() == 0 ) {
			direction = true;
		}
		if( direction == true ) {
			setCol( getCol() + 1 );
		}
		else if( direction == false ) {
		   setCol( getCol() - 1 );
		}
   }
   public String toString() {
      return ".";
   }
}