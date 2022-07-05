import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class colorPuzzleSubmit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class colorPuzzleSubmit extends Actor
{
    /**
     * Act - do whatever the colorPuzzleSubmit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean completed = false;
    public void act()
    {
        testForCorrect();
    }
    public colorPuzzleSubmit(){setImage("submitButton.jpg");}
    public void testForCorrect(){
        if(Greenfoot.mouseClicked(this)){
            if(colorPuzzleQueryMaster.getSolution().size() == colorPuzzleQueryMaster.getInput().size()){
                boolean failed = false;
                for(int i = 0; i < colorPuzzleQueryMaster.getSolution().size(); i++){
                    if(!colorPuzzleQueryMaster.getSolution().get(i).equals(colorPuzzleQueryMaster.getInput().get(i))){
                        failed = true;
                    }
                }
                if(!(failed || completed)){
                    worldMaster.getWorlds().get(7).addObject(new shard(), 375, 375);
                    completed = true;
                    worldMaster.getWorlds().get(16).addObject(new chatDialougeQuerySelector(7), 375, 375);
                }
            }
            colorPuzzleQueryMaster.clearInput();
        }
    }
    
}
