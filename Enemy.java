import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int vx=0;
    private boolean toRemove=false;
    int rightSideOfScreen;
    int bottomOfScreen;
    public Enemy()
    {
        GreenfootImage myImage = getImage();
        int myNewHight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(100,100);
    }
    public Enemy(int v)
    {
        vx=v;
    }
    public void addedToWorld(World MyWorld)
    {
        //setRotation(180);
        rightSideOfScreen = MyWorld.getWidth()-1;
        bottomOfScreen = MyWorld.getHeight()-1;
    }

    public void act() 
    {
        //if(!toRemove)move();
        //else getWorld().removeObject(this);
        move(6);// Add your action code here.
        if(Greenfoot.getRandomNumber(5)==1)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        
        int x=getX();
        int y=getY();
        if(x<=0 || y<=0 || x>= rightSideOfScreen || y>= bottomOfScreen)
        {
            turn(180);
        } 
    }

    
}
