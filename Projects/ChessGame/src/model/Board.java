package model;

import java.io.Serializable;

public class Board implements Serializable {
    private ChessPiece[][] board;
    private boolean whiteTurn;

    public Board() {
        board = new ChessPiece[8][8];
        initializeBoard();
        whiteTurn = true;
    }

    // Método para configurar todas as peças no tabuleiro no início do jogo
    private void initializeBoard() {
        // Adiciona peões
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn(true);  // Peões brancos
            board[1][col] = new Pawn(false); // Peões pretos
        }

        // Adiciona torres
        board[7][0] = new Rook(true);
        board[7][7] = new Rook(true);
        board[0][0] = new Rook(false);
        board[0][7] = new Rook(false);

        // Adiciona cavalos
        board[7][1] = new Knight(true);
        board[7][6] = new Knight(true);
        board[0][1] = new Knight(false);
        board[0][6] = new Knight(false);

        // Adiciona bispos
        board[7][2] = new Bishop(true);
        board[7][5] = new Bishop(true);
        board[0][2] = new Bishop(false);
        board[0][5] = new Bishop(false);

        // Adiciona rainha
        board[7][3] = new Queen(true);
        board[0][3] = new Queen(false);

        // Adiciona rei
        board[7][4] = new King(true);
        board[0][4] = new King(false);
    }

    public ChessPiece getPiece(int row, int col) {
        if (row >= 0 && row < 8 && col >= 0 && col < 8) {
            return board[row][col];
        }
        return null;
    }

    public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        ChessPiece piece = board[fromRow][fromCol];
        if (piece == null || piece.isWhite() != whiteTurn) return false;
        if (!piece.isValidMove(fromRow, fromCol, toRow, toCol, board)) return false;

        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = null;
        whiteTurn = !whiteTurn;
        return true;
    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    public boolean isWhiteTurn() {
        return whiteTurn;
    }
}