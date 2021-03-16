import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    public void act()
    {
            turnAtEdge();
            lookForCrab();
            randomTurn();
            move();
          
           
    }
    
    public void move()
    {
        move(2);
    }
    
    /*
     * Check Weather we have stumbled upon a worm if so eat it
     */
    public void lookForCrab()
    {
        if(isTouching(Crab.class))
        {
            removeTouching(Crab.class);
        }
    }

    /*
     * makes crab randomly turn left or right between 0 and 45 degrees
     */
    public void randomTurn()
    {
         if(Greenfoot.getRandomNumber(100)<10)
            {
                turn( Greenfoot.getRandomNumber(91)-45);
            }
    }
    
    /*
     * Crab turns when it hits edge
     */
    public void turnAtEdge()
    {
       if(isAtEdge())
          {
              turn(17);
            }
    }
}
