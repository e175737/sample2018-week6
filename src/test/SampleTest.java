import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertion;

public class SampleTest {

    @Test
    void add() {
        Sample sample = new Samle();
        int result = sample.add(a:2, b:3);
        assertEquals(expected:5, result);
        }
}
