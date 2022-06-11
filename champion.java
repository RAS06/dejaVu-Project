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
        private boolean locked = false;
        private boolean noLongerTouching = false;
        private static int currX;
        private static int currY;
        private static boolean gotKey = false;
    
    public void act()
    {
        if(!locked) {
            move();
        }
        interact();
        recordLocation();
    }
    //Make sure to add the !locked conditional when moving the champion for text cutscenes.
    public champion() {}
    public void move() {
        if(Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - 3);
        }
        if(Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + 3);
        }
        if(Greenfoot.isKeyDown("a")) {
            this.setLocation(this.getX() - 3, this.getY());
        }
        if(Greenfoot.isKeyDown("d")) {
            this.setLocation(this.getX() + 3, this.getY());
        }
    }
    public void interact(){
        if(this.isTouching(key.class) && Greenfoot.isKeyDown("e")){
            this.removeTouching(key.class);
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            gotKey = true;
        }
    }
    public void recordLocation(){
        currX = this.getX();
        currY = this.getY();
    }
    public static int getChampX() {return currX;}
    public static int getChampY() {return currY;}
    public static boolean haveKey() {return gotKey;}
}
