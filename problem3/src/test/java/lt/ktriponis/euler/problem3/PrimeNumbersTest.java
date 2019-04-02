package lt.ktriponis.euler.problem3;

import org.junit.jupiter.api.Test;

import static lt.ktriponis.euler.problem3.PrimeNumbers.*;
import static org.assertj.core.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void primeNumbers() {
        assertThat(getPrimeNumbers().limit(20))
                .containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
    }
}
