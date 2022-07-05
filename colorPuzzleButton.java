import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class colorPuzzleButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class colorPuzzleButton extends Actor
{
    /**
     * Act - do whatever the colorPuzzleButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String color;
    public void act()
    {
        checkForPress();
    }
    public colorPuzzleButton(String image, String returnPhrase){setImage(image); color = returnPhrase;}
    public void checkForPress(){
        if(Greenfoot.mouseClicked(this)){
            colorPuzzleQueryMaster.addInput(color);
        }
    }
}
