import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomNine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomNine extends World
{

    /**
     * Constructor for objects of class roomNine.
     * 
     */
    private static boolean added = false;
    public roomNine()
    {    
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(8, this);
            added = true;
            Greenfoot.setWorld(new roomTen());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //W
                addObject(new teleporter(worldMaster.getWorlds().get(7),"vertBorderControl.png"), 50, 250 + 30 * i);
        }
        addObject(new door("leftSideDoor.PNG"), 70, 375);
        addObject(new vent(worldMaster.getWorlds().get(0)), 375, 700);
        addObject(new statue(), 375, 200);
        worldMaster.getWorlds().get(8).addObject(new champion(), 375, 700);
    }
    public String toString(){
        return "Room Nine";
    }
}
