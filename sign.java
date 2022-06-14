import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sign here.
 * 
 * @Riz 
 * @0.0.1
 */
public class sign extends Actor
{
    /**
     * Act - do whatever the sign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String image;
    public void act()
    {
        setLocation(champion.getChampX(), champion.getChampY() - 80);
    }
    public sign(String filename) {
        setImage(filename);
    }
}
