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
            Greenfoot.setWorld(new colorPuzzle());
        }
        addObject(new dialMaster(), 0, 0);
        addObject(new dial(1), 150, 300);
        addObject(new dial(2), 350, 300);
        addObject(new dial(3), 550, 300);
        addObject(new teleportationButton("pressBToGoBack.png", worldMaster.getWorlds().get(4)), 600, 725);
    }
    public String toString(){
        return "Dial Puzzle";
    }
}