import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class worldMaster here.
 * 
 * @Riz 
 * @0.0.1
 */
public class worldMaster extends Actor
{
    /**
     * Act - do whatever the worldMaster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static ArrayList<World> worlds = new ArrayList<World>();
    public void act()
    {
        //
    }
    public worldMaster(){
        
    }
    //This class exists to organize world scenarios in hopes of avoiding the bullshit NullPointerException errors that I've been getting.
    //That are definitely not on account of me being a nuub programmer or whatever.
    //100% not Riz's fault. 
    public static void controlAndRecord(){
        
    }
    public static void addWorld(int pos, World w){
        worlds.add(pos, w);
    }
    public static ArrayList<World> getWorlds(){
        return worlds;
    }  
}
