import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class colorPuzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class colorPuzzle extends World
{

    /**
     * Constructor for objects of class colorPuzzle.
     * 
     */
    private static boolean added = false;
    public colorPuzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        if(!added){
            worldMaster.addWorld(16, this);
            added = true;
            worldMaster.getWorlds().get(16).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(worldMaster.getWorlds().get(0));
        }
    }
    public String toString(){
        return "Color Puzzle";
    }
}
