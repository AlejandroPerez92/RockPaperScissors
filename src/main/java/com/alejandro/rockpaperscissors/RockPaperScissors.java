package com.alejandro.rockpaperscissors;

public class RockPaperScissors {
    public String rockPaperScissors(String movePlayer1, String movePlayer2) {
        if (movePlayer1.equals("rock") && movePlayer2.equals("scissors")) {
            return "player1";
        }
        return "";
    }
}
