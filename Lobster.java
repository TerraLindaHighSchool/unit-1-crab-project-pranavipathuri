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
        // Moves the Lobster
        move(3);
        turnAtEdge();
        // Turns the Lobster at the edge
    }
    
    private void turnAtEdge()
    {
      if(isAtEdge())  
      {
          turn(50);
      }
    }
    }