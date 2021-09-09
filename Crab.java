import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        // Moves the Crab
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
        // Turns the Crab at the edge
    }
    
    private void turnAtEdge()
    {
      if(isAtEdge())  
      {
          turn(50);
      }
    }
    //Checks the user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.delay(60);
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(2);
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(2);
        }
    // Checks for collisions with other objects
    }
    private void onCollision()
    {
        if(isTouching(Worm.class))

        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
                      
            // Winning the game
            if(getWorld().getObjects(Worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
           
            }
        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
            Greenfoot.setWorld(new LoseSplash());
        }
    }
}


