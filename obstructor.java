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
        obstruct();
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
                this.getWorldOfType(champion.class).setLocation(this.getWorldOfType(champion.class).getChampX() + 3, this.getWorldOfType(champion.class).getChampY());
            }else if(wall.equals("right")){
                this.getWorldOfType(champion.class).setLocation(this.getWorldOfType(champion.class).getChampX() - 3, this.getWorldOfType(champion.class).getChampY());
            }else if(wall.equals("up")){
                this.getWorldOfType(champion.class).setLocation(this.getWorldOfType(champion.class).getChampX(), this.getWorldOfType(champion.class).getChampY() + 3); 
            } else if(wall.equals("down")){
                this.getWorldOfType(champion.class).setLocation(this.getWorldOfType(champion.class).getChampX(), this.getWorldOfType(champion.class).getChampY() - 3);
            }
        }
        //Never before have I regretted my decision to study Computer Science so much.
        //The previous statement is not true.
        //The following statement is also not true.
        //Potato Pancake.
    }
}
