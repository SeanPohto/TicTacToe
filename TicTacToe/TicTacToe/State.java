package TicTacToe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    public boolean isWinner() {
        int total;
        for (int row=0; row < Constants.BOARD_SIZE; row++) {
            total = this.getBoardCell (row,0) + this.getBoardCell (row,1) + this.getBoardCell (row,2);
            if (total == -3 || total == 3) {
                return true;
            }
        }
        for (int col=0; col < Constants.BOARD_SIZE; col++) {
            total = this.getBoardCell (col,0) + this.getBoardCell (col,1) + this.getBoardCell (col,2);
            if (total == -3 || total == 3) {
                return true;
            }
        }
        for (int row=0; row < Constants.BOARD_SIZE; row++) {
            total = this.getBoardCell (0,0) + this.getBoardCell(1,1) + this.getBoardCell (2,2);
            if (total 
        }
    }

    public boolean isTie() {
        // You will write this code too!!
    }

    public int getameState() {
        return this.gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }

}
