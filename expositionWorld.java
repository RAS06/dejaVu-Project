import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class expositionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class expositionWorld extends World
{

    /**
     * Constructor for objects of class expositionWorld.
     * 
     */
    public expositionWorld() 
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. 
        super(750, 750, 1); 
        addObject(new worldMaster(), 0, 0);
        addObject(new hints("expositionText.png"), 375, 375);
    }
}
