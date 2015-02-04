

package com.tufsd.drugwars;
/**
 * Class to provide a template for the various drugs
 *
 * @author Luke & Caleb
 * @version 10/22/14
 */
public enum Drug
{
    POT,
    METH,
    SPEED,
    COKE,
    HEROIN;

    public static String[] names() {
        String[] names = new String[values().length];
        int index = 0;

        for (Drug drug : values()) {
            names[index++] = drug.name();
        }

        return names;
    }
}
