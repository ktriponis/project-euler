package lt.ktriponis.euler.problem3;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static lt.ktriponis.euler.problem3.PrimeFactors.*;
import static org.assertj.core.api.Assertions.*;

class PrimeFactorsTest {

    @Test
    void primeFactors() {
        assertThat(getPrimesOf(1)).isEmpty();
        assertThat(getPrimesOf(2)).containsExactly(2);
        assertThat(getPrimesOf(3)).containsExactly(3);
        assertThat(getPrimesOf(4)).containsExactly(2, 2);
        assertThat(getPrimesOf(6)).containsExactly(2, 3);
        assertThat(getPrimesOf(9)).containsExactly(3, 3);
        assertThat(getPrimesOf(10)).containsExactly(2, 5);
        assertThat(getPrimesOf(15)).containsExactly(3, 5);
        assertThat(getPrimesOf(30)).containsExactly(2, 3, 5);
        assertThat(getPrimesOf(100)).containsExactly(2, 2, 5, 5);
        assertThat(getPrimesOf(13195)).containsExactly(5, 7, 13, 29);
    }

    @Tag("result")
    @Test
    void largestPrimeFactor() {
        System.out.println("Largest prime factor: " + getPrimesOf(600851475143L).max().orElseThrow());
    }
}
