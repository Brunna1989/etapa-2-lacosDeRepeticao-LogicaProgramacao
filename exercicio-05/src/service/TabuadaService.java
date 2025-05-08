package service;

import model.Numero;

public class TabuadaService {

    public void exibirTabuada(Numero numero) {
        int valor = numero.getValor();
        System.out.println("Tabuada do " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }
    }
}




