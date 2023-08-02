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
                "**************************************************");
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
        String toPrint = "%s %d:\t%20s\t%10d sold for %.2f\n";
        for(T value : array){
            int id = value.getId();
            String name = value.toString();
            int quantity = value.getQuantity();
            float price = value.getPrice();

            System.out.format(toPrint, className, id, name, quantity, price);
        }
    }

    public static void createSpace() {
        printPrompt("");
    }

    public static void printPrompt(String s) {
        System.out.println(s);
    }

    public static Float waitForFloatInput() {
        String response = waitForStringInput();
        try{
            return Float.valueOf(response);
        }
        catch (RuntimeException e){
            System.out.println("BAD INPUT! Try again :)");
            return waitForFloatInput();
        }
    }

    public static boolean waitForBooleanInput() {
        String response = waitForStringInput().toLowerCase();
        if(response.contains("yes")){
            return true;
        }
        else if(response.contains("no")){
            return false;
        }
        try{
            return Boolean.valueOf(response);
        }
        catch (RuntimeException e){
            System.out.println("BAD INPUT! Try again :)");
            return waitForBooleanInput();
        }
    }

    public static String[] askForTracks() {
        System.out.println("How many tracks?");
        int numOfTracks = waitForIntegerInput();
        String[] result = new String[numOfTracks];
        for(int i = 1; i <= numOfTracks; i++){
            System.out.format("Track No. %d?\n", i);
            String response = waitForStringInput();
            result[i - 1] = camelCase(response);
        }
        return result;
    }

    public static String camelCase(String input){
        return input.toUpperCase().charAt(0) + input.toLowerCase().substring(1);
    }
}
