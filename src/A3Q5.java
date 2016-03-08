
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        
        Robot defaultsteve = new Robot(Kitchener, 1, 2, Direction.EAST);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 2);
        
        for(int x = 0;x < 10;x = x + 1){  
        defaultsteve.pickThing();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.putThing();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        }
        defaultsteve.move();
    }
}
