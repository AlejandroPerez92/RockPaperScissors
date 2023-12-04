package com.alejandro.rockpaperscissors;

import java.util.HashMap;
import java.util.List;

public enum Moves {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD;

    public boolean isBeatenBy(Moves move) {
        var beats = new HashMap<Moves, List<Moves>>();
        beats.put(Moves.ROCK, List.of(Moves.PAPER));
        beats.put(Moves.PAPER, List.of(Moves.SCISSORS));
        beats.put(Moves.SCISSORS, List.of(Moves.ROCK));
        beats.put(Moves.LIZARD, List.of(Moves.ROCK));

        return beats.get(this).contains(move);
    }
}
