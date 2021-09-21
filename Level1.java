import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {             
        Player player = new Player();
        addObject(player,468,538);
        player.setLocation(522,603);
        Door door = new Door();
        addObject(door,447,58);
        Player player2 = new Player();
        addObject(player2,44,495);
        player.setLocation(511,592);
        removeObject(player);
        removeObject(player2);
        door.setLocation(893,136);
        door.setLocation(1164,59);
        Player player1 = new Player();
        addObject(player,60,638);
    }
    
    /**
     * setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
              Door.class, HUD.class);
     */
}
