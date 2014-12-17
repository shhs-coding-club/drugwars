package com.tufsd.drugwars;
import java.util.EnumMap;
/**
 * location class
 *
 * @author Aaron
 * @version 10-29-14
 */
public enum Location
{
    BLOCK,
    KOREANCHURCH,
    MCDONALDS,
    BOX;

    public String name;
    public EnumMap<Drug, Double> prices;

    Location()
    {
        prices = new EnumMap<Drug, Double>(Drug.class);
    }
}
