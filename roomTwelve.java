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
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(11, this);
            added = true;
            worldMaster.getWorlds().get(11).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomThirteen());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 500, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 250, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(4),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        addObject(new door("bottomDoor.PNG"), 375, 725);
        for(int i = 0; i < 5; i++){ //N
                addObject(new teleporter(worldMaster.getWorlds().get(5),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 375, 25);
        addObject(new hallwayBorder(), 125, 375);
        addObject(new hallwayBorder(), 625, 375);
    }
    public String toString(){
        return "Room Twelve";
    }
}
