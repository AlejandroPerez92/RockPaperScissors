# Rock Paper Scissors kata

We are creating a rock-paper-scissors game, to do so, we create the rules of the game

## Rock Beats Scissors

**Business needs / User story**

```
As a player
I want the rock to beat scissors
```

**Solution**

```
Given I have chosen rock
When the opponent chooses scissors
Then I should win
```

```
Given I have chosen scissors
When the opponent chooses rock
Then the opponent win
```

## Paper Beats Rock

**Business needs / User story**

```
As a player
I want the paper to beat rock
```

**Solution**

```
Given I have chosen paper
When the opponent chooses rock
Then I should win
```

```
Given I have chosen rock
When the opponent chooses paper
Then the opponent should win
```

## Scissors Beats Paper

**Business needs / User story**

```
As a player
I want scissors to beat paper
```

**Solution**

```
Given I have chosen scissors
When the opponent chooses paper
Then I should win
```

```
Given I have chosen paper
When the opponent chooses scissors
Then the opponent should win
```

## Same Moves Result in Draw

**Business need / User story**

```
As a player
I want the same moves to draw
```

**Solution**

```
Given I have chosen rock
When the opponent chooses rock
Then it should be a draw
```

```
Given I have chosen scissors
When the opponent chooses scissors
Then it should be a draw
```

```
Given I have chosen paper
When the opponent chooses paper
Then it should be a draw
```

## Valid API

```java
public class RockPaperScissors {
    public String rockPaperSissors(String movePlayer1, String movePlayer2) {}
}
```

```java
public class RockPaperScissors {
    public GameStatus rockPaperSissors(Moves movePlayer1, Moves movePlayer2) {}
}
```