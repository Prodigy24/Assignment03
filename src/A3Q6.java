
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
    Robot defaultsteve = new Robot (Kitchener, 3, 3, Direction.SOUTH);
    
    new Wall(Kitchener, 1, 1, Direction.WEST);
    new Wall(Kitchener, 2, 1, Direction.WEST);
    new Wall(Kitchener, 4, 1, Direction.WEST);
    new Wall(Kitchener, 5, 1, Direction.WEST);
    new Wall(Kitchener, 1, 4, Direction.WEST);
    new Wall(Kitchener, 2, 4, Direction.WEST);
    new Wall(Kitchener, 4, 4, Direction.WEST);
    new Wall(Kitchener, 5, 4, Direction.WEST);
    new Wall(Kitchener, 1, 1, Direction.NORTH);
    new Wall(Kitchener, 1, 2, Direction.NORTH);
    new Wall(Kitchener, 1, 4, Direction.NORTH);
    new Wall(Kitchener, 1, 5, Direction.NORTH);
    new Wall(Kitchener, 4, 1, Direction.NORTH);
    new Wall(Kitchener, 4, 2, Direction.NORTH);
    new Wall(Kitchener, 4, 4, Direction.NORTH);
    new Wall(Kitchener, 4, 5, Direction.NORTH);
    new Wall(Kitchener, 2, 1, Direction.SOUTH);
    new Wall(Kitchener, 2, 2, Direction.SOUTH);
    new Wall(Kitchener, 2, 4, Direction.SOUTH);
    new Wall(Kitchener, 2, 5, Direction.SOUTH);
    new Wall(Kitchener, 5, 1, Direction.SOUTH);
    new Wall(Kitchener, 5, 2, Direction.SOUTH);
    new Wall(Kitchener, 5, 4, Direction.SOUTH);
    new Wall(Kitchener, 5, 5, Direction.SOUTH);
    new Wall(Kitchener, 1, 2, Direction.EAST);
    new Wall(Kitchener, 2, 2, Direction.EAST);
    new Wall(Kitchener, 4, 2, Direction.EAST);
    new Wall(Kitchener, 5, 2, Direction.EAST);
    new Wall(Kitchener, 1, 5, Direction.EAST);
    new Wall(Kitchener, 2, 5, Direction.EAST);
    new Wall(Kitchener, 4, 5, Direction.EAST);
    new Wall(Kitchener, 5, 5, Direction.EAST);
    
    for(int y = 0;y < 4; y = y + 1){
        for(int x = 0;x < 4; x = x + 1){
        defaultsteve.move();
        defaultsteve.move();
        defaultsteve.move();
        defaultsteve.turnLeft();
        }
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
    }
    }
}
