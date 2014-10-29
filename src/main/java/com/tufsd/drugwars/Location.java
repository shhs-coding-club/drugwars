package com.tufsd.drugwars;


/**
 * location class
 * 
 * Aaron 
 * 10-29-14
 */
public class Location
{
    public String name;
    public float[] prices;
    
    public Location(String nameIn, float[] pricesIn)
    {
        name = new String(nameIn);
        prices = pricesIn;
    }
}
