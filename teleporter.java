import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teleporter here.
 * 
 * @Riz 
 * @0.0.1
 */
public class teleporter extends Actor
{
    /**
     * Act - do whatever the teleporter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World target;
    private int x;
    private int y;
    String dir;
    public void act()
    {
        teleport();
    }
    public teleporter(World targetLocation, String image, int moveToX, int moveToY){
        target = targetLocation;
        this.setImage(image);
        dir = image;
    }
    public void teleport(){
        if(this.isTouching(champion.class)){
            Greenfoot.setWorld(target);
            if(dir.equals("horizBorderControl.png")){
                for(Actor a: target.getObjects(champion.class)){
                    a.setLocation(champion.getChampX(), target.getHeight() - champion.getChampY());
                }
            } else {
                for(Actor a: target.getObjects(champion.class)){
                    a.setLocation(target.getWidth() - champion.getChampX(), champion.getChampY());
                }
            }
        }
    }
}
