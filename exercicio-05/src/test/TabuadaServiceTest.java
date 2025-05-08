package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TabuadaServiceTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private TabuadaService service;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
        service = new TabuadaService();
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testTabuadaDo2_DeveImprimirCorretamente() {
        Numero numero = new Numero(2);
        service.exibirTabuada(numero);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("2 x 1 = 2"));
        assertTrue(output.contains("2 x 10 = 20"));
    }

    @Test
    void testTabuadaDo0_DeveImprimirTudoZero() {
        Numero numero = new Numero(0);
        service.exibirTabuada(numero);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("0 x 1 = 0"));
        assertTrue(output.contains("0 x 10 = 0"));
    }

    @Test
    void testNumeroNulo_DeveLancarNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
            service.exibirTabuada(null);
        });
    }
}
