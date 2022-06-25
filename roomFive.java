import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomFive extends World
{
    private static boolean added = false;
    /**
     * Constructor for objects of class roomFive.
     * 
     */
    public roomFive()
    {    
        super(750, 750, 1); 
        addObject(new champion(), 375, 700);
        showText("roomFive", 300, 500);
        if(!added){
            worldMaster.addWorld(4, this);
            added = true;
            worldMaster.getWorlds().get(4).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomSix());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            //addObject(new teleporter(worldMaster.getWorlds().get(2),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
    }
    public String toString(){
        return "Room Five";
    }
}
