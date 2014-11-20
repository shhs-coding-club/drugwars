package com.tufsd.drugwars;

import java.util.EnumMap;

/**
 * A class to represent players.
 *
 * @author SHHS Coding Club Game Logic Team
 * @version 20141105
 */
public class Player
{
    /**
     * The player's inventory with drug names as keys and count as values.
     */
    public EnumMap<Drug, Integer> inventory;

    /**
     * The player's name.
     */
    public String name;

    /**
     * The player's health (initial value of 100).
     */
    public int health = 100;

    /**
     * Constructor for objects of class Player
     *
     */
    public Player(String name)
    {
        this.name = name;
        //Inv:

        //stats

        int drunkness = 0; //the more you drink, the higher it is
        int highness = 0; //you know what it is
        int stamina = 100; //how long you run
        int tiredness = 10; //get sleep

        int bounty = 0; //illegal things = bigger bounty
    }
}
