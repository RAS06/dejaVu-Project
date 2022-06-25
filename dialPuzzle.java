import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialPuzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialPuzzle extends World
{

    /**
     * Constructor for objects of class dialPuzzle.
     * 
     */
    public dialPuzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        addObject(new dial(), 150, 300);
        addObject(new dial(), 350, 300);
        addObject(new dial(), 550, 300);
        //prepare();
    }
}