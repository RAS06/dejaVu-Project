import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class chatDialougeQuerySelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chatDialougeQuerySelector extends Actor
{
    /**
     * Act - do whatever the chatDialougeQuerySelector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int form;
    private int currTargetDisplay = 0;
    private boolean justPressed = false;
    public void act()
    {
        showQuery();
    }
    public chatDialougeQuerySelector(int formIn){form = formIn; setImage("debugTesterImage.png");}
    public void showQuery(){
            //I think there is a much better way of doing this...
            //Maybe I'll do it later. 
        if(form == 1){       
            champion.lockChampion();
            ArrayList<String> query = new ArrayList<String>();
            query.add("youGotAKey.jpg");
            query.add("iDontHaveToTellYouThat.jpg");
            query.add("youLookStupid.jpg");
            int queryNumber = query.size();
            if(currTargetDisplay < queryNumber){
                setImage(query.get(currTargetDisplay));
            } else{
                champion.unlockChampion();
                this.getWorld().removeObject(this);
            }
        }
        if(form == 2){
            champion.lockChampion();
            ArrayList<String> query = new ArrayList<String>();
            query.add("youFoundARose.jpg");
            int queryNumber = query.size();
            if(currTargetDisplay < queryNumber){
                setImage(query.get(currTargetDisplay));
            } else{
                champion.unlockChampion();
                this.getWorld().removeObject(this);
            }
        }
        if(form == 3){
            champion.lockChampion();
            ArrayList<String> query = new ArrayList<String>();
            
             int queryNumber = query.size();
            if(currTargetDisplay < queryNumber){
                setImage(query.get(currTargetDisplay));
            } else{
                champion.unlockChampion();
                this.getWorld().removeObject(this);
            }
        }
        if(form == 4){
            champion.lockChampion();
            ArrayList<String> query = new ArrayList<String>();
            
             int queryNumber = query.size();
            if(currTargetDisplay < queryNumber){
                setImage(query.get(currTargetDisplay));
            } else{
                champion.unlockChampion();
                this.getWorld().removeObject(this);
            }
        }
        if(form == 5){
            champion.lockChampion();
            ArrayList<String> query = new ArrayList<String>();
            
             int queryNumber = query.size();
            if(currTargetDisplay < queryNumber){
                setImage(query.get(currTargetDisplay));
            } else{
                champion.unlockChampion();
                this.getWorld().removeObject(this);
            }
        }
        if(Greenfoot.isKeyDown("space") && !justPressed){
            justPressed = true;
            currTargetDisplay++;
        } else if(!Greenfoot.isKeyDown("space")){justPressed = false;}
    }
}
