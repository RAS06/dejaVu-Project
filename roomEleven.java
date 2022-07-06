import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomEleven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomEleven extends World
{

    /**
     * Constructor for objects of class roomEleven.
     * 
     */
    private static boolean added = false;
    public roomEleven()
    {    
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(10, this);
            added = true;
            worldMaster.getWorlds().get(10).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomTwelve());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //W
                addObject(new teleporter(worldMaster.getWorlds().get(13),"vertBorderControl.png"), 90, 40 + 30 * i);
        }
        addObject(new door("leftSideDoor.PNG"), 70, 120);
        addObject(new shard(), 375, 375);
        addObject(new book(), 75, 500);
    }
    public String toString(){
        return "Room Eleven";
    }
}
