package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SonnetTest {

    @Test
    void sonnetHasFourteenLines() {
        Sonnet sonnet = new Sonnet();
        String[] lines = sonnet.getLines();
        assertEquals(14, lines.length);
    }

    @Test
    void sonnetStartWithCorrectLine() {
        Sonnet sonnet = new Sonnet();
        String[] lines = sonnet.getLines();
        assertEquals("Shall I compare thee to a summer's day?", lines[0]);
    }

    @Test
    void sonnetEndsWithCorrectLine() {
        Sonnet sonnet = new Sonnet();
        String[] lines = sonnet.getLines();

        assertEquals("So long lives this, and this gives life to thee.", lines[13]);
    }
}
