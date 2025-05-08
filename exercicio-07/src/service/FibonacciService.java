package service;

import model.Fibonacci;
import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

    public Fibonacci generate(int n) {
        List<Integer> sequence = new ArrayList<>();

        int i = 0;
        int a = 0, b = 1;

        while (i <= n) {
            sequence.add(a);
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }

        return new Fibonacci(sequence);
    }
}
