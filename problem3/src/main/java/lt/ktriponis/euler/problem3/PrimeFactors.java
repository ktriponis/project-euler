package lt.ktriponis.euler.problem3;

import java.util.stream.IntStream;

import static lt.ktriponis.euler.problem3.PrimeNumbers.*;

class PrimeFactors {

    private long number;

    private PrimeFactors(long number) {
        this.number = number;
    }

    private int nextPrime() {
        if (number == 1)
            return -1;
        int prime = getPrimeNumbers()
                .filter(n -> number % n == 0)
                .findFirst()
                .orElseThrow();
        number /= prime;
        return prime;
    }

    private IntStream stream() {
        return IntStream.generate(this::nextPrime)
                .takeWhile(n -> n != -1);
    }

    static IntStream getPrimesOf(long number) {
        return new PrimeFactors(number).stream();
    }
}
