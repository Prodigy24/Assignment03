
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            City Kitchener = new City();
        
        Robot defaultsteve = new Robot(Kitchener, 1, 1, Direction.EAST);
        Robot defaultandrea = new Robot(Kitchener, 2, 1, Direction.EAST);
        new Thing(Kitchener, 1, 4);
        new Thing(Kitchener, 1, 3);
        new Wall(Kitchener, 1, 5, Direction.WEST);
        new Thing(Kitchener, 2, 6);
        new Wall(Kitchener, 2, 5, Direction.EAST);
        while( !defaultsteve.canPickThing() && defaultsteve.frontIsClear()){
            defaultsteve.move();
        }
        while( defaultandrea.frontIsClear() && !defaultandrea.canPickThing()){
            defaultandrea.move();
        }
    }
}