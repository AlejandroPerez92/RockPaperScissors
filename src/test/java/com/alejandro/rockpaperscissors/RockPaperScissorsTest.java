package com.alejandro.rockpaperscissors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {
    private RockPaperScissors sut;

    @BeforeEach
    public void setUp() {
        this.sut = new RockPaperScissors();
    }

    @Test
    public void givenIhaveChosenRockWhenTheOpponentChoosesScissorsThenIShouldWin() {
        var playerChoose = Moves.ROCK;
        var opponent = Moves.SCISSORS;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player1", result);
    }

    @Test
    public void givenIhaveChosenRockWhenTheOpponentChoosesLizardThenIShouldWin() {
        var playerChoose = Moves.ROCK;
        var opponent = Moves.LIZARD;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player1", result);
    }

    @Test
    void GivenIHaveChosenLizardWhenTheOpponentChoosesRockThenTheOpponentWin() {
        var playerChoose = Moves.LIZARD;
        var opponent = Moves.ROCK;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenScissorsWhenTheOpponentChoosesRockThenTheOpponentWin() {
        var playerChoose = Moves.SCISSORS;
        var opponent = Moves.ROCK;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenPaperWhenTheOpponentChoosesRockThenIShouldWin() {
        var playerChoose = Moves.PAPER;
        var opponent = Moves.ROCK;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player1", result);
    }

    @Test
    void GivenIHaveChosenPaperWhenTheOpponentChoosesLizardThenTheOpponentWin() {
        var playerChoose = Moves.PAPER;
        var opponent = Moves.LIZARD;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenRockWhenTheOpponentChoosesPaperThenTheOpponentShouldWin() {
        var playerChoose = Moves.ROCK;
        var opponent = Moves.PAPER;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenScissorsWhenTheOpponentChoosesPaperThenIShouldWin() {
        var playerChoose = Moves.SCISSORS;
        var opponent = Moves.PAPER;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player1", result);
    }

    @Test
    void GivenIHaveChosenPaperWhenTheOpponentChoosesScissorsThenTheOpponentShouldWin() {
        var playerChoose = Moves.PAPER;
        var opponent = Moves.SCISSORS;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("player2", result);
    }

    @Test
    void GivenIHaveChosenRockWhenTheOpponentChoosesRockThenItShouldBeADraw() {
        var playerChoose = Moves.ROCK;
        var opponent = Moves.ROCK;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("draw", result);
    }

    @Test
    void GivenIHaveChosenScissorsWhenTheOpponentChoosesScissorsThenItShouldBeADraw() {
        var playerChoose = Moves.SCISSORS;
        var opponent = Moves.SCISSORS;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("draw", result);
    }

    @Test
    void GivenIHaveChosenPaperWhenTheOpponentChoosesPaperThenItShouldBeADraw() {
        var playerChoose = Moves.PAPER;
        var opponent = Moves.PAPER;

        var result = this.sut.rockPaperScissors(playerChoose, opponent);
        Assertions.assertEquals("draw", result);
    }
}
