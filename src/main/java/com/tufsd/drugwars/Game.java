package com.tufsd.drugwars;

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
    public Game(String name)
    {
        EnumMap<Drug, Integer> inventory = new EnumMap<Drug, Integer>(Drug.class);
        // initialise instance variables
        player = new Player(name);
        player.inventory = inventory;
        player.inventory.put(Drug.POT, 3);
    }

    public void run()
    {
        UI.playerInfo(player);
    }
}
