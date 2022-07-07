import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class victoryWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class victoryWorld extends World
{

    /**
     * Constructor for objects of class victoryWorld.
     * 
     */
    public victoryWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        addObject(new chatDialougeQuerySelector(10), 375, 375); 
    }
}
