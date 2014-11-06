package com.tufsd.drugwars;


/**
 * Class to provide a template for the various drugs
 *
 * @author Luke & Caleb
 * @version 10/22/14
 */
public class Drug
{
    // instance variables - replace the example below with your own
    public String name;
    public double basePrice;
    /**
     * Constructor for objects of class Drug
     * @param name      name of the drug
     * @param basePrice the base price of the drug
     */
    public Drug(String name, double basePrice)
    {
        // initialise instance variables
        this.name = name;
        this.basePrice = basePrice;
    }
}
