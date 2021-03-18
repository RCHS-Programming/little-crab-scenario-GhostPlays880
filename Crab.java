import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
            if(Greenfoot.isKeyDown ("left"))
            {
                turn (-4);
            }
            if(Greenfoot.isKeyDown ("right"))
            {
                turn (4);
            }
                
                
            lookForWorm();
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
            Greenfoot.playSound("slurp.wav");
        }
    }


    }

