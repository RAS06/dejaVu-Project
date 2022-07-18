import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialMaster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialMaster extends Actor
{
    /**
     * Act - do whatever the dialMaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int target;
    public void act()
    {
        selectDials();
        requestInputFromDial();
    }
    public void selectDials(){
        if(Greenfoot.isKeyDown("1")){
            target = 1;
        }
        if(Greenfoot.isKeyDown("2")){
            target = 2;
        }
        if(Greenfoot.isKeyDown("3")){
            target = 3;
        }
    }
    public static int requestInputFromDial(){
        return target;
    }
}
