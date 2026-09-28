/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        
       // Single -dimensional	array	= cities labels	(Categories)

       String [] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
       String [] gamingConsole = {"PS5", "XBOX", "SWITCH"};
       
       int[][] Sales = {
           {1000, 2000, 3000}, // Capw Town
           {2000, 3000, 4000},  // Port Elizabeth
           {1500, 1100, 1200},  // Pretoria
       };
       
       // Print Report Tbale
       
      System.out.println("****************************************************************");
      System.out.println("GAMING CONSOLE REPORT");
      System.out.println("****************************************************************");
      System.out.printf("%-20s%-12s%-12s%-12s%n", "", gamingConsole[0], gamingConsole[1], gamingConsole[2]);

      for (int i = 0; i < cities.length; i++) {
             System.out.printf("%-20s%-12d%-12d%-12d%n",
           cities[i], Sales[i][0], Sales[i][1], Sales[i][2]);
}
System.out.println("****************************************************************");

// Totals per city + track the highest sales
 
        int[] cityTotals = new int[cities.length];

        
        int highestTotal = 0;
        String highestCity = "";
        int total = 0;
        
        for (int i = 0; i < gamingConsole.length; i++) {
             total += Sales[i][i];

            

            cityTotals[i] = total;

            // Check if this city has the highest total so far
            
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[i];
            }

            System.out.printf("%-20s%-12d%-12d%-12d%-12d%n",
                    cities[i], Sales[i][0], Sales[i][1], Sales[i][2], total);
        }

        System.out.println("****************************************************************");
        System.out.println("Highest selling city: " + highestCity + " with total sales of " + highestTotal);
        System.out.println("****************************************************************");
    }
} 