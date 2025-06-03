import model.Board;
import view.ChessView;
import controller.ChessController;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        javax.swing.SwingUtilities.invokeLater(() -> {
            ChessView view = new ChessView();
            view.setVisible(true);
            new ChessController(board, view);
        });
    }
}