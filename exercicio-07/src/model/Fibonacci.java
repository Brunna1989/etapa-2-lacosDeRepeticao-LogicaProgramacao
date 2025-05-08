package model;

import java.util.List;

public class Fibonacci {
    private final List<Integer> sequence;

    public Fibonacci(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    @Override
    public String toString() {
        return sequence.toString();
    }
}
