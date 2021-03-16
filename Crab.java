import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
            turnAtEdge();
            lookForWorm();
            randomTurn();
            move();
          
           
    }
    
    public void move()
    {
        move(4);
    }
    
    /*
     * Check Weather we have stumbled upon a worm if so eat it
     */
    public void lookForWorm()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
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
