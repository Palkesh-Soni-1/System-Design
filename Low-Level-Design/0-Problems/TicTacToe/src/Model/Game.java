package Model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import Model.Piece.Piece;
import Model.Piece.PieceO;
import Model.Piece.PieceType;
import Model.Piece.PieceX;

public class Game {
    private Board board;
    private Deque<Player> playerQueue;
    private Scanner sc;
    private int playCount;
    private int size;

    public Game(int size){
        this.size=size;
        board=new Board(size);
        playerQueue=new ArrayDeque<>();
        sc=new Scanner(System.in);
        playCount=0;
        getPlayers();
    }

    public void getPlayers(){
        // FIXME for n players

        System.out.println("Enter Name of Player"+(1)+": ");
        String name1=sc.next();
        Player player1=new Player(name1,new PieceX());
        addPlayer(player1);

        System.out.println("Enter Name of Player"+(2)+": ");
        String name2=sc.next();
        Player player2=new Player(name2,new PieceO());
        addPlayer(player2);
    }

    public void addPlayer(Player player){
        this.playerQueue.addLast(player);
    }

    public void play(){
        while(playCount<=(size*size)){
            if (playerQueue.isEmpty()) {
                System.out.println("No players in the queue!");
                return;
            }

            Player player=playerQueue.getFirst();
            System.out.println("Player: "+player.getName());
            System.out.print("Enter Position: ");
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();

            if(!board.checkIfEmpty(x,y)){
                System.out.println("Invalid Move, Please Try Again...");
                continue;
            }
            playerQueue.pollFirst();
            playerQueue.addLast(player);

            if(board.addPiece(x,y, player.getPiece())){
                board.printBoard();
                System.out.println("Player "+player.getName()+" is the Winner!");
                System.exit(0);
            }

            board.printBoard();
            playCount++;
        }
        System.out.println("Its a Draw");
    }

}
