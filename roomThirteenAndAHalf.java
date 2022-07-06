import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomThirteenAndAHalf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomThirteenAndAHalf extends World
{

    /**
     * Constructor for objects of class roomThirteenAndAHalf.
     * 
     */
    private static boolean added = false;
    public roomThirteenAndAHalf()
    {    
        super(750, 750, 1); 
        addObject(new queryTracker(), 10, 10);
        if(!added){
            worldMaster.addWorld(13, this);
            added = true;
            worldMaster.getWorlds().get(13).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomThirteenAndThreeQuarters());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 500, i * 30);
            addObject(new obstructor("right", "vertBorderControl.png"), 550, i * 30);
            addObject(new obstructor("right", "vertBorderControl.png"), 600, i * 30);
            addObject(new obstructor("right", "vertBorderControl.png"), 650, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 250, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //N
                addObject(new teleporter(worldMaster.getWorlds().get(12),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 375, 25);
        for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(14),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        addObject(new door("bottomDoor.PNG"), 375, 725);
        for(int i = 0; i < 5; i++){ //E
                //addObject(new teleporter(worldMaster.getWorlds().get(10),"vertBorderControl.png"), 200, 250 + 30 * i);
        }
        addObject(new hallwayBorder(), 125, 375);
        addObject(new hallwayBorder(), 625, 375);
        addObject(new chatDialougeQuerySelector(5), 375, 600);
    }
    public String toString(){
        return "Room ThirteenAndAHalf";
    }
}
