package Model;

public abstract class Piece {
    public String name;
    public String color;

    public Piece(String color) {
        this.color = color;
    }

    public abstract boolean canMove(Cell source, Cell destination, Cell[][] board);

    public abstract String getSymbol();
}

class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
        this.name = "Pawn";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        int direction = this.color.equals("white") ? -1 : 1;
        int startRow = this.color.equals("white") ? 6 : 1;

        if (source.y == destination.y) {
            if (destination.piece == null && destination.x == source.x + direction) {
                return true;
            }
            if (source.x == startRow && destination.x == source.x + 2 * direction && destination.piece == null) {
                if (board[source.x + direction][source.y].piece == null) {
                    return true;
                }
            }
        }
        if (Math.abs(source.y - destination.y) == 1 && destination.x == source.x + direction) {
            if (destination.piece != null && !destination.piece.color.equals(this.color)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "P" : "p";
    }
}

class Rook extends Piece {
    public Rook(String color) {
        super(color);
        this.name = "Rook";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        if (destination.piece != null && destination.piece.color.equals(this.color))
            return false;

        if (source.x != destination.x && source.y != destination.y)
            return false;

        if (source.x == destination.x) {
            int step = source.y < destination.y ? 1 : -1;
            for (int j = source.y + step; j != destination.y; j += step) {
                if (board[source.x][j].piece != null) return false;
            }
        } else {
            int step = source.x < destination.x ? 1 : -1;
            for (int i = source.x + step; i != destination.x; i += step) {
                if (board[i][source.y].piece != null) return false;
            }
        }
        return true;
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "R" : "r";
    }
}

class Knight extends Piece {
    public Knight(String color) {
        super(color);
        this.name = "Knight";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        if (destination.piece != null && destination.piece.color.equals(this.color))
            return false;
        int xDiff = Math.abs(source.x - destination.x);
        int yDiff = Math.abs(source.y - destination.y);
        return (xDiff == 2 && yDiff == 1) || (xDiff == 1 && yDiff == 2);
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "N" : "n";
    }
}

class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
        this.name = "Bishop";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        if (destination.piece != null && destination.piece.color.equals(this.color))
            return false;
        int xDiff = Math.abs(source.x - destination.x);
        int yDiff = Math.abs(source.y - destination.y);
        if (xDiff != yDiff) return false;
        int xStep = source.x < destination.x ? 1 : -1;
        int yStep = source.y < destination.y ? 1 : -1;
        int x = source.x + xStep, y = source.y + yStep;
        while (x != destination.x && y != destination.y) {
            if (board[x][y].piece != null) return false;
            x += xStep;
            y += yStep;
        }
        return true;
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "B" : "b";
    }
}

class Queen extends Piece {
    public Queen(String color) {
        super(color);
        this.name = "Queen";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        if (destination.piece != null && destination.piece.color.equals(this.color))
            return false;
        int xDiff = Math.abs(source.x - destination.x);
        int yDiff = Math.abs(source.y - destination.y);

        if (source.x == destination.x || source.y == destination.y) {
            if (source.x == destination.x) {
                int step = source.y < destination.y ? 1 : -1;
                for (int j = source.y + step; j != destination.y; j += step) {
                    if (board[source.x][j].piece != null) return false;
                }
            } else {
                int step = source.x < destination.x ? 1 : -1;
                for (int i = source.x + step; i != destination.x; i += step) {
                    if (board[i][source.y].piece != null) return false;
                }
            }
            return true;
        }

        if (xDiff == yDiff) {
            int xStep = source.x < destination.x ? 1 : -1;
            int yStep = source.y < destination.y ? 1 : -1;
            int x = source.x + xStep;
            int y = source.y + yStep;
            while (x != destination.x && y != destination.y) {
                if (board[x][y].piece != null) return false;
                x += xStep;
                y += yStep;
            }
            return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "Q" : "q";
    }
}

class King extends Piece {
    public King(String color) {
        super(color);
        this.name = "King";
    }

    @Override
    public boolean canMove(Cell source, Cell destination, Cell[][] board) {
        if (destination.piece != null && destination.piece.color.equals(this.color))
            return false;
        int xDiff = Math.abs(source.x - destination.x);
        int yDiff = Math.abs(source.y - destination.y);
        return (xDiff <= 1 && yDiff <= 1);
    }

    @Override
    public String getSymbol() {
        return this.color.equals("white") ? "K" : "k";
    }
}
