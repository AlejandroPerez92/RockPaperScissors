package com.alejandro.rockpaperscissors;

public class RockPaperScissors {
    public String rockPaperScissors(Moves movePlayer1, Moves movePlayer2) {

        if (movePlayer1.equals(movePlayer2)) {
            return "draw";
        }

        if (movePlayer1.isBeatenBy(movePlayer2)) {
            return "player2";
        }

        return "player1";
    }
}
