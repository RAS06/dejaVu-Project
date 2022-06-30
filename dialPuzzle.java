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
    private static boolean added = false;
    public dialPuzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        if(!added){
            worldMaster.addWorld(15, this);
            added = true;
            worldMaster.getWorlds().get(15).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(worldMaster.getWorlds().get(0));
        }
        addObject(new dial(), 150, 300);
        addObject(new dial(), 350, 300);
        addObject(new dial(), 550, 300);
        //prepare();
    }
    public String toString(){
        return "Dial Puzzle";
    }
}