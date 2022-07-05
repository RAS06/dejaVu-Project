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
    public teleporter(World targetLocation, String image){
        target = targetLocation;
        this.setImage(image);
        dir = image;
    }
    public void teleport(){
        if(this.isTouching(champion.class)){
            Greenfoot.setWorld(target);
            if(dir.equals("horizBorderControl.png")){
                for(Actor a: target.getObjects(champion.class)){
                    int toMiddle;
                    if(champion.getChampY() < 300){toMiddle = -50;} else { toMiddle = 50;}
                    
                    a.setLocation(champion.getChampX(), target.getHeight() - champion.getChampY() + toMiddle);
                }
            } else {
                for(Actor a: target.getObjects(champion.class)){
                    int toMiddle;
                    if(champion.getChampX() < 300){toMiddle = -50;} else { toMiddle = 50;}
                    
                    a.setLocation(target.getWidth() - champion.getChampX() + toMiddle, champion.getChampY());
                }
            }
        }
    }
    /* 
    Teleporation gates, where "x" is the assigned number of the world on the Miro Board minus 1. 
       North Gate:
            for(int i = 0; i < 5; i++){ //N
                addObject(new teleporter(worldMaster.getWorlds().get(x),"horizBorderControl.png"), 275 + 30 * i, 50);
            }
       South Gate:
            for(int i = 0; i < 5; i++){ //S
                addObject(new teleporter(worldMaster.getWorlds().get(x),"horizBorderControl.png"), 275 + 30 * i, 700);
            }
       East Gate:
            for(int i = 0; i < 5; i++){ //E
                addObject(new teleporter(worldMaster.getWorlds().get(x),"vertBorderControl.png"), 700, 250 + 30 * i);
            }
       West Gate:
            for(int i = 0; i < 5; i++){ //W
                addObject(new teleporter(worldMaster.getWorlds().get(x),"vertBorderControl.png"), 50, 250 + 30 * i);
            }
    */
}
