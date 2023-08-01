package io;

import java.util.Scanner;

public class Console {
    private static Scanner userInput = new Scanner(System.in);
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***         ZipCode Inventory Manager          ***" +
                "**************************************************");
    }

    public static void printMainMenu() {
        System.out.println("" +
                "**************************************************" +
                "***                 Main Menu                  ***" +
                "***  1. Create Products to Add to Inventory    ***" +
                "***  2. Glance over the Inventory              ***" +
                "***  3. Update an existing product             ***" +
                "***  4. Delete a product                       ***" +
                "***  5. Get reports about products             ***" +
                "***  6. Exit                                   ***" +
                "**************************************************");
    }

    public static String waitForStringInput() {
        return userInput.nextLine();
    }

    public static int waitForIntegerInput() {
        String response = waitForStringInput();
        try{
            return Integer.valueOf(response);
        }
        catch (RuntimeException e){
            System.out.println("BAD INPUT! Try again :)");
            return waitForIntegerInput();
        }
    }

    public static void printBye() {
        System.out.println("" +
                "**************************************************" +
                "***           Goodbye and Au Revoir            ***" +
                "***                   from                     ***" +
                "***         ZipCode Inventory Manager          ***" +
                "**************************************************");
    }
}
