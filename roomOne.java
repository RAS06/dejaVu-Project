import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @Riz 
 * @0.0.1
 */
public class roomOne extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public roomOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        addObject(new champion(), 200, 200);
        addObject(new key(), 500, 500);
        
        for(int i = 0; i < 700; i++){
            addObject(new obstructor("left"), 0, i);
        }
    }
}
