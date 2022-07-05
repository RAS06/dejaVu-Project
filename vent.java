import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vent extends interactable
{
    /**
     * Act - do whatever the vent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World target;
    public void act()
    {
        interact();
    }
    public vent(World initTarget){
        setImage("vent.jpg");
        target = initTarget;
    }
    public void interact(){
        if(this.isTouching(champion.class)){
            this.getWorld().addObject(new sign("pressEToBeSus.png"), champion.getChampX(), champion.getChampY() - 80);
            if(Greenfoot.isKeyDown("e")){
                Greenfoot.setWorld(target);
                for(Actor a: target.getObjects(champion.class)){ 
                    a.setLocation(375, 375);
                }
            }
        } else {
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
        }
    }
}
