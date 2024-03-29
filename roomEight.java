import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomEight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomEight extends World
{
    /**
     * Constructor for objects of class roomEight.
     * 
     */
    private static boolean added = false;
    public roomEight()
    {    
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(7, this);
            added = true;
            addObject(new rose(), 600, 700);
            worldMaster.getWorlds().get(7).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomNine());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //W
                addObject(new teleporter(worldMaster.getWorlds().get(4),"vertBorderControl.png"), 50, 250 + 30 * i);
        }
        addObject(new door("leftSideDoor.PNG"), 70, 375);
        for(int i = 0; i < 5; i++){ //E
                addObject(new teleporter(worldMaster.getWorlds().get(8),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        addObject(new door("rightSideDoor.PNG"), 680, 375);
        addObject(new terminal(worldMaster.getWorlds().get(16)), 600, 150);
    }
    public String toString(){
        return "Room Eight";
    }
}
