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
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(15);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(15);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(15);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(15);
        }
        if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right"))
        {
            setRotation(45);
        }
        if (Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left"))
        {
            setRotation(135);
        }
        if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            setRotation(315);
        }
        if (Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
        {
            setRotation(225);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(270);
        }
    }
}
