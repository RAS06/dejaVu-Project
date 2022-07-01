import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class terminal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class terminal extends interactable
{
    /**
     * Act - do whatever the terminal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World target;
    public void act()
    {
        interact();
        sendToWorld();
    }
    public terminal(World initTarget){setImage("terminal.png"); target = initTarget;}
    public void sendToWorld(){
        if(this.isTouching(champion.class) && Greenfoot.isKeyDown("e")){Greenfoot.setWorld(target);}
    }
}
