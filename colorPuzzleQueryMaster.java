import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; 

/**
 * Write a description of class colorPuzzleQueryComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class colorPuzzleQueryMaster extends Actor
{
    /**
     * Act - do whatever the colorPuzzleQueryComparator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static ArrayList<String> solution = new ArrayList<String>(Arrays.asList("red", "blue", "green", "yellow"));
    public static ArrayList<String> input = new ArrayList<String>();
    
    public void act()
    {
        
    }
    public colorPuzzleQueryMaster(){
        
    }
    public static void addInput(String colorIn){
        input.add(colorIn);
    }
    public static ArrayList<String> getSolution(){return solution;}
    public static ArrayList<String> getInput(){return input;}
    public static void clearInput(){input.clear();}
}
