public class TicTacToe {

    public static void main(String[] args) {
        int[] ticTacToeField = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int currentPlayer = 1;

        System.out.println("Welcome to TicTacToe");

        for (int i = 0; i < 9; i++) {
            choose(currentPlayer, ticTacToeField);
            System.out.println(asString(ticTacToeField));
            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
            int winner = getWinner(ticTacToeField);
            if (winner != 0) {
                System.out.printf("The game is over. Player %d won!\n", winner);
                System.exit(1);
            }
        }

        int winner = getWinner(ticTacToeField);
        if (winner != 0) {
            System.out.printf("The game is over. Player %d won!\n", winner);
        } else {
            System.out.println("The game is over. It's a draw.");
        }
    }

    /**
     * write a method that should define a winner
     * should return 1 if Player 1 has any three X's in a row
     * should retrun 2 if Player 2 has any three O's in a row
     * should return 0 if no Player has won yet
     */
    public static int getWinner(int[] ticTacToeField) {
        // TODO 1 - make sure to make all tests in GetWinnerTest pass
        return 0;
    }

    /**
     * write a method that asks the player to choose one of the free fields in the tictactoe field
     * the method receives the player whose turn it is (either 1 or 2) and the current ticTacToe field
     * the method should ask the player which field should be set and modify the respective field
     * if the player chooses an invalid field (a field that is already used or not in the range),
     * the user should be asked again until he chooses a valid field
     */
    public static void choose(int player, int[] ticTacToeField) {
        // TODO 2 - make sure to make all tests in ChooseFieldTest pass
    }

    /**
     * write a method that transforms a TicTacToeField to a String
     * a 0 in the field states that the field was not yet chosen
     * a 1 in the field states that player 1 chose that field, mark it with an X
     * a 2 in the field states that player 2 chose that field, mark it with an O
     */
    public static String asString(int[] ticTacToeField) {
        // TODO 3 - Make sure to make all tests in PrintTicTacToeTest pass
        return "";
    }

}
