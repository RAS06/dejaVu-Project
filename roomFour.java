import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomFour extends World
{

    /**
     * Constructor for objects of class roomFour.
     * 
     */
    private static boolean added = false;
    public roomFour()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        addObject(new champion(), 375, 700);
        showText("roomFour", 300, 500);
        if(!added){
            worldMaster.addWorld(3, this);
            added = true;
            worldMaster.getWorlds().get(3).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomFive());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(2),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        addObject(new door("door(Top).png"), 700, 375);
    }
    public String toString(){
        return "Room Four";
    }
}
