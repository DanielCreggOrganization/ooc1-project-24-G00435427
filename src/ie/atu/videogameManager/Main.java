package ie.atu.videogameManager;

import java.util.Scanner;

public class Main {

    private static game[] games = new game[10];  // Array to hold up to 10 games
    private static int gameCount = 0;  // Counter to keep track of how many games are in the array

    

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userselection = 0;

        //menu
    while (true) {
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Video game data base");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("(1) add game");
        System.out.println("(2) delete game");
        System.out.println("(3) show toal number of games ");
        System.out.println("(4) quit");

        userselection = userInput.nextInt();

        if (userselection == 4) { //quit

            System.out.println("Videogame data base closing - goodbye");
            userInput.close();
            break;}}


        }

    // Method to add a game to the array
    public static void addGame(game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
            System.out.println("Game added: " + game.getGame_Id());
        } else {
            System.out.println("Game array is full.");
        }
    
}
}

