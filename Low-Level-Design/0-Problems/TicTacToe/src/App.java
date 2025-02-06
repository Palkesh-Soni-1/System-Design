import Model.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Game ticTacToe=new Game(3);
        ticTacToe.play();
    }
}
