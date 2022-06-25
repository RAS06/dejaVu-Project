import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomTwelve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomTwelve extends World
{
    private static boolean added = false;
    /**
     * Constructor for objects of class roomTwelve.
     * 
     */
    public roomTwelve()
    {    
        super(250, 750, 1); 
        addObject(new champion(), 375, 700);
        showText("roomTwelve", 125, 500);
        if(!added){
            worldMaster.addWorld(11, this);
            added = true;
            worldMaster.getWorlds().get(11).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomThirteen());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(4),"horizBorderControl.png"), 0 + 30 * i, 700);
        }
        for(int i = 0; i < 5; i++){ //N
                addObject(new teleporter(worldMaster.getWorlds().get(5),"horizBorderControl.png"), 0 + 30 * i, 50);
        }
    }
    public String toString(){
        return "Room Twelve";
    }
}
