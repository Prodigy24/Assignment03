
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City Kitchener = new City();
        
        Robot defaultsteve = new Robot(Kitchener, 1, 1, Direction.EAST);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 2, 2);
        new Thing(Kitchener, 2, 3);
        new Thing(Kitchener, 2, 4);
        new Thing(Kitchener, 3, 1);
        new Thing(Kitchener, 3, 4);
        new Wall(Kitchener, 1, 1, Direction.NORTH);
        new Wall(Kitchener, 1, 2, Direction.NORTH);
        new Wall(Kitchener, 1, 3, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.EAST);
        new Wall(Kitchener, 2, 4, Direction.EAST);
        new Wall(Kitchener, 3, 4, Direction.EAST);
        new Wall(Kitchener, 3, 4, Direction.SOUTH);
        new Wall(Kitchener, 3, 3, Direction.SOUTH);
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
        }
            if( !defaultsteve.frontIsClear()){
                if(defaultsteve.getDirection() == Direction.EAST){ 
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();
                    if(defaultsteve.frontIsClear()){
                    defaultsteve.move();
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();
                    defaultsteve.turnLeft();
                    }else{
                        break;
                    }
                }else{
                    
                    defaultsteve.turnLeft();
                    if(defaultsteve.frontIsClear()){
                    defaultsteve.move();
                    defaultsteve.turnLeft();
                    }else{                      
                        break;
                    }
            }            
          }
        }
         if(defaultsteve.canPickThing()){
                 defaultsteve.pickThing();
             }
         defaultsteve.turnLeft();
         defaultsteve.turnLeft();
         while(defaultsteve.getStreet()>1){
         defaultsteve.move();
         }
         defaultsteve.turnLeft();
        
         while(defaultsteve.getAvenue()>1){
         defaultsteve.move();
    }  
    }
}

         
      
    


    

