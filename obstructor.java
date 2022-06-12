import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstructor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstructor extends Actor
{
    private String wall;
    private int potency;
    public void act()
    {
        
    }
    public obstructor(String side, int initPotency) {
        wall = side;
        potency = initPotency;
    }
    public obstructor(String side){
        wall = side;
        potency = 1;
    }
    public void obstruct(){
        if(this.isTouching(champion.class)){
            if(wall.equals("left")){
                
            }
        }
    }
}
