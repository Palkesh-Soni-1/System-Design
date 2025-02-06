package Model.Piece;

public abstract class Piece {
    private PieceType pieceType;
    private Character character;
    public Piece(PieceType pieceType,Character character){
        this.pieceType=pieceType;
        this.character=character;
    }
    public int getPieceType(){
        return pieceType.ordinal();
    }

    @Override
    public String toString() {
        return character.toString();
    }
}
