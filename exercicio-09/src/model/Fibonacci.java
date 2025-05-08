package model;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private final List<Integer> serie;

    public Fibonacci() {
        this.serie = new ArrayList<>();
    }

    public List<Integer> getSerie() {
        return serie;
    }

    public void adicionarNumero(int numero) {
        serie.add(numero);
    }
}
