import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class roomTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomTwo extends World
{
    public static World worldOne = new roomOne();
    /**
     * Constructor for objects of class roomTwo.
     * 
     */
    public roomTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        addObject(new champion(), 100, 100);
        showText("roomTwo", 500, 500);
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldOne,"horizBorderControl.png", 375, 720), 275 + 30 * i, 50);
        }
    }
}
