package lt.ktriponis.euler.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

class PrimeNumbers {

    private static final List<Integer> PRIME_NUMBERS = new ArrayList<>(asList(2, 3, 5, 7));

    private int currentPrimeIndex = -1;
    private int lastPrime = 0;

    private PrimeNumbers() {
    }

    private int nextPrime() {
        if (PRIME_NUMBERS.size() <= ++currentPrimeIndex)
            PRIME_NUMBERS.add(IntStream.iterate(lastPrime + 2, n -> n + 2)
                    .filter(this::isPrime)
                    .findFirst()
                    .orElseThrow());
        lastPrime = PRIME_NUMBERS.get(currentPrimeIndex);
        return lastPrime;
    }

    private boolean isPrime(int number) {
        int max = (int) Math.sqrt(number);
        return PRIME_NUMBERS.stream()
                .skip(1)
                .takeWhile(n -> n <= max)
                .allMatch(n -> number % n != 0);
    }

    private IntStream stream() {
        return IntStream.generate(this::nextPrime);
    }


    static IntStream getPrimeNumbers() {
        return new PrimeNumbers().stream();
    }
}
