import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roomThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roomThree extends World
{
    private static boolean added = false;
    /**
     * Constructor for objects of class roomThree.
     * 
     */
    public roomThree()
    {    
        super(750, 750, 1); 
        worldMaster w = new worldMaster();
        if(!added){
            w.addWorld(1, this);
            added = true;
            Greenfoot.setWorld(w.getWorlds().get(0));
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(w.getWorlds().get(1),"horizBorderControl.png", 375, 720), 275 + 30 * i, 725);
        }
    }
}
