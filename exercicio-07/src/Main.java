import model.Fibonacci;
import service.FibonacciService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciService service = new FibonacciService();

        int n;
        do {
            System.out.print("Informe um número inteiro não negativo: ");
            n = scanner.nextInt();
        } while (n < 0);

        Fibonacci result = service.generate(n);
        System.out.println("Série de Fibonacci até F(" + n + "):");
        System.out.println(result);
    }
}
