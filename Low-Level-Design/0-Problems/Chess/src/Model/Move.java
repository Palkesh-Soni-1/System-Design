package Model;

public class Move {
    int srcX, srcY, destX, destY;
    Player player;

    public Move(int srcX, int srcY, int destX, int destY, Player player) {
        this.srcX = srcX;
        this.srcY = srcY;
        this.destX = destX;
        this.destY = destY;
        this.player = player;
    }

    @Override
    public String toString() {
        return player.name + " moved from (" + srcX + ", " + srcY + ") to (" + destX + ", " + destY + ")";
    }
}
