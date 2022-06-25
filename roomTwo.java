import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class roomTwo here.
 * 
 * @Riz 
 * @0.0.1
 */
public class roomTwo extends World
{
    public static World worldOne = new roomOne();
    private static boolean added = false;
    /**
     * Constructor for objects of class roomTwo.
     * 
     */
    public roomTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        worldMaster w = new worldMaster();
        if(!added){
            w.addWorld(1, this);
            added = true;
            Greenfoot.setWorld(new roomThree());
        }
        
        addObject(new champion(), 100, 100);
        //showText("roomTwo", 500, 500);
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(w.getWorlds().get(0),"horizBorderControl.png", 375, 720), 275 + (30 * i), 725);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(w.getWorlds().get(2),"horizBorderControl.png", 375, 720), 275 + (30 * i), 50);
        }
    }
}