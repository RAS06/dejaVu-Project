import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class champion here.
 * @Riz
 * @0.0.1
 */
public class champion extends Actor
{
    /**
     * Act - do whatever the champion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public static boolean gotKey = false;
        private static boolean locked = false;
        private boolean noLongerTouching = false;
        private static boolean unlockedDoor = false; 
        private static int currX;
        private static int currY;
        private static int xVelocity;
        private static int yVelocity;
        private int movementTick;
        private static int shardCount;
    
    public void act()
    {
        if(!locked) {
            move();
        }
        
        //<Dev Controls>
        if(Greenfoot.isKeyDown("u")){showTheMap();}
        if(Greenfoot.isKeyDown("r") && Greenfoot.isKeyDown("=")){resetTheMap();}
        if(Greenfoot.isKeyDown("p")){System.out.println("gotKey? " + gotKey +" unlockedDoor? " + unlockedDoor);}
        if(Greenfoot.isKeyDown("l")){unlockChampion();}
        //</Dev Controls>
        
        interact();
        recordLocation();
        //Used to move the champion from another class. 
        moveChampion();
    }
    //Make sure to add the !locked conditional when moving the champion for text cutscenes.
    public champion() {movementTick = 0;}
    public void move() {
        //Images in the format of:"[foot raised][Cardinal Direction Champion Moves]"
        if(Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - 3);
            if(movementTick == 10 || movementTick == 20){
                this.setImage("neutralNorth.PNG");
            }
            if(movementTick == 5){
                this.setImage("leftNorth.PNG");
            }
            if(movementTick == 15){
                this.setImage("rightNorth.PNG");
            }
        }
        if(Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + 3);
            if(movementTick == 10 || movementTick == 20){
                this.setImage("neutralSouth.PNG");
            }
            if(movementTick == 5){
                this.setImage("leftSouth.PNG");
            }
            if(movementTick == 15){
                this.setImage("rightSouth.PNG");
            }
        }
        if(Greenfoot.isKeyDown("a")) {
            this.setLocation(this.getX() - 3, this.getY());
            if(movementTick == 10 || movementTick == 20){
                this.setImage("neutralWest.PNG");
            }
            if(movementTick == 5){
                this.setImage("leftWest.PNG");
            }
            if(movementTick == 15){
                this.setImage("rightWest.PNG");
            }
        }
        if(Greenfoot.isKeyDown("d")) {
            this.setLocation(this.getX() + 3, this.getY());
            if(movementTick == 10 || movementTick == 20){
                this.setImage("neutralEast.PNG");
            }
            if(movementTick == 5){
                this.setImage("leftEast.PNG");
            }
            if(movementTick == 15){
                this.setImage("rightEast.PNG");
            }
        }
        movementTick++;
        //System.out.println(worldMaster.getWorlds() + "   " + worldMaster.getWorlds().size());
        if(movementTick >= 21){movementTick = 0;}
    }
    public void interact(){
        if(this.isTouching(key.class) && Greenfoot.isKeyDown("e")){
            this.removeTouching(key.class);
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            gotKey = true;
            System.out.println(gotKey);
            this.getWorld().addObject(new chatDialougeQuerySelector(1), 375, 600);
            
            if(gotKey && !unlockedDoor){
                unlockedDoor = true;
                for(int i = 0; i < 5; i++){ 
                        worldMaster.getWorlds().get(2).addObject(new teleporter(worldMaster.getWorlds().get(3),"vertBorderControl.png"), 50, 250 + 30 * i);
                        worldMaster.getWorlds().get(2).removeObjects(worldMaster.getWorlds().get(2).getObjects(lock.class));
                }
            }
            
        }
        
    }
    public void recordLocation(){
        currX = this.getX();
        currY = this.getY();
    }
    
    public static int getChampX() {return currX;}
    public static int getChampY() {return currY;}
    public static boolean haveKey() {return gotKey;}
    public static int getXVel() {return xVelocity;}
    public static int getYVel() {return yVelocity;}
    
    //Move this.champion from another class.
    public void moveChampion() {
        setLocation(getX() + xVelocity, getY() + yVelocity);
    } 
    public void showTheMap(){
        System.out.println(worldMaster.getWorlds());
    }
    public void resetTheMap(){
        gotKey = false;
        unlockedDoor = false;
        shardCount = 0;
        Greenfoot.setWorld(new roomOne());
    }
    public static void lockChampion(){locked = true;}
    public static void unlockChampion(){locked = false;}
}
