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
        addObject(new champion(), 375, 700);
        showText("roomEight", 300, 500);
        if(!added){
            worldMaster.addWorld(7, this);
            added = true;
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
        addObject(new door("door(Top).png"), 50, 375);
        for(int i = 0; i < 5; i++){ //E
                addObject(new teleporter(worldMaster.getWorlds().get(8),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        addObject(new door("door(Top).png"), 700, 375);
        addObject(new rose(), 700, 700);
    }
    public String toString(){
        return "Room Eight";
    }
}
