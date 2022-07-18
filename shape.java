import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shape extends Actor
{
    /**
     * Act - do whatever the shape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int idShape;
    public void act()
    {
        spin();
    }
    public shape(int initID){
        this.setImage("karo.png");
        idShape = initID;
    }
    public void spin(){
        if(Greenfoot.isKeyDown("right") && dialMaster.requestInputFromDial() == this.idShape){
            this.setRotation(this.getRotation() + 5);
        }  
        if(Greenfoot.isKeyDown("left") && dialMaster.requestInputFromDial() == this.idShape){
            this.setRotation(this.getRotation() - 5);
        }
    }
}
