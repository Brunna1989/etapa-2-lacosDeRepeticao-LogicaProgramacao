package test;

import model.Numeros;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.NumerosService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumerosServiceTest {

    private NumerosService service;

    @BeforeEach
    void setUp() {
        service = new NumerosService();
    }

    @Test
    void testGerarNumerosAleatorios_DeveGerar10Numeros() {
        Numeros numeros = service.gerarNumerosAleatorios(10);
        assertEquals(10, numeros.getNumeros().size());
        for (int numero : numeros.getNumeros()) {
            assertTrue(numero >= 0 && numero <= 100);
        }
    }

    @Test
    void testGerarNumerosAleatorios_ListaVazia_DeveRetornarListaVazia() {
        Numeros numeros = service.gerarNumerosAleatorios(0);
        assertTrue(numeros.getNumeros().isEmpty());
        for (int numero : numeros.getNumeros()) {
            fail("Não deveria haver números na lista");
        }
    }

    @Test
    void testExibirNumerosComMaiorEMenor_ComListaValida() {
        List<Integer> lista = List.of(10, 55, 87, 3, 100);
        Numeros numeros = new Numeros(lista);

        assertDoesNotThrow(() -> service.exibirNumerosComMaiorEMenor(numeros));
    }

    @Test
    void testExibirNumerosComMaiorEMenor_ComListaVazia_DeveLancarExcecao() {
        Numeros numeros = new Numeros(new ArrayList<>());

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> service.exibirNumerosComMaiorEMenor(numeros));

        assertEquals("A lista de números está vazia ou nula.", exception.getMessage());
    }

    @Test
    void testExibirNumerosComMaiorEMenor_ComListaNula_DeveLancarExcecao() {
        Numeros numeros = new Numeros(null);

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> service.exibirNumerosComMaiorEMenor(numeros));

        assertEquals("A lista de números está vazia ou nula.", exception.getMessage());
    }
}
