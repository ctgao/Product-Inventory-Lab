import io.Console;
import services.AlbumService;
import services.BubbleTeaService;

public class App {
    private AlbumService albumService = new AlbumService();
    private BubbleTeaService bobaService = new BubbleTeaService();

    public static void main(String... args) {
        App application = new App();
        application.init();
        while (application.run()) {
        }
        application.close();
    }

    private void close() {
        Console.printBye();
        System.exit(0);
    }

    private boolean run() {
        Console.printMainMenu();
        int response = Console.waitForIntegerInput();
        switch (response) {
            case 1:
                createProducts();
                break;
            case 2:
                printOverview();
                break;
            case 3:
                updateInventory();
                break;
            case 4:
                deleteFromInventory();
                break;
            case 5:
                getReports();
                break;
            case 6:
                return false;
            default:
                Console.printPrompt("Not a valid response!\n");
                return run();
        }
        return true;
    }

    private void updateInventory() {
        String prompt =
                "**************************************************\n" +
                        "***   Which product would you like to update?  ***\n" +
                        "***        1. Album                            ***\n" +
                        "***        2. Bubble Tea                       ***\n" +
                        "**************************************************";
        Console.printPrompt(prompt);
        int response = Console.waitForIntegerInput();
        if (response == 1) {
            updateAlbum();
        } else if (response == 2) {
            updateBubbleTea();
        } else {
            Console.printPrompt("Not a valid response!\n");
            createProducts();
        }
    }

    private void updateBubbleTea() {
    }

    private void updateAlbum() {
    }

    private void getReports() {
    }

    private void deleteFromInventory() {
        String prompt =
                "**************************************************\n" +
                "***   Which product would you like to delete?  ***\n" +
                "***        1. Album                            ***\n" +
                "***        2. Bubble Tea                       ***\n" +
                "**************************************************";
        Console.printPrompt(prompt);
        int response = Console.waitForIntegerInput();
        if (response == 1) {
            deleteAlbum();
        } else if (response == 2) {
            deleteBubbleTea();
        } else {
            Console.printPrompt("Not a valid response!\n");
            createProducts();
        }
    }

    private void deleteBubbleTea() {
        int size = bobaService.getSize();
        String prompt = "You have 1 to %d Bubble Tea total. Which one would you like delete?";

        Console.printPrompt(String.format(prompt, size));
        int response = Console.waitForIntegerInput();
        boolean hasBeenDeleted = bobaService.delete(response);

        if(!hasBeenDeleted){
            Console.printPrompt("BAD INPUT! You don't have an album of that ID!");
            deleteBubbleTea();
        }
    }

    private void deleteAlbum() {
        int size = albumService.getSize();
        String prompt = "You have 1 to %d Albums total. Which one would you like delete?";

        Console.printPrompt(String.format(prompt, size));
        int response = Console.waitForIntegerInput();
        boolean hasBeenDeleted = albumService.delete(response);

        if(!hasBeenDeleted){
            Console.printPrompt("BAD INPUT! You don't have an album of that ID!");
            deleteAlbum();
        }
    }

    private void printOverview() {
        // print your albums
        Console.printAllInventory("Album", albumService.findAll());
        Console.createSpace();
        // print your boba
        Console.printAllInventory("Bubble Tea", bobaService.findAll());
        Console.createSpace();
    }

    private void createProducts() {
        String prompt =
                "**************************************************\n" +
                "***   Which product would you like to create?  ***\n" +
                "***        1. Album                            ***\n" +
                "***        2. Bubble Tea                       ***\n" +
                "**************************************************";
        Console.printPrompt(prompt);
        int response = Console.waitForIntegerInput();
        if (response == 1) {
            createAlbum();
        } else if (response == 2) {
            createBubbleTea();
        } else {
            Console.printPrompt("Not a valid response!\n");
            createProducts();
        }
    }

    private void createAlbum() {
        String[] prompts = new String[]{"Album Name?", "Artist Name?", "TrackListing", "Have photocards?",
                "Quantity?", "Price?"};
        String[] inputs = new String[prompts.length];
        String[] tracks = null;
        // get all fields
        for (int i = 0; i < prompts.length; i++) {
            Console.printPrompt(prompts[i]);
            switch (i) {
                case 4:
                    inputs[i] = Console.waitForIntegerInput() + "";
                    break;
                case 5:
                    inputs[i] = Console.waitForFloatInput() + "";
                    break;
                case 3:
                    inputs[i] = Console.waitForBooleanInput() + "";
                    break;
                case 2:
                    //keep looping until you get all tracklisting
                    tracks = Console.askForTracks();
                    break;
                default:
                    inputs[i] = Console.waitForStringInput();
                    break;
            }
        }
        //now create le album
        albumService.create(Console.camelCase(inputs[0]), inputs[1], tracks, Boolean.valueOf(inputs[3]),
                Integer.valueOf(inputs[4]), Float.valueOf(inputs[5]));
    }

    private void createBubbleTea() {
        String[] prompts = new String[]{"Tea Base?", "Ice Level?", "Sugar Level?", "Have bubbles?",
                "Have milk?", "Quantity?", "Price?"};
        String[] inputs = new String[prompts.length];
        // get all fields
        for (int i = 0; i < prompts.length; i++) {
            Console.printPrompt(prompts[i]);
            switch(i){
                case 1:
                case 6:
                    inputs[i] = Console.waitForFloatInput() + "";
                    break;
                case 0:
                    inputs[i] = Console.waitForStringInput();
                    break;
                case 2:
                case 5:
                    inputs[i] = Console.waitForIntegerInput() + "";
                    break;
                case 3:
                case 4:
                    inputs[i] = Console.waitForBooleanInput() + "";
                    break;
            }
        }
        //now create le album
        bobaService.create(inputs[0], Float.valueOf(inputs[1]), Integer.valueOf(inputs[2]), Boolean.valueOf(inputs[3]),
                Boolean.valueOf(inputs[4]), Integer.valueOf(inputs[5]), Float.valueOf(inputs[6]));
    }

    private void init() {
        Console.printWelcome();
    }
}
