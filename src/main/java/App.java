import io.Console;
import services.AlbumService;

public class App {
    private AlbumService albumService = new AlbumService();
    public static void main(String... args){
        App application = new App();
        application.init();
        while(application.run()){
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
        switch(response){
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
                // we should never get here
        }
        return true;
    }

    private void updateInventory() {
    }

    private void getReports() {
    }

    private void deleteFromInventory() {
        
    }

    private void printOverview() {
        
    }

    private void createProducts() {
        
    }

    private void init() {
        Console.printWelcome();
    }
}
