package controller;
import model.Board;
import view.ChessView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessController {
    private Board board;
    private ChessView view;
    private int selectedRow = -1, selectedCol = -1;

    public ChessController(Board board, ChessView view) {
        this.board = board;
        this.view = view;
        initController();
    }

    private void initController() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int row = i, col = j;
                view.addButtonListener(i, j, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleClick(row, col);
                    }
                });
            }
        }
        view.updateBoard(board);
    }

    private void handleClick(int row, int col) {
        if (selectedRow == -1) {  
            if (board.getBoard()[row][col] != null) {
                selectedRow = row;
                selectedCol = col;
            }
        } else {
            if (board.movePiece(selectedRow, selectedCol, row, col)) {
                view.updateBoard(board);
            }
            selectedRow = -1;
            selectedCol = -1;
        }
    }
}