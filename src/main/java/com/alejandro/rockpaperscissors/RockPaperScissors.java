package com.alejandro.rockpaperscissors;

import java.util.HashMap;
import java.util.List;

public class RockPaperScissors {
    public String rockPaperScissors(Moves movePlayer1, Moves movePlayer2) {
        var beats = new HashMap<Moves, List<Moves>>();
        beats.put(Moves.ROCK, List.of(Moves.PAPER));
        beats.put(Moves.PAPER, List.of(Moves.SCISSORS));
        beats.put(Moves.SCISSORS, List.of(Moves.ROCK));

        if (movePlayer1.equals(movePlayer2)) {
            return "draw";
        }

        if (beats.get(movePlayer1).contains(movePlayer2)) {
            return "player2";
        }

        return "player1";
    }
}
