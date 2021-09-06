import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,294,157);
        Worm worm = new Worm();
        addObject(worm,67,280);
        Worm worm2 = new Worm();
        addObject(worm2,176,380);
        Worm worm3 = new Worm();
        addObject(worm3,300,280);
        Worm worm4 = new Worm();
        addObject(worm4,450,369);
        Worm worm5 = new Worm();
        addObject(worm5,313,480);
        Worm worm6 = new Worm();
        addObject(worm6,64,495);
        Worm worm7 = new Worm();
        addObject(worm7,548,484);
        Worm worm8 = new Worm();
        addObject(worm8,550,272);
        Lobster lobster = new Lobster();
        addObject(lobster,395,160);
    }
}