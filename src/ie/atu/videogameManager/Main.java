package ie.atu.videogameManager;

import java.util.Scanner;

class Menu {
    private GameCollection gameCollection;
    private Scanner userInput;

    public Menu() {
        this.gameCollection = new GameCollection();
        this.userInput = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Video Game Database");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("(1) Add game");
            System.out.println("(2) Delete game");
            System.out.println("(3) Show total number of games");
            System.out.println("(4) Quit");
            System.out.print("Enter your selection: ");

            int userSelection = userInput.nextInt();

            switch (userSelection) {
                case 1:
                    addGameMenu();
                    break;
                case 2:
                    deleteGameMenu();
                    break;
                case 3:
                    System.out.println("Total games: " + gameCollection.countGames());
                    break;
                case 4:
                    System.out.println("Video game database closing - goodbye");
                    userInput.close();
                    return;
                default:
                    System.out.println("Invalid selection, please try again.");
            }
        }
    }

    private void addGameMenu() {
        System.out.print("Enter Game ID: ");
        int gameId = userInput.nextInt();
        System.out.print("Enter Genre: ");
        String genre = userInput.next();
        System.out.print("Enter Storage Size (GB): ");
        float storageSizeGB = userInput.nextFloat();
        System.out.print("Enter Units Sold: ");
        int unitsSold = userInput.nextInt();
        System.out.print("Is it Multiplayer? (true/false): ");
        boolean isMultiplayer = userInput.nextBoolean();

        Game newGame = new Game(gameId, genre, storageSizeGB, unitsSold, isMultiplayer);
        gameCollection.addGame(newGame);
    }

    private void deleteGameMenu() {
        System.out.print("Enter Game ID to delete: ");
        int gameId = userInput.nextInt();
        gameCollection.deleteGame(gameId);
    }
}

// Main class to demonstrate functionality
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}


