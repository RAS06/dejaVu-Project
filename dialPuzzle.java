import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialPuzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialPuzzle extends World
{

    /**
     * Constructor for objects of class dialPuzzle.
     * 
     */
    private static boolean added = false;
    private int selectNum = 1;
    public dialPuzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        if(!added){
            worldMaster.addWorld(15, this);
            added = true;
            Greenfoot.setWorld(new colorPuzzle());
        }
        addObject(new dial(), 150, 300);
        addObject(new dial2(), 350, 300);
        addObject(new dial3(), 550, 300);
        //prepare();
        addObject(new teleportationButton("pressBToGoBack.png", worldMaster.getWorlds().get(4)), 600, 725);
    }
    public String toString(){
        return "Dial Puzzle";
    }
    public void setSelect1(){ 
        selectNum = 1;
    }
    public void setSelect2(){ 
        selectNum = 2;
    }
    public void setSelect3(){ 
        selectNum = 3;
    }
    public int getSelect(){
        return selectNum;
    }
    }
}