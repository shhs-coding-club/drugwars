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
    public EnumMap<Drug, Integer> inv;

    /**
     * The player's name.
     */
    public String name;

    /**
     * The player's health (initial value of 100).
     */
    public int health = 100;
    public double money;
    public double debt;

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
        double money = 1000; 
        int bounty = 0; //illegal things = bigger bounty

        debt = 10000;
    }
    
    
    public int sellDrugs(Drug drug, int quantity)
    {
        inv.put (drug, inv.get(drug) - quantity);
        money += quantity*10;
        return quantity*10;
        
    }
}
