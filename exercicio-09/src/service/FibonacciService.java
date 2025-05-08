package service;

import model.Fibonacci;

public class FibonacciService {

    public Fibonacci gerarSerieAte(int limite) {
        Fibonacci fibonacci = new Fibonacci();

        int a = 0, b = 1;

        if (limite < 0) {
            throw new IllegalArgumentException("O número limite deve ser não negativo.");
        }

        while (a <= limite) {
            fibonacci.adicionarNumero(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return fibonacci;
    }
}
