package test;

import model.Fibonacci;
import org.junit.Test;
import service.FibonacciService;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

public class FibonacciServiceTest {

    private final FibonacciService service = new FibonacciService();

    @Test
    public void testarFibonacciUp9() {
        Fibonacci result = service.generate(9);
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals("A sequência gerada para n=9 está incorreta", expected, result.getSequence());
    }

    @Test
    public void tesarGerarComZero() {
        Fibonacci result = service.generate(0);
        List<Integer> expected = List.of(0);
        assertEquals("A sequência gerada para n=0 deve conter apenas o número 0", expected, result.getSequence());
    }

    @Test
    public void testarGerar1() {
        Fibonacci result = service.generate(1);
        List<Integer> expected = List.of(0, 1);
        assertEquals("A sequência gerada para n=1 deve conter [0, 1]", expected, result.getSequence());
    }

    @Test
    public void testarGenerarNegativo() {
        Fibonacci result = service.generate(-5);
        List<Integer> expected = Collections.emptyList();
        assertEquals("Para numeros negativos, a sequência deve ser vazia", expected, result.getSequence());
    }
}
