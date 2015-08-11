import java.util.Random;

public class Animal {

    private Random rand = new Random();
    private int worldWidth;
    private int worldHeight;
    private int row;
    private int col;
    
    public Animal(int worldHeight, int worldWidth) {
        this.worldHeight = worldHeight;    
        this.worldWidth = worldWidth;  
        row = rand.nextInt(worldHeight);   
        col = rand.nextInt(worldWidth);            
    }

    public boolean willEat(Animal anim) {
        return false;
    }
    
    public void move() {
    }
    
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    
    public void setRow(int r) {
        row = r;
    }

    public void setCol(int c) {
        col = c;
    }        
    
    public String toString() {
        return "";
    }
    
    public int getWorldWidth(){
        return worldWidth;
    }
    
    public int getWorldHeight(){
        return worldHeight;
    }  
    
    public boolean isInSamePlaceAs(Animal other) {
        return getRow() == other.getRow() &&
               getCol() == other.getCol();
    }

}