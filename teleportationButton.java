import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teleportationButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teleportationButton extends Actor
{
    /**
     * Act - do whatever the teleportationButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World target;
    public void act()
    {
        if(Greenfoot.isKeyDown("b")){
            Greenfoot.setWorld(target);
            champion.locked = false;
        }
    }
    public teleportationButton(String filename, World initTarget){setImage(filename); target = initTarget;}
}
