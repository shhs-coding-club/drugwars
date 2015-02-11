package com.tufsd.drugwars;
import java.util.Random;
import java.util.EnumMap;
/**
 * A class to represent a game session.
 *
 * @author SHHS Coding Club
 * @version 20141105
 */
public class Game
{
    /**
     * Constructor for objects of class Game
     */
    public Player player;

    public final double RATE = .1;
    public int turns;
    
    Location currentLocation;
    
    public void turn()
    {
        addInterest();
    }

    public Game(String name)
    {
        EnumMap<Drug, Integer> inventory = new EnumMap<Drug, Integer>(Drug.class);
        // initialise instance variables
        player = new Player(name);
        player.inv = inventory;
        player.inv.put(Drug.POT, 3);
        player.sellDrugs (Drug.POT, 2);

        turns = 0;
        
        player.inv.put(Drug.METH, 99);

    }

    public double addInterest()
    {
        player.debt = (player.debt*Math.pow(Math.E, (RATE*turns)));
        return player.debt;
    }

    public void run()
    {
        initPrices();
        UI.playerInfo(player);
        UI.outputInventory(player);
        UI.gameMenu(player);
    }
     
    public boolean policeEncounter ()
    {
        double random = Math.random() * 10 + 1;
        if (random == 1)
            return true;
        else
            return false;

    }

    private void initPrices()
    {
        Location.BLOCK.prices.put(Drug.POT, 10.0);
        System.out.println(Location.BLOCK.prices);
    }
    
    public void setLocation (Location newLocation)
    {
        currentLocation = newLocation;
        
        turns += 1;
    }
    
}