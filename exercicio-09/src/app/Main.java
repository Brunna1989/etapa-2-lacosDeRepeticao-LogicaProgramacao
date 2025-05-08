package app;

import model.Fibonacci;
import service.FibonacciService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciService service = new FibonacciService();

        System.out.print("Informe o número limite para a série de Fibonacci: ");
        int limite = scanner.nextInt();

        try {
            Fibonacci resultado = service.gerarSerieAte(limite);
            System.out.println("Série de Fibonacci até " + limite + ":");
            System.out.println(resultado.getSerie());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
