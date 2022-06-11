import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class key extends interactable
{
    private static boolean used = false; 
    public void act()
    {
        interact();
    }
    public key(){}
    public void interact(){
        if(this.isTouching(champion.class)){
            this.getWorld().addObject(new sign("eToInteractSign.png"), champion.getChampX(), champion.getChampY() - 80);
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
