package com.tufsd.drugwars;
import java.util.Scanner;


/** Drug Wars interface made by Drug Lords Abigail, Amanda, Daniel, Dong Kyu, Jack
 */
public class UI
{
     public static void splashscreen()
    {   //Splashscreen of Drug Wars
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
    }
}
