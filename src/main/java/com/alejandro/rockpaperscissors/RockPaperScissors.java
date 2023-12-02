package com.alejandro.rockpaperscissors;

public class RockPaperScissors {
    public String rockPaperScissors(Moves movePlayer1, Moves movePlayer2) {
        if (movePlayer1.equals(movePlayer2)) {
            return "draw";
        }

        if (movePlayer1.equals(Moves.ROCK) && movePlayer2.equals(Moves.SCISSORS)) {
            return "player1";
        }

        if (movePlayer1.equals(Moves.PAPER) && movePlayer2.equals(Moves.ROCK)) {
            return "player1";
        }

        if (movePlayer1.equals(Moves.SCISSORS) && movePlayer2.equals(Moves.PAPER)) {
            return "player1";
        }

        return "player2";
    }
}
