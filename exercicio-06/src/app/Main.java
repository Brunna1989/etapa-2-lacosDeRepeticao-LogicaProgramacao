package app;

import model.Numeros;
import service.NumerosService;

public class Main {
    public static void main(String[] args) {
        NumerosService service = new NumerosService();
        Numeros numeros = service.gerarNumerosAleatorios(10);
        service.exibirNumerosComMaiorEMenor(numeros);
    }
}
