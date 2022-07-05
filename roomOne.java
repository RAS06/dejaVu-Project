import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;  //Let's see if I can solve my problems with an ArrayList.

/**
 * @Riz 
 * @0.0.1
 */
public class roomOne extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //public static World worldOne = getWorld();
    //public static ArrayList<World> worlds = new ArrayList<World>();
    private static boolean added = false;

    public roomOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.  
        super(750, 750, 1);
                
        if(!added){
            worldMaster.addWorld(0, this);
            added = true;
            addObject(new champion(), 200, 200);
            addObject(new key(), 500, 500);
            Greenfoot.setWorld(new roomTwo());
        }
        
        
        
        addObject(new key(), 500, 500);
        
        showText("roomOne", 300, 500);
        
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(1),"horizBorderControl.png"), 275 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 365, 25);
        addObject(new champion(), 200, 200);
        
    }
    public String toString(){
        return "Room One";
    }
    
}