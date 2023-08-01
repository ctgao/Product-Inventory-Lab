package io;

import models.InventoryItem;

import java.util.Scanner;

public class Console {
    private static Scanner userInput = new Scanner(System.in);
    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***         ZipCode Inventory Manager          ***\n" +
                "**************************************************\n");
    }

    public static void printMainMenu() {
        System.out.println("" +
                "**************************************************\n" +
                "***                 Main Menu                  ***\n" +
                "***  1. Create Products to Add to Inventory    ***\n" +
                "***  2. Glance over the Inventory              ***\n" +
                "***  3. Update an existing product             ***\n" +
                "***  4. Delete a product                       ***\n" +
                "***  5. Get reports about products             ***\n" +
                "***  6. Exit                                   ***\n" +
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
                "**************************************************\n" +
                "***           Goodbye and Au Revoir            ***\n" +
                "***                   from                     ***\n" +
                "***         ZipCode Inventory Manager          ***\n" +
                "**************************************************\n");
    }

    public static <T extends InventoryItem> void printAllInventory(String className, T[] array) {
        System.out.format("Your %s Inventory:\n", className);
        if(array == null || array.length == 0){
            // nothing to print out
            System.out.println("\tEmpty!");
            return;
        }
        //"Album [id]: [album_name] [quantity] for [price]"
        //"Boba [id]: [boba_name - to string methods?] [quantity] for [price]"
        String toPrint = "%s %d: %100s\t%d for %.2f\n";
        for(T value : array){
            int id = value.getId();
            String name = value.toString();
            int quantity = value.getQuantity();
            float price = value.getPrice();

            System.out.format(toPrint, className, id, name, quantity, price);
        }
    }

    public static void createSpace() {
        System.out.println();
    }
}
