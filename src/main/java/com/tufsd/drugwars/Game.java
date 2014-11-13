package com.tufsd.drugwars;


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
        // initialise instance variables
        player = new Player(name);
    }

    public void run()
    {
        UI.playerInfo(player);
    }
}
