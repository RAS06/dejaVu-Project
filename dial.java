import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dial extends Actor
{
    /**
     * Act - do whatever the dial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            if(dialPuzzle.getSelect == 1){
                turnRight();
            }   
        }
        if(Greenfoot.isKeyDown("left")){
            if(dialPuzzle.getSelect == 1){
                turnLeft();
            }   
        }
    }
    public void turnLeft()
    {
        setRotation(getRotation() - 5);
    }
    public void turnRight()
    {
        setRotation(getRotation() + 5);
    }
    }
}