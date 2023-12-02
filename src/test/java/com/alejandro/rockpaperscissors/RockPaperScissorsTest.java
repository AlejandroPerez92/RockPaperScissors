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
        Assertions.assertEquals("player1", result);
    }

    @Test
    void GivenIHaveChosenScissorsWhenTheOpponentChoosesRockThenTheOpponentWin() {
        var playerChoose = "scissors";
        var opponent = "rock";

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenPaperWhenTheOpponentChoosesRockThenIShouldWin() {
        var playerChoose = "paper";
        var opponent = "rock";

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player1", result);
    }

    @Test
    void GivenIHaveChosenRockWhenTheOpponentChoosesPaperThenTheOpponentShouldWin() {
        var playerChoose = "rock";
        var opponent = "paper";

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }
}
