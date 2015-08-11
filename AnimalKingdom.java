/* 
    Starter Code for TCSS 143 Fall 2011 HW2
    by John Mayer 
*/

public class AnimalKingdom {
 
    public static int WORLD_ROWS = 4; 
    public static int WORLD_COLUMNS = 4;
    
    public static int ROUNDS = 10;

    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Worm(WORLD_ROWS, WORLD_COLUMNS);        
        animals[1] = new Worm(WORLD_ROWS, WORLD_COLUMNS);
        animals[2] = new Worm(WORLD_ROWS, WORLD_COLUMNS);        
        animals[3] = new Worm(WORLD_ROWS, WORLD_COLUMNS);        
        animals[4] = new Bird(WORLD_ROWS, WORLD_COLUMNS);        
        animals[5] = new Bird(WORLD_ROWS, WORLD_COLUMNS);
        animals[6] = new Bird(WORLD_ROWS, WORLD_COLUMNS);
        animals[7] = new Bird(WORLD_ROWS, WORLD_COLUMNS);                    
        animals[8] = new Wolf(WORLD_ROWS, WORLD_COLUMNS);
        animals[9] = new Wolf(WORLD_ROWS, WORLD_COLUMNS);   
                       
        for (int i = 1; i < ROUNDS; i++) {
            showWorld(animals);
            doEating(animals);
            doMoving(animals);
        }
    } 
    
    public static void showWorld(Animal[] animals) {
        System.out.println();
        System.out.println("The World");
        for (int r = 0; r < WORLD_ROWS; r++) {
            for (int c = 0; c < WORLD_COLUMNS; c++) {
            
                int cellCount = 0;
                for (int a = 0; a < animals.length; a++) {
                    if (animals[a] != null) {
                        int ar = animals[a].getRow();
                        int ac = animals[a].getCol();
                        if (r == ar && c == ac) {
                            cellCount++;
                            System.out.print(animals[a]);
                        }
                    }
                }
                for (int i = 0; i < animals.length-cellCount; i++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();        
        }
        System.out.println();
    }
    
    public static void doEating(Animal[] animals) { 
	    for( int a = 0; a < animals.length; a++ ) {
		    for( int b = 0; b < animals.length; b++ ) {
			    if ( animals[b] != null && animals[a] != null && animals[a].isInSamePlaceAs(animals[b]) && animals[a].willEat(animals[b])) {// checks for a null slot, looks to see if the animal will eat it as well as if its in the same place
				    animals[b] = null; //kills an animal
					 System.out.println( "Animal has been killed!" );
				 }
			 }
		 }
    }  
    
	 public static void doMoving(Animal[] animals) {
	     for( int a = 0; a < animals.length; a++ ) {
		     if(animals[a]!= null) {
	 	        animals[a].move();
			  }
		  }
	 }     
}