import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trueDial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dial extends Actor
{
    /**
     * Act - do whatever the trueDial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int id;
    public void act()
    {
        spin();
    }
    public dial(int initID){
        this.setImage("karo.png");
        id = initID;
    }
    public void spin(){
        if(Greenfoot.isKeyDown("right") && dialMaster.requestInputFromDial() == this.id){
            this.setRotation(this.getRotation() - 5);
        }  
        if(Greenfoot.isKeyDown("left") && dialMaster.requestInputFromDial() == this.id){
            this.setRotation(this.getRotation() + 5);
        }
    }
}
