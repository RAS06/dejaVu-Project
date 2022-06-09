import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class champion here.
 * @Riz
 * @0.0.1
 */
public class champion extends Actor
{
    /**
     * Act - do whatever the champion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        private static boolean locked = false;
    public void act()
    {
        if(!locked) {
            move();
        }
    }
    //Make sure to add the !locked conditional when moving the champion for text cutscenes.
    public champion() {}
    public void move() {
        if(Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY() - 1);
        }
        if(Greenfoot.isKeyDown("down")) {
            this.setLocation(this.getX(), this.getY() + 1);
        }
        if(Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - 1, this.getY());
        }
        if(Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + 1, this.getY());
        }
    }
    }
