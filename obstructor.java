import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstructor here.
 * 
 * @Riz  
 * @0.0.1
 */
public class obstructor extends Actor
{
    private String wall;
    private int potency;
    public void act()
    {
        obstruct();
    }
    public obstructor(String side, String image, int initPotency) {
        wall = side;
        potency = initPotency;
        this.setImage(image);
    }
    public obstructor(String side, String image){
        wall = side;
        potency = 3;
        this.setImage(image);
    }
    public void obstruct(){
        if(this.isTouching(champion.class)){
            if(wall.equals("right")){
                for(Actor a: this.getWorld().getObjects(champion.class)){
                a.setLocation(champion.getChampX() - potency, champion.getChampY());
                }
            }else if(wall.equals("left")){
                for(Actor a: this.getWorld().getObjects(champion.class)){
                a.setLocation(champion.getChampX() + potency, champion.getChampY());
                }
            }else if(wall.equals("top")){
                for(Actor a: this.getWorld().getObjects(champion.class)){
                a.setLocation(champion.getChampX(), champion.getChampY() + potency);
                }
            } else if(wall.equals("bottom")){
                for(Actor a: this.getWorld().getObjects(champion.class)){
                a.setLocation(champion.getChampX() , champion.getChampY() - potency);
                }
            }
            /*
             *    Yuj and/or Ray,
             *   If either of you decide to review this code and see the
             * above monstrocity and inquire as to what led to this situation,
             * the reason that the colision mechanics ended up being so complicated
             * is because the world constructor that we stole uses a void return method
             * to add objects to the world. You obviously know that this creates a problem
             * for us in that we can no longer use pointer/reference variables.
             * Those aspects created the above situation, where I was required to use
             * an enhanced for-each loop just to have a motherfucking reference variable.
             * The mechanism above retrieves an ArrayList of one whole champion 
             * object and changes it's location. The reason that the potency value of 
             * the obstructers (yes I know I spelled it wrong the first ten times) is
             * because each obstructer object is a 1x1 transparent pixel, which means that 
             * the Champion is in contact with a stupid number of obstructers
             * whenever it hits a wall. Don't mind the overloaded constructor. That's just
             * in case we wanna fuck around later with some bounciness business.
             *
             *    The following is just a model for the mechanism that I created while debugging that
             * I wanted to keep for reference later in case things get funky with some other issues.
             *
             *
             *for(Actor a: this.getWorld().getObjects(champion.class)){
             *   a.setLocation(champion.getChampX() +/- potency, champion.getChampY() +/- potency);
             *}
             * 
             */
        }
        //Never before have I regretted my decision to study Computer Science so much.
        //The previous statement is not true.
        //The following statement is also not true.
        //Potato Pancake.
        //...
        //It's very late.
    }
}
