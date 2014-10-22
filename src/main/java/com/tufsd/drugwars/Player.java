package com.tufsd.drugwars;


/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        x = 0;
        
        //Inv:
        
        int money = 250;
        int ammo = 18;
        int beer = 0;
        int pot = 0;
        int coke = 0;
        int meth = 0;
        int bong = 0;
        int lighter = 0;
        
        //stats
        
        int health = 100; //it's health, what do you think
        int dunkness = 0; //the more you drink, the higher it is
        int highness = 0; //you know what it is
        int stanima = 100; //how long you run
        int tiredness = 10; //get sleep
        
        //Goals

        int days = 31; //days until the loan shark comes
        int bounty = 0; //illigal things = bigger bounty
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
