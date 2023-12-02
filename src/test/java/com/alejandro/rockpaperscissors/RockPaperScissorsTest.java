package com.alejandro.rockpaperscissors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RockPaperScissorsTest {
    private RockPaperScissors sut;

    @BeforeEach
    public void setUp() {
        this.sut = new RockPaperScissors();
    }

    @Test
    public void givenIhaveChosenRockWhenTheOpponentChoosesScissorsThenIShouldWin() {
        var playerChoose = "rock";
        var opponent = "scissors";

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("win", result);
    }

}
