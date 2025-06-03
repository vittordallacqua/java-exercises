package model;

public class Pawn extends ChessPiece {

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, ChessPiece[][] board) {
        int direction = white ? -1 : 1;  // Brancos sobem, pretos descem

        // Movimento básico: uma casa à frente
        if (fromCol == toCol && toRow - fromRow == direction && board[toRow][toCol] == null) {
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return white ? "♙" : "♟";
    }
}