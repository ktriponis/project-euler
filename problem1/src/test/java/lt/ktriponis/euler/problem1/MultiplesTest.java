package lt.ktriponis.euler.problem1;

import lt.ktriponis.euler.problem1.Multiples.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static lt.ktriponis.euler.problem1.Multiples.*;
import static org.assertj.core.api.Assertions.*;

class MultiplesTest {

    @Test
    void utilityClass() {
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(Multiples::new)
                .withMessage("Utility class");
    }

    @Test
    void edgeCases() {
        assertThat(getMultiplesOf(0)).isEmpty();
        assertThatExceptionOfType(MultiplesException.class)
                .isThrownBy(() -> getMultiplesOf(1, 0))
                .withMessage("Zero has no multiples");
    }

    @Test
    void listMultiples() {
        assertThat(getMultiplesOf(3, 1)).containsExactly(1, 2);
        assertThat(getMultiplesOf(5, 1)).containsExactly(1, 2, 3, 4);
        assertThat(getMultiplesOf(5, 2)).containsExactly(2, 4);
        assertThat(getMultiplesOf(10, 2)).containsExactly(2, 4, 6, 8);
        assertThat(getMultiplesOf(10, 3)).containsExactly(3, 6, 9);
        assertThat(getMultiplesOf(10, 5)).containsExactly(5);
        assertThat(getMultiplesOf(10, 3, 5)).containsExactly(3, 5, 6, 9);
        assertThat(getMultiplesOf(10, 2, 3, 5)).containsExactly(2, 3, 4, 5, 6, 8, 9);
        assertThat(getMultiplesOf(33, 7, 11)).containsExactly(7, 11, 14, 21, 22, 28);
    }

    @Tag("result")
    @Test
    void multiplesOf3And5() {
        System.out.println("Multiples of 3 and 5: " + getMultiplesOf(1000, 3, 5).sum());
    }
}
