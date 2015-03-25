

package com.tufsd.drugwars;
/**
 * Class to provide a template for the various drugs
 *
 * @author Luke & Caleb
 * @version 10/22/14
 */
public enum Drug
{
    REEFER (10),
    XANAX (15),
    ADDERALL (12),
    COKE (20),
    HEROIN (8);
    
    double price;
    
    Drug(double price)
    {
        this.price = price;
    }

    public static String[] names() {
        String[] names = new String[values().length];
        int index = 0;

        for (Drug drug : values()) {
            names[index++] = drug.name();
        }

        return names;
    }
}
