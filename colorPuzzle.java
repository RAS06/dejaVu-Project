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
            Greenfoot.setWorld(worldMaster.getWorlds().get(0));
        }
        addObject(new teleportationButton("pressBToGoBack.png", worldMaster.getWorlds().get(7)), 600, 725);
        addObject(new colorPuzzleButton("colorPuzzlePieceR.jpg", "red"), 190, 150);
        addObject(new colorPuzzleButton("colorPuzzlePieceG.jpg", "green"), 560, 150);
        addObject(new colorPuzzleButton("colorPuzzlePieceB.jpg", "blue"), 190, 450);
        addObject(new colorPuzzleButton("colorPuzzlePieceY.jpg", "yellow"), 560, 450);
        addObject(new colorPuzzleSubmit(), 375, 300);
        addObject(new hints("colorPuzzleInstructions.png"), 100, 650);
    }
    public String toString(){
        return "Color Puzzle";
    }
}
