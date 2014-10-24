package com.tufsd.drugwars;
import java.util.Scanner;


/** 
 * Drug Wars interface made by Drug Lords Abigail, Amanda, Daniel, Dong Kyu, Jack, Jason (Team BADASSNESS!!!!!!)
 * ----------------------------------------------------------
 * UI method implements introduction splashscreen badassness
 * ----------------------------------------------------------
 */
public class UI
{
    /**
     * ------------------------------------------
     * Function splashcreen shows Drug Wars logo
     * ------------------------------------------
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
        System.out.print("Press return to continue...");  
        scanner.nextLine();
        startScreen();
    }
    /**
     * -------------------------------------------------------------
     * Function dummyFunction serves as placehold for future coding
     * -------------------------------------------------------------
     */
    public static void dummyFunction()
    {
        System.out.println ("dummyFunction execute");
    }
    
    /**
     * ---------------------------------------------------------------------------------------
     * Function startScreen sends command for 1 and 2 to begin new game or quit, respectively
     * ---------------------------------------------------------------------------------------
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
        if (select == "New Game")
        {
            dummyFunction();
        }
        else if (select == "Quit") 
        {
            System.exit(0);
        }
        else
        {
            System.out.println ("Unknown Option");
            System.exit(0);
        }
    }
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
}
