import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomSix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomSix extends World
{

    /**
     * Constructor for objects of class roomSix.
     * 
     */
    private static boolean added = false;
    public roomSix()
    {    
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(5, this);
            added = true;
            worldMaster.getWorlds().get(5).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomSeven());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(11),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        addObject(new door("bottomDoor.PNG"), 375, 725);
        for(int i = 0; i < 5; i++){ //W
                addObject(new teleporter(worldMaster.getWorlds().get(6),"vertBorderControl.png"), 50, 250 + 30 * i);
        }
        addObject(new door("leftSideDoor.PNG"), 70, 375);
    }
    public String toString(){
        return "Room Six";
    }
}
