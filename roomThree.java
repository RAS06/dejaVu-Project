import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomThree extends World
{
    private static boolean added = false;
    /**
     * Constructor for objects of class roomThree.
     * 
     */
    public roomThree()
    {    
        super(750, 750, 1); 
        addObject(new champion(), 375, 700);
        showText("roomThree", 300, 500);
        if(!added){
            worldMaster.addWorld(2, this);
            added = true;
            worldMaster.getWorlds().get(2).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomFour());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(1),"horizBorderControl.png"), 275 + 30 * i, 710);
        }
        addObject(new door("door(Top).png"), 375, 700);
        for(int i = 0; i < 5; i++){ //Lock this door. 
            addObject(new teleporter(worldMaster.getWorlds().get(3),"vertBorderControl.png"), 50, 250 + 30 * i);
        }
        addObject(new door("door(Top).png"), 50, 375);
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldMaster.getWorlds().get(4),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        addObject(new door("door(Top).png"), 700, 375);
    }
    public String toString(){
        return "Room Three";
    }
}
