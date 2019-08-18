import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    int rightSideOfScreen;
    int bottomOfScreen;

    public void addedToWorld(World MyWorld)
    {
        rightSideOfScreen = MyWorld.getWidth()-1;
        bottomOfScreen = MyWorld.getHeight()-1;
    }

    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {move(4);// Add your action code here.
        if(Greenfoot.getRandomNumber(10)==1)
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
