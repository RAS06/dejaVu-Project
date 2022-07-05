import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rose extends interactable
{
    /**
     * Act - do whatever the rose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        interact();
    }
    public void interact(){
        if(this.isTouching(champion.class)){
            this.getWorld().addObject(new sign("eToInteractSign.png"), champion.getChampX(), champion.getChampY() - 80);
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
