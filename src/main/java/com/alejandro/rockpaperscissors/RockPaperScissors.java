package com.alejandro.rockpaperscissors;

public class RockPaperScissors {
    public String rockPaperScissors(String movePlayer1, String movePlayer2) {
        if (movePlayer1.equals("rock") && movePlayer2.equals("rock")) {
            return "draw";
        }

        if (movePlayer1.equals("scissors") && movePlayer2.equals("scissors")) {
            return "draw";
        }

        if (movePlayer1.equals("rock") && movePlayer2.equals("scissors")) {
            return "player1";
        }

        if (movePlayer1.equals("paper") && movePlayer2.equals("rock")) {
            return "player1";
        }

        if (movePlayer1.equals("scissors") && movePlayer2.equals("paper")) {
            return "player1";
        }

        return "player2";
    }
}
