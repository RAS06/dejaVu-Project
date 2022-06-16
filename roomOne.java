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
    //public static World worldOne = getWorld();
    public static World worldTwo = new roomTwo();
    public roomOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        addObject(new champion(), 200, 200);
        addObject(new key(), 500, 500);
        showText("roomOne", 500, 500);
        
        for(int i = -1; i < 25; i++){
            addObject(new obstructor("right", "vertBorderControl.png"), 720, i * 30);
            addObject(new obstructor("left", "vertBorderControl.png"), 30, i * 30);
            addObject(new obstructor("top", "horizBorderControl.png"), i * 30, 30);
            addObject(new obstructor("bottom", "horizBorderControl.png"), i * 30, 720);
        }
        for(int i = 0; i < 5; i++){
            addObject(new teleporter(worldTwo,"horizBorderControl.png", 375, 720), 275 + 30 * i, 50);
        }
    }
}
