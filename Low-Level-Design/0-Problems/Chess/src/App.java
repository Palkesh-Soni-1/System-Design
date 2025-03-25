import java.util.Scanner;

import Model.Game;
import Model.Move;
import Model.Player;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player 1 name (White):");
        String name1 = scanner.nextLine();
        System.out.println("Enter Player 2 name (Black):");
        String name2 = scanner.nextLine();
        Player p1 = new Player(name1, "white");
        Player p2 = new Player(name2, "black");
        Game game = new Game(p1, p2);

        game.printBoard();
        while (true) {
            System.out.println(game.currentPlayer.name + " (" + game.currentPlayer.color + ") enter move (srcX srcY destX destY) or 'exit':");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            String[] parts = input.trim().split(" ");
            if (parts.length != 4) {
                System.out.println("Invalid input format. Please enter 4 integers.");
                continue;
            }

            try {
                int srcX = Integer.parseInt(parts[0]);
                int srcY = Integer.parseInt(parts[1]);
                int destX = Integer.parseInt(parts[2]);
                int destY = Integer.parseInt(parts[3]);

                Player movingPlayer = game.currentPlayer;
                if (game.movePiece(srcX, srcY, destX, destY)) {
                    Move move = new Move(srcX, srcY, destX, destY, movingPlayer);

                    game.currentPlayer = (game.currentPlayer == game.player1) ? game.player2 : game.player1;
                    game.printBoard();
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers.");
            }
        }
        scanner.close();
    }
}
