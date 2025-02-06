package Model;

import Model.Piece.Piece;

public class Board {
    private int size;
    private Piece[][] board;
    private int[][] row;
    private int[][] column;
    private int[] primaryDiagonal;
    private int[] secondaryDiagonal;

    public Board(int size){
        this.size=size;
        this.board=new Piece[size][size];
        this.row=new int[2][size];
        this.column=new int[2][size];
        this.primaryDiagonal=new int[2];
        this.secondaryDiagonal=new int[2];
    }

    public Boolean checkIfEmpty(int i,int j){
        if(this.board[i][j]!=null) return false;
        return true;
    }

    public Boolean addPiece(int i,int j,Piece piece){
        this.board[i][j]=piece;
        row[piece.getPieceType()][i]++;
        if(row[piece.getPieceType()][i]==size) return true;
        column[piece.getPieceType()][j]++;
        if(column[piece.getPieceType()][j]==size) return true;
        if(i==j){
            primaryDiagonal[piece.getPieceType()]++;
            if(primaryDiagonal[piece.getPieceType()]==size) return true;
        }
        if(j==(size-1-i)){
            secondaryDiagonal[piece.getPieceType()]++;
            if(secondaryDiagonal[piece.getPieceType()]==size) return true;
        }
        return false;
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(new StringBuilder()
                        .append(" ")
                        .append((board[i][j] != null) ? board[i][j] : " ")
                        .append(" ")
                        .toString());
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();

            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("---");
                    if (j < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
    }


}
