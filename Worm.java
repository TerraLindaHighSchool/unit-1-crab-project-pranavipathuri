import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (pp) 
 * @version (9/9)
 */
public class Worm extends Actor
{
    public void act()
    {
        // Moves the Worm
        move(1);
        turnAtEdge();
        // Turns the Lobster at the edge
    }
    
    private void turnAtEdge()
    {
      if(isAtEdge())  
      {
          turn(-50);
      }
    }
}
