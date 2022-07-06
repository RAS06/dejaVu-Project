import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class furnace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class furnace extends interactable
{
    /**
     * Act - do whatever the furnace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean retrieved = false;
    public void act()
    {
        interact();
    }
    public static void setRetrieved(){retrieved = true;}
    public static void reset(){retrieved = false;}
}
