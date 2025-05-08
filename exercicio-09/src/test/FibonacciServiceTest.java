package test;

import model.Fibonacci;
import org.junit.Test;
import service.FibonacciService;

import static org.junit.Assert.*;

public class FibonacciServiceTest {

    private final FibonacciService service = new FibonacciService();

    @Test
    public void deveGerarSerieAte25() {
        Fibonacci resultado = service.gerarSerieAte(25);
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21]", resultado.getSerie().toString());
    }

    @Test
    public void deveGerarSerieComLimiteZero() {
        Fibonacci resultado = service.gerarSerieAte(0);
        assertEquals("[0]", resultado.getSerie().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaNumeroNegativo() {
        service.gerarSerieAte(-10);
    }
}
