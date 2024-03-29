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
        for(int i = 0; i < 5; i++){ //W
            addObject(new teleporter(worldMaster.getWorlds().get(2),"vertBorderControl.png"), 50, 250 + 30 * i);
        }
        addObject(new door("leftSideDoor.PNG"), 70, 375);
        for(int i = 0; i < 5; i++){ //E
            addObject(new teleporter(worldMaster.getWorlds().get(7),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        addObject(new door("rightSideDoor.PNG"), 680, 375);
        for(int i = 0; i < 5; i++){ //N
            addObject(new teleporter(worldMaster.getWorlds().get(11),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 375, 25);
        for(int i = 0; i < 5; i++){ //S
            addObject(new teleporter(worldMaster.getWorlds().get(12),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        addObject(new door("bottomDoor.PNG"), 355, 720);
        addObject(new terminal(worldMaster.getWorlds().get(15)), 600, 150);
    }
    public String toString(){
        return "Room Five";
    }
}
