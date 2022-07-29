package Task1;

public class Chessboard {
    private int hight;
    private int width;

    public Chessboard(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    public void showBoard() {
        String [][] chessBoard = new String[hight][width];
        for (int i = 0; i< chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "*";
                else chessBoard[i][j] = " ";
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard[0].length; j++) {
                    System.out.print(" " + chessBoard[i][j] + " ");
                }
                System.out.println();
            }
    }
}
