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
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Greenfoot.delay(60);
        }
    // Checks for collisions with other objects
    }
    private void onCollision()
    {
        if(isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}


