import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lock extends Actor
{
    /**
     * Act - do whatever the lock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        blockPlayer();
    }
    public lock(){
        this.setImage("vertBorderControl.png");
    }
    public void blockPlayer(){
        if(this.isTouching(champion.class)){
            this.getWorld().addObject(new sign("doorIsLocked.png"), champion.getChampX() + 120, champion.getChampY());
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
