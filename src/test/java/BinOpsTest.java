import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BinOpsTest {

    @ParameterizedTest
    @CsvSource(value = {"110000,1110,111110",
            "100,1100010101,1100011001"})
    void sum(String a1, String a2, String expected) {
        assertEquals(expected, BinOps.sum(a1, a2));
    }

    @ParameterizedTest
    @CsvSource(value = {"110000,1110,1010100000",
            "100,1100010101,110001010100"})
    void mult(String a1, String a2, String expected) {
        assertEquals(expected, BinOps.mult(a1, a2));
    }
}
