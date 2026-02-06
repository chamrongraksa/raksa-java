package rongraksa.example;

public class Player {

        int health;
        String name;

        // This is the Constructor
        public Player(String playerName) {
            name = playerName;
            health = 100; // Starting value
            System.out.println("New player " + name + " has been created!");
        }

        public static void main(String[] args) {
            // This calls the constructor
            Player myPlayer = new Player("Sora");
        }

    }
