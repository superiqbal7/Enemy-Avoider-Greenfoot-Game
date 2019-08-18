import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int targetx=0,targety=0;
    private int jeda=0;
    private boolean toRemove=false;
    Actor pizza;
    public void addedToWorld(World MyWorld)
    {
        targetx=getX();targety=getY();
        //setRotation(180);
    }

    public void move()
    {
        int x=getX();
        int y=getY();
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("W")){y-=2;setRotation(90);}
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("S")){y+=2;setRotation(270);}
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("A")){x-=2;setRotation(180);}
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("D")){x+=2;setRotation(360);}
        setLocation(x,y);
    }

    public void act() 
    {
        /*if(Greenfoot.mouseMoved(null)){
        MouseInfo mouse=Greenfoot.getMouseInfo();
        targetx=mouse.getX();
        targety=mouse.getY();
        }*/
        move();
        Actor pizza = getOneIntersectingObject(Pizza.class);
        MyWorld myWorld = (MyWorld)getWorld();
        if(pizza!=null){
            myWorld.removeObject(pizza);
            Greenfoot.playSound("eat.wav");
            myWorld.increaseScore();
        }

        removeTouching(Pizza.class);
        hitEnemy();
    }

    public void hitEnemy()
    {
        if(isTouching(Enemy.class))
        {
            getWorld().addObject(new youLost(),400,300);
            Greenfoot.playSound("lost.wav");
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
