package test;

import org.junit.Test;
import service.LeituraNumeroService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class LeituraNumeroServiceTest {

    @Test
    public void testarLerNumero_QuandoUsuarioDigita10_DeveSair() {
        String input = "10\n";
        InputStream systemInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LeituraNumeroService service = new LeituraNumeroService();
        int numero = service.lerNumero();

        System.setIn(systemInBackup);
        assertEquals(10, numero);
    }

    @Test
    public void testarLerNumero_QuandoUsuarioDigitaString_DeveSolicitarNumeroValido() {
        String input = "abc\n5\n10\n";
        InputStream systemInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        LeituraNumeroService service = new LeituraNumeroService();
        int numero = service.lerNumero();

        System.setIn(systemInBackup);
        assertEquals(10, numero);
    }

    @Test
    public void testarLerNumero_QuandoUsuarioDigitaOutroNumero_DeveContinuarSolicitando() {
        String input = "5\n3\n10\n";
        InputStream systemInBackup = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        LeituraNumeroService service = new LeituraNumeroService();
        int numero = service.lerNumero();

        System.setIn(systemInBackup);
        assertEquals(10, numero);
    }
}
