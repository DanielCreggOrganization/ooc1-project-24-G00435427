package ie.atu.videogameManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class for Game
public class Game {
    // Instance Variables (Encapsulation)
    private int gameId; // Unique ID
    private String genre;
    private float storageSizeGB;
    private int unitsSold;
    private boolean isMultiplayer;

    // Constructor
    public Game(int gameId, String genre, float storageSizeGB, int unitsSold, boolean isMultiplayer) {
        this.gameId = gameId;
        this.genre = genre;
        this.storageSizeGB = storageSizeGB;
        this.unitsSold = unitsSold;
        this.isMultiplayer = isMultiplayer;
    }

    // Getters and Setters
    public int getGameId() {
        return gameId;
    }

    public String getGenre() {
        return genre;
    }

    public float getStorageSizeGB() {
        return storageSizeGB;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public boolean isMultiplayer() {
        return isMultiplayer;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setStorageSizeGB(float storageSizeGB) {
        this.storageSizeGB = storageSizeGB;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    // Method to display game details (Polymorphism)
    public void displayDetails() {
        System.out.println("Game ID: " + gameId);
        System.out.println("Genre: " + genre);
        System.out.println("Storage Size: " + storageSizeGB + " GB");
        System.out.println("Units Sold: " + unitsSold);
        System.out.println("Multiplayer: " + (isMultiplayer ? "Yes" : "No"));
    }
}

// Subclass demonstrating Inheritance and Polymorphism
class OnlineGame extends Game {
    private String serverRegion;

    public OnlineGame(int gameId, String genre, float storageSizeGB, int unitsSold, boolean isMultiplayer, String serverRegion) {
        super(gameId, genre, storageSizeGB, unitsSold, isMultiplayer);
        this.serverRegion = serverRegion;
    }

    public String getServerRegion() {
        return serverRegion;
    }

    public void setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Server Region: " + serverRegion);
    }
}

// Abstract class demonstrating Abstraction
abstract class GameManager {
    protected List<Game> games;

    public GameManager() {
        this.games = new ArrayList<>();
    }

    public abstract void addGame(Game game);

    public abstract boolean deleteGame(int gameId);

    public abstract Game findGame(int gameId);

    public int countGames() {
        return games.size();
    }
}

// Concrete class implementing GameManager
class GameCollection extends GameManager {

    @Override
    public void addGame(Game game) {
        games.add(game);
        System.out.println("Game added: " + game.getGameId());
    }

    @Override
    public boolean deleteGame(int gameId) {
        for (Game game : games) {
            if (game.getGameId() == gameId) {
                games.remove(game);
                System.out.println("Game deleted: " + gameId);
                return true;
            }
        }
        System.out.println("Game not found: " + gameId);
        return false;
    }

    @Override
    public Game findGame(int gameId) {
        for (Game game : games) {
            if (game.getGameId() == gameId) {
                return game;
            }
        }
        System.out.println("Game not found: " + gameId);
        return null;
    }

    public void displayAllGames() {
        for (Game game : games) {
            game.displayDetails();
            System.out.println("---------------------------");
        }
    }
}



