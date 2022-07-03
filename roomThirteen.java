import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomThirteen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomThirteen extends World
{

    /**
     * Constructor for objects of class roomThirteen.
     * 
     */
    private static boolean added = false;
    public roomThirteen()
    {    
        super(750, 750, 1); 
        addObject(new champion(), 375, 700);
        showText("roomThirteen", 125, 500);
        if(!added){
            worldMaster.addWorld(12, this);
            added = true;
            worldMaster.getWorlds().get(12).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomThirteenAndAHalf());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){ //N
                addObject(new teleporter(worldMaster.getWorlds().get(4),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 375, 25);
        for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(13),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        addObject(new door("bottomDoor.PNG"), 375, 725);
        addObject(new chatDialougeQuerySelector(4), 375, 600);
    }
    public String toString(){
        return "Room Thirteen";
    }
}
