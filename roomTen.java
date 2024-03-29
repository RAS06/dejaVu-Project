import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomTen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomTen extends World
{
    private static boolean added = false;
    /**
     * Constructor for objects of class roomTen.
     * 
     */
    public roomTen()
    {    
        super(750, 750, 1); 
        if(!added){
            worldMaster.addWorld(9, this);
            added = true;
            worldMaster.getWorlds().get(9).addObject(new champion(), 375, 700);
            Greenfoot.setWorld(new roomEleven());
        }
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 450);
        }
        for(int i = 0; i < 5; i++){ //N
            addObject(new teleporter(worldMaster.getWorlds().get(14),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        addObject(new door("topDoor.PNG"), 375, 25);
        addObject(new hints("roomTenKeyHint.jpg"), 375, 600);
    }
    public String toString(){
        return "Room Ten";
    }
}
