
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        
        Robot defaultsteve = new Robot(Kitchener, 0, 2, Direction.WEST);
        new Wall(Kitchener, 1, 1, Direction.NORTH);
        new Wall(Kitchener, 1, 2, Direction.NORTH);
        new Wall(Kitchener, 1, 1, Direction.WEST);
        new Wall(Kitchener, 2, 1, Direction.WEST);
        new Wall(Kitchener, 2, 1, Direction.SOUTH);
        new Wall(Kitchener, 2, 2, Direction.SOUTH);
        new Wall(Kitchener, 2, 2, Direction.EAST);
        new Wall(Kitchener, 1, 2, Direction.EAST);
        
        for(int x = 0;x < 8;x = x + 1){
        defaultsteve.move();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.move();
    }
    }
}
