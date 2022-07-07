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
        public static int shardCount;
        public static boolean locked = false;
        public static boolean hasFlower = false;
        public static boolean started = false;
        public static int gameClock;
        private boolean noLongerTouching = false;
        private static boolean unlockedDoor = false; 
        private static int currX;
        private static int currY;
        private static int xVelocity;
        private static int yVelocity;
        private int movementTick;
    
    public void act()
    {
        if(!started){
            Greenfoot.setWorld(new expositionWorld());
        }
        if(!locked) {
            move();
        }
        
        //<Dev Controls>
        if(Greenfoot.isKeyDown("u")){showTheMap();}
        if(Greenfoot.isKeyDown("r") && Greenfoot.isKeyDown("=")){resetMap();}
        if(Greenfoot.isKeyDown("p")){System.out.println("gotKey? " + gotKey +" unlockedDoor? " + unlockedDoor);}
        if(Greenfoot.isKeyDown("l")){unlockChampion(); this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));}
        //</Dev Controls>
        
        interact();
        recordLocation();
        //Used to move the champion from another class. 
        moveChampion();
        gameClock++;
        //System.out.println("Ticks: " + gameClock);
        if(gameClock > 12000){
            resetMap();
        }
        if(shardCount >= 5){Greenfoot.setWorld(new victoryWorld());}
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
        if(this.isTouching(shard.class) && Greenfoot.isKeyDown("e")){
            this.removeTouching(shard.class);
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            shardCount++;
            this.getWorld().addObject(new chatDialougeQuerySelector(3), 375, 375);
        }
        if(this.isTouching(rose.class) && Greenfoot.isKeyDown("e")){
            this.removeTouching(rose.class);
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            hasFlower = true;
            this.getWorld().addObject(new chatDialougeQuerySelector(2), 375, 375);
        }
        if(this.isTouching(statue.class) && Greenfoot.isKeyDown("e") && hasFlower){
            this.removeTouching(statue.class);
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            this.getWorld().addObject(new statueCompleted(), 375, 200);
            this.getWorld().addObject(new shard(), 375, 375);
        }
        if(this.isTouching(furnace.class) && Greenfoot.isKeyDown("e") && !furnace.retrieved){
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            this.getWorld().addObject(new shard(), 375, 500);
            this.getWorld().addObject(new chatDialougeQuerySelector(9), 375, 375);
            furnace.setRetrieved();
        }
        if(this.isTouching(book.class) && Greenfoot.isKeyDown("e")){
            this.getWorld().removeObjects(this.getWorld().getObjects(sign.class));
            this.getWorld().addObject(new chatDialougeQuerySelector(11), 375, 150);
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
    public static void lockChampion(){locked = true;}
    public static void unlockChampion(){locked = false;}
    public static void incrementGameClock(){gameClock++;}
    
    
    
    public static void resetMap(){
        gotKey = false;
        unlockedDoor = false;
        hasFlower = false;
        shardCount = 0;
        furnace.reset();
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(0));
        worldMaster.getWorlds().get(0).removeObjects(worldMaster.getWorlds().get(0).getObjects(key.class));
        worldMaster.getWorlds().get(0).addObject(new key(), 600, 600);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(1));
        worldMaster.getWorlds().get(1).removeObjects(worldMaster.getWorlds().get(1).getObjects(shard.class));
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(2));
        worldMaster.getWorlds().get(2).removeObjects(worldMaster.getWorlds().get(2).getObjects(door.class));
        worldMaster.getWorlds().get(2).removeObjects(worldMaster.getWorlds().get(2).getObjects(teleporter.class));
        worldMaster.getWorlds().get(2).addObject(new door("bottomDoor.PNG"), 354, 720);
        worldMaster.getWorlds().get(2).addObject(new door("leftSideDoor.PNG"), 70, 375);
        worldMaster.getWorlds().get(2).addObject(new door("rightSideDoor.PNG"), 680, 375);
        for(int i = 0; i < 5; i++){
            worldMaster.getWorlds().get(2).addObject(new teleporter(worldMaster.getWorlds().get(1),"horizBorderControl.png"), 275 + 30 * i, 710);
        }
        for(int i = 0; i < 5; i++){ //Lock this door. 
            worldMaster.getWorlds().get(2).addObject(new lock(), 75, 250 + 30 * i);
        }
        for(int i = 0; i < 5; i++){
            worldMaster.getWorlds().get(2).addObject(new teleporter(worldMaster.getWorlds().get(4),"vertBorderControl.png"), 700, 250 + 30 * i);
        }
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(7));
        worldMaster.getWorlds().get(7).removeObjects(worldMaster.getWorlds().get(7).getObjects(rose.class));
        worldMaster.getWorlds().get(7).addObject(new rose(), 600, 700);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(13)); queryTracker.i = 0;
        worldMaster.getWorlds().get(13).removeObjects(worldMaster.getWorlds().get(13).getObjects(door.class));
        worldMaster.getWorlds().get(13).removeObjects(worldMaster.getWorlds().get(13).getObjects(teleporter.class));
        worldMaster.getWorlds().get(13).addObject(new door("topDoor.PNG"), 375, 25);
        worldMaster.getWorlds().get(13).addObject(new door("bottomDoor.PNG"), 375, 725);
        for(int i = 0; i < 5; i++){ //N
                worldMaster.getWorlds().get(13).addObject(new teleporter(worldMaster.getWorlds().get(12),"horizBorderControl.png"), 300 + 30 * i, 50);
        }
        for(int i = 0; i < 5; i++){ //S
                worldMaster.getWorlds().get(13).addObject(new teleporter(worldMaster.getWorlds().get(14),"horizBorderControl.png"), 300 + 30 * i, 700);
        }
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(8));
        worldMaster.getWorlds().get(8).removeObjects(worldMaster.getWorlds().get(8).getObjects(statue.class));
        worldMaster.getWorlds().get(8).removeObjects(worldMaster.getWorlds().get(8).getObjects(statueCompleted.class));
        worldMaster.getWorlds().get(8).addObject(new statue(), 375, 200);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(16));
        colorPuzzleSubmit.completed = false;
        colorPuzzleQueryMaster.clearInput();
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(3));
        worldMaster.getWorlds().get(3).removeObjects(worldMaster.getWorlds().get(3).getObjects(shard.class));
        worldMaster.getWorlds().get(3).addObject(new shard(), 375, 375);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(10));
        worldMaster.getWorlds().get(10).removeObjects(worldMaster.getWorlds().get(10).getObjects(shard.class));
        worldMaster.getWorlds().get(10).addObject(new shard(), 375, 375);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(12));
        worldMaster.getWorlds().get(12).removeObjects(worldMaster.getWorlds().get(12).getObjects(chatDialougeQuerySelector.class));
        worldMaster.getWorlds().get(12).addObject(new chatDialougeQuerySelector(4), 375, 600);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(13));
        worldMaster.getWorlds().get(13).removeObjects(worldMaster.getWorlds().get(13).getObjects(chatDialougeQuerySelector.class));
        worldMaster.getWorlds().get(13).addObject(new chatDialougeQuerySelector(5), 375, 600);
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(14));
        worldMaster.getWorlds().get(14).removeObjects(worldMaster.getWorlds().get(14).getObjects(chatDialougeQuerySelector.class));
        worldMaster.getWorlds().get(14).addObject(new chatDialougeQuerySelector(6), 375, 600);
        
        
        Greenfoot.setWorld(worldMaster.getWorlds().get(0));
        worldMaster.getWorlds().get(0).removeObjects(worldMaster.getWorlds().get(0).getObjects(champion.class));
        worldMaster.getWorlds().get(0).addObject(new champion(), 375, 375);
        
        gameClock = 0;
    }
}
