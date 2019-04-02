package lt.ktriponis.euler.problem1;

import java.util.stream.IntStream;

class Fibonacci {

    private int previous = 0;
    private int current = 1;

    private Fibonacci() {
    }

    private int nextInt() {
        int previousTmp = previous;
        previous = current;
        current = current + previousTmp;
        return current;
    }

    private IntStream stream() {
        return IntStream.generate(this::nextInt);
    }

    static IntStream getFibonacciSequence() {
        return new Fibonacci().stream();
    }
}
