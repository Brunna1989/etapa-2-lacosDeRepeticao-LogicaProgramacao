package service;

import java.util.Scanner;

public class LeituraNumeroService {

    public int lerNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite 10 para sair): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (numero != 10);

        scanner.close();
        return numero;
    }
}
