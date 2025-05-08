package service;

import model.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumerosService {

    public Numeros gerarNumerosAleatorios(int quantidade) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            numeros.add(random.nextInt(101)); // Gera de 0 a 100
        }

        return new Numeros(numeros);
    }

    public void exibirNumerosComMaiorEMenor(Numeros numeros) {
        List<Integer> lista = numeros.getNumeros();

        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("A lista de números está vazia ou nula.");
        }

        System.out.println("Números gerados: " + lista);

        int menor = Collections.min(lista);
        int maior = Collections.max(lista);

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}
