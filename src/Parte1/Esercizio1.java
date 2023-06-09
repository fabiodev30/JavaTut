package Parte1;

import java.util.Random;

public class Esercizio1 {
    private int max;
    private int min;


    public Esercizio1(int max, int min) {
        this.max=max;
        this.min=min;
    }


    public void esercizio() {
        Random r = new Random();
        Integer numero = r.nextInt(max);
        System.out.println(numero);
    }

    public void plus1() {
        Random r = new Random();
        Integer numero = r.nextInt(max + 1 - min) + min;
        System.out.println(numero);
    }

    // TODO: plus2?
    //rand.seed(1)
}
