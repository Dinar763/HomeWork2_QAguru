package guru_qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    @Test
    void firstTest() {
        assertTrue(3>2);
    }

    @Test
    void secondTest() {
        assertTrue(7>6);
    }
}
