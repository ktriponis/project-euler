package lt.ktriponis.euler.problem1;

import java.util.stream.IntStream;

class Multiples {

    Multiples() {
        throw new IllegalStateException("Utility class");
    }

    static IntStream getMultiplesOf(int maxExclusive, int... numbers) {
        if (maxExclusive < 0 || numbers.length < 1)
            return IntStream.empty();
        if (numbers[0] == 0)
            throw new MultiplesException("Zero has no multiples");

        return IntStream.range(1, maxExclusive)
                .filter(num -> IntStream.of(numbers).anyMatch(i -> num % i == 0));
    }

    static final class MultiplesException extends RuntimeException {

        MultiplesException(String message) {
            super(message);
        }
    }
}
