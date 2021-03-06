import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
     private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH= 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class, Door.class, HUD.class);
        Door door = new Door();
        addObject(door,447,58);

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH,
                MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,468,538);// number may vary 
        door.setLocation(1164,59);
        player.setLocation(54,687);
        addObject(new Floor(), 600, 800);
        player.setLocation(40,720);
        addObject(new Floor(), 600, 800);
        addObject(new BrickWall (), 1000, 700);
        addObject(new SmBrickWall   (), 1200, 120);
        addObject(new TrapDoor(GRAVITY), 600, 650);
        addObject(new SmBrickWall   (), 450, 550);
        addObject(new SmBrickWall   (), 200, 600);
        addObject(new BrickWall   (), 290, 300);
        addObject(new SmBrickWall   (), 730, 100);
        addObject(new SmBrickWall   (), 1000, 100);
        addObject(new SmBrickWall   (), 700, 400);

        BrickWall brickWall3 = new BrickWall();
        addObject(brickWall3,849,700);

        
    }
    
    private void spawn()
    {
       if(Math.random() < 0.0025)
       {
           addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
       }
    }
    




    

   
}
