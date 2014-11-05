package com.tufsd.drugwars;


/**
 * Write a description of class Player here.
 * 
 * @author SHHS Coding Club Game Logic Team
 * @version 20141105
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int y;

    /**
     * Constructor for objects of class Player
     */
    public Drug[] inventory;
    public String name;
   
    public Player(String nameIn)
    {
        // initialise instance variables
        y = 0;
        name = nameIn;
        //Inv:
       
        //stats
        
        int health = 100; //it's health, what do you think
        int drunkness = 0; //the more you drink, the higher it is
        int highness = 0; //you know what it is
        int stamina = 100; //how long you run
        int tiredness = 10; //get sleep
        
        //Goals

        int days = 31; //days until the loan shark comes
        int bounty = 0; //illigal things = bigger bounty
    }
}
