package lt.ktriponis.euler.problem1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static lt.ktriponis.euler.problem1.Fibonacci.*;
import static org.assertj.core.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        assertThat(getFibonacciSequence().limit(1)).containsExactly(1);
        assertThat(getFibonacciSequence().limit(2)).containsExactly(1, 2);
        assertThat(getFibonacciSequence().limit(3)).containsExactly(1, 2, 3);
        assertThat(getFibonacciSequence().limit(4)).containsExactly(1, 2, 3, 5);
        assertThat(getFibonacciSequence().limit(5)).containsExactly(1, 2, 3, 5, 8);
        assertThat(getFibonacciSequence().limit(10)).containsExactly(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
    }

    @Tag("result")
    @Test
    void evenFibonacciNumbers() {
        System.out.println("Even Fibonacci numbers: " + getFibonacciSequence()
                .takeWhile(n -> n <= 4_000_000)
                .filter(n -> n % 2 == 0)
                .sum());
    }
}
