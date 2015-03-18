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
        Location.BLOCK.prices.put(Drug.POT, -1.0);
        Location.BLOCK.prices.put(Drug.METH, 20.0);
        Location.BLOCK.prices.put(Drug.SPEED, 7.0);
        Location.BLOCK.prices.put(Drug.COKE, 5.0);
        Location.BLOCK.prices.put(Drug.HEROIN, 10.0);
        
        Location.MCDONALDS.prices.put(Drug.POT, 5.0);
        Location.MCDONALDS.prices.put(Drug.METH, -2.0);
        Location.MCDONALDS.prices.put(Drug.SPEED, 4.0);
        Location.MCDONALDS.prices.put(Drug.COKE, 10.0);
        Location.MCDONALDS.prices.put(Drug.HEROIN, 10.0);
        
        Location.KOREANCHURCH.prices.put(Drug.POT, -8.0);
        Location.KOREANCHURCH.prices.put(Drug.METH, 12.0);
        Location.KOREANCHURCH.prices.put(Drug.SPEED, 4.0);
        Location.KOREANCHURCH.prices.put(Drug.COKE, 6.0);
        Location.KOREANCHURCH.prices.put(Drug.HEROIN, 8.0);
        
        Location.BOX.prices.put(Drug.POT, 13.0);
        Location.BOX.prices.put(Drug.METH, 20.0);
        Location.BOX.prices.put(Drug.SPEED, 400.0);
        Location.BOX.prices.put(Drug.COKE, 30.0);
        Location.BOX.prices.put(Drug.HEROIN, 10.0);
    }
    
    public void setLocation (Location newLocation)
    {
        currentLocation = newLocation;
        
        turns += 1;
    }
    
}