package Model;

public class Game {
    public Cell[][] chessboard;
    public Player player1;
    public Player player2;
    public Player currentPlayer;

    public Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = p1;
        chessboard = new Cell[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessboard[i][j] = new Cell(i, j);
            }
        }
        chessboard[0][0].piece = new Rook("black");
        chessboard[0][1].piece = new Knight("black");
        chessboard[0][2].piece = new Bishop("black");
        chessboard[0][3].piece = new Queen("black");
        chessboard[0][4].piece = new King("black");
        chessboard[0][5].piece = new Bishop("black");
        chessboard[0][6].piece = new Knight("black");
        chessboard[0][7].piece = new Rook("black");
        for (int j = 0; j < 8; j++) {
            chessboard[1][j].piece = new Pawn("black");
        }
        chessboard[7][0].piece = new Rook("white");
        chessboard[7][1].piece = new Knight("white");
        chessboard[7][2].piece = new Bishop("white");
        chessboard[7][3].piece = new Queen("white");
        chessboard[7][4].piece = new King("white");
        chessboard[7][5].piece = new Bishop("white");
        chessboard[7][6].piece = new Knight("white");
        chessboard[7][7].piece = new Rook("white");
        for (int j = 0; j < 8; j++) {
            chessboard[6][j].piece = new Pawn("white");
        }
    }

    public boolean movePiece(int srcX, int srcY, int destX, int destY) {
        if (!isWithinBoard(srcX, srcY) || !isWithinBoard(destX, destY))
            return false;

        Cell source = chessboard[srcX][srcY];
        Cell destination = chessboard[destX][destY];
        if (source.piece == null) return false; // no piece at source

        if (!source.piece.color.equals(currentPlayer.color)) return false;

        if (source.piece.canMove(source, destination, chessboard)) {
            destination.piece = source.piece;
            source.piece = null;
            return true;
        }
        return false;
    }

    private boolean isWithinBoard(int x, int y) {
        return (x >= 0 && x < 8 && y >= 0 && y < 8);
    }

    public void printBoard() {
        System.out.println("\nBoard State:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessboard[i][j].piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(chessboard[i][j].piece.getSymbol() + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Cell {
    public int x;
    public int y;
    public Piece piece;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.piece = null;
    }
}

