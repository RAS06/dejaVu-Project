import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class queryTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class queryTracker extends Actor
{
    /**
     * Act - do whatever the queryTracker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static ArrayList<String> query = new ArrayList<String>();
    public static String nextQueryIn;
    public static int timer;
    public static int i = 0;
    public void act()
    {
        if(i < query.size() + 2){
        watch();
        }
        if(Greenfoot.isKeyDown(";")){i = 0;}
    }
    public queryTracker(){
        query.add("w");
        query.add("w");
        query.add("s");
        query.add("s");
        query.add("d");
        query.add("a");
        query.add("s");
        query.add("s");
        query.add("a");
        query.add("d");
        query.add("w");
        query.add("s");
        i = 0;
        timer = 150;
    }
    public void watch(){
        if(i < query.size()){
            nextQueryIn = query.get(i);
        }
        if(Greenfoot.isKeyDown(nextQueryIn)){
            i++;
            timer = 150;
        }
        if (timer < 1){
            i = 0;
        }
        if(i > query.size()){
            for(int j = 0; j < 5; j++){
                worldMaster.getWorlds().get(13).addObject(new teleporter(worldMaster.getWorlds().get(10),"vertBorderControl.png"), 500, 0 + 30 * i);
            }
            worldMaster.getWorlds().get(13).addObject(new door("rightSideDoor.PNG"), 500, 375);
        }
        
        timer--;
        //System.out.println("timer: " + timer + " i: " + i);
    }
}
