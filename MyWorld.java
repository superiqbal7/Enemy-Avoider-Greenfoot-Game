import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int score=10;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,45,191);
        Pizza pizza = new Pizza();
        addObject(pizza,273,93);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,269,199);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,441,41);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,424,358);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,229,345);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,464,147);
        Pizza pizza7 = new Pizza();
        addObject(pizza7,167,17);
        Pizza pizza8 = new Pizza();
        addObject(pizza8,393,225);
        Pizza pizza9 = new Pizza();
        addObject(pizza9,608,273);
        Pizza pizza10 = new Pizza();
        addObject(pizza10,611,59);
        Enemy enemy = new Enemy();
        addObject(enemy,696,162);
    }

    public void act()
    {
        showText("Pizza left = "+score,100,20);
    }
    public void increaseScore()
    {
        score = score-1;
        if(score==0){
          showText("Pizza left = "+score,100,20);
          addObject(new youWin(),400,300);
          Greenfoot.playSound("win.wav");
          Greenfoot.stop();  
        }
    }
}
