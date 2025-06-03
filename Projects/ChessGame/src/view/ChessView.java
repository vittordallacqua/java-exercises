package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import model.ChessPiece;

public class ChessView extends JFrame {
    private JButton[][] buttons = new JButton[8][8];
    private JLabel statusLabel;

    public ChessView() {
        setTitle("Jogo de Xadrez");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        JPanel boardPanel = new JPanel(new GridLayout(8, 8));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                buttons[i][j] = new JButton();
                if ((i + j) % 2 == 0)
                    buttons[i][j].setBackground(Color.LIGHT_GRAY);
                else
                    buttons[i][j].setBackground(Color.DARK_GRAY);
                boardPanel.add(buttons[i][j]);
            }
        }

        add(boardPanel, BorderLayout.CENTER);
        statusLabel = new JLabel("Turno: Branco");
        add(statusLabel, BorderLayout.SOUTH);
    }

    public void updateBoard(model.Board boardModel) {
        ChessPiece[][] board = boardModel.getBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                buttons[i][j].setText(board[i][j] != null ? board[i][j].getSymbol() : "");
            }
        }
        statusLabel.setText(boardModel.isWhiteTurn() ? "Turno: Branco" : "Turno: Preto");
    }

    public void addButtonListener(int row, int col, ActionListener al) {
        buttons[row][col].addActionListener(al);
    }
}