package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void correctAnswerReturnsTrue() {

        Game game = new Game();
        boolean result = game.checkAnswer("lovely", "lovely");
        assertTrue(result);
    }

    @Test
    void incorrectAnswerReturnsFalse() {
        Game game = new Game();
        boolean result = game.checkAnswer("summer", "lovely");

        assertFalse(result);
    }

    @Test
    void capitalizationDoesNotMatter() {
        Game game = new Game();
        boolean result = game.checkAnswer("LOVELY", "lovely");

        assertTrue(result);
    }
}
