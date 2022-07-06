import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class statue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class statue extends interactable
{
    /**
     * Act - do whatever the statue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        interact();
    }
    public statue(){}
    public void interact(){
    if(this.isTouching(champion.class) && champion.hasFlower){
            this.getWorld().addObject(new sign("eToInteractSign.png"), champion.getChampX(), champion.getChampY() - 80);
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
