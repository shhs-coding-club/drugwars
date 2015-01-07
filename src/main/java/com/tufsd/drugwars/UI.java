package com.tufsd.drugwars;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Drug Wars interface
 * @author Drug Lords Abigail, Amanda, Daniel, Dong Kyu, Jack, Jason (Team BADASSNESS!!!!!!)
 *
 *
 */
public class UI
{
    /**
     * Shows the Drug Wars logo and waits for the user to press enter.
     */
    public static void splashscreen()
    {
        String logo = " ____                    __        __             \n"+
                      "|  _ \\ _ __ _   _  __ _  \\ \\      / /_ _ _ __ ___ \n"+
                      "| | | | '__| | | |/ _` |  \\ \\ /\\ / / _` | '__/ __|\n"+
                      "| |_| | |  | |_| | (_| |   \\ V  V / (_| | |  \\__ \\\n"+
                      "|____/|_|   \\__,_|\\__, |    \\_/\\_/ \\__,_|_|  |___/\n"+
                      "                  |___/                           \n"+
                      "                   ";

        String creds = "From the Sleepy Hollow High School Coding Club!\n"+
                       "Presidents: Colin Atkinson, Katie Brennan\n"+
                       "Advisor: Daniel Larkin\n"+
                       "https://github.com/shhs-coding-club/drugwars\n";

        System.out.println(logo);
        System.out.println(creds);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        scanner.nextLine();
        startScreen();
    }

    /**
     * Shows the initial text and initializes and runs a new Game.
     */
    public static void initText()
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println ("You owe $100,000 to a loan shark. You've got 30 days to earn it back by selling drugs. Start now.");
        System.out.print("What is your name? ");
        name = scan.nextLine();
        Game game = new Game(name);
        game.run();
    }

    /**
     * Lets the user decide if they want to start a new game or quit.
     */
    public static void startScreen ()
    {
        String[] opts = {"New Game", "Quit"};
        String select = menuGen(opts);

        /*System.out.println ("Press 1 to begin new game");

        System.out.println ("Press 2 to quit");

        Scanner menuScanner = new Scanner (System.in);
        int menuChoice;
        menuChoice = menuScanner.nextInt();*/

        System.out.println (select);
        if (select.equals("New Game"))
        {
            initText();
        }
        else if (select.equals("Quit") )
        {
            System.exit(0);
        }
        else
        {
            System.out.println ("Unknown Option");
            System.exit(0);
        }
    }

    /**
     * Generates a menu for uesrs from an array.
     *
     * @param opts an array of Strings containing menu options
     * @return the string value of the selected menu option
     */
    public static String menuGen (String[] opts)
    {
        Scanner menuScanner = new Scanner (System.in);
        int menuChoice;

        for (int i = 0; i < opts.length; i++)
        {
            System.out.println((i+1)+". "+opts[i]);
        }

        menuChoice = menuScanner.nextInt();

        return opts[menuChoice-1];
    }

    public static void playerInfo(Player player)
    {
        System.out.println("Name: " + player.name);
        System.out.println("Health: " + player.health);
        System.out.println("Inventory: " + player.inv);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Debt: " + money.format(player.debt));

    }
    
    public static void outputInventory (Player player)
    {
        System.out.print("Player Inventory: ");
        for (Drug whatever: player.inv.keySet())
        {
            System.out.print( " " + whatever + " " + player.inv.get(whatever));
            
            

        }
    }
}
