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
    private static boolean added = false;
    /**
     * Constructor for objects of class roomTwo.
     * 
     */
    public roomTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        
        if(!added){
            worldMaster.addWorld(1, this);
            //w.getWorlds().get(1).addObject(new champion(), 375, 700);
            added = true;
            Greenfoot.setWorld(new roomThree());
        }
        
        addObject(new champion(), 100, 100);
        showText("roomTwo", 300, 500);
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(0),"horizBorderControl.png"), 300 + (30 * i), 710);
        }
        addObject(new door("door(Top).png"), 365, 700);

        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(2),"horizBorderControl.png"), 300 + (30 * i), 70);
        }
        addObject(new door("door(Top).png"), 365, 50);
    }
    public String toString(){
        return "Room Two";
    }
}