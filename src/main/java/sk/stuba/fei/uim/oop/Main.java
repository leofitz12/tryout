package sk.stuba.fei.uim.oop;

import java.util.Scanner;

import sk.stuba.fei.uim.oop.game.Game;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to BANG!");

            System.out.print("Enter the number of players (2-4): ");
            int numPlayers = scanner.nextInt();
            while (numPlayers < 2 || numPlayers > 4) {
                System.out.print("Invalid number of players. Enter a number between 2 and 4: ");
                numPlayers = scanner.nextInt();
            }

            Game game = new Game(numPlayers);
            game.playGame();
        }
    }
}



