import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class interactable here.
 * 
 * @Riz 
 * @0.0.1
 */
public class interactable extends Actor
{
    /**
     * Act - do whatever the interactable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        interact();
    }
    public interactable(){}
    public void interact(){
    if(this.isTouching(champion.class)){
            this.getWorld().addObject(new sign("eToInteractSign.png"), champion.getChampX(), champion.getChampY() - 80);
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
