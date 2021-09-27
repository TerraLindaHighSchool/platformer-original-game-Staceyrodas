import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
     private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
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
    
    public void act()
    {
       spawn();
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
        Player player = new Player();
        addObject(player,468,538);// number may vary 
        door.setLocation(1164,59);
        Gem gem = new Gem();
        addObject(gem,521,292);
        gem.setLocation(902,466);
        player.setLocation(54,687);
        addObject(new Floor(), 600, 800);
        player.setLocation(40,720);
        addObject(new Floor(), 600, 800);
        addObject(new SmBrickWall (), 1100, 700);
        addObject(new SmBrickWall (), 950, 570);
        addObject(new SmBrickWall (), 400, 400);
        addObject(new BrickWall   (), 1100, 120);
        addObject(new TrapDoor(GRAVITY), 300, 600);
        addObject(new TrapDoor(GRAVITY), 700, 250);
        addObject(new SmBrickWall (), 700, 600);
        Bomb bomb = new Bomb(GRAVITY);
        addObject(bomb,707,553);
        Gem gem2 = new Gem();
        addObject(gem2,1093,79);
        Gem gem3 = new Gem();
        addObject(gem3,704,211);
        removeObject(gem2);
    }
    
    private void spawn()
    {
       if(Math.random() < 0.0025)
       {
           addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
       }
    }
    
   
}
