package app;

import model.Numero;
import service.TabuadaService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabuadaService service = new TabuadaService();

        System.out.print("Digite um número para ver a tabuada: ");
        int entrada = scanner.nextInt();

        Numero numero = new Numero(entrada);
        service.exibirTabuada(numero);

        scanner.close();
    }
}
