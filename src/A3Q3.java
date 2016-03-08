
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        
        Robot defaultsteve = new Robot(Kitchener, 1, 1, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.NORTH);
        new Wall(Kitchener, 1, 2, Direction.NORTH);
        new Wall(Kitchener, 1, 3, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.EAST);
        new Wall(Kitchener, 2, 4, Direction.EAST);
        new Wall(Kitchener, 3, 4, Direction.EAST);
        new Wall(Kitchener, 3, 4, Direction.SOUTH);
        new Wall(Kitchener, 3, 2, Direction.SOUTH);
        new Wall(Kitchener, 3, 1, Direction.SOUTH);
        new Wall(Kitchener, 3, 1, Direction.WEST);
        new Wall(Kitchener, 2, 1, Direction.WEST);
        new Wall(Kitchener, 1, 1, Direction.WEST);
         while(true){
             if(defaultsteve.canPickThing()){
                 defaultsteve.pickThing();
             }
        if(defaultsteve.frontIsClear()){
        defaultsteve.move();
        defaultsteve.turnLeft();
         if(defaultsteve.frontIsClear()){
             break;
         }
         }
            if( !defaultsteve.frontIsClear()){
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();          
             
              }
         }
         defaultsteve.move();
    }
}

         
      
    


    


    
