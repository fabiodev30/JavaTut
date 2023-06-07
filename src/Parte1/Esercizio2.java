package Parte1;

import java.util.ArrayList;
import java.util.Random;

public class Esercizio2 {

    // genera array vuoto di numeri
    ArrayList<Integer> numbers = new ArrayList<>();


    public void intervallo(){
        for (int i = 1; i <=90 ; i++) {
            numbers.add(i);
        }
        Random r=new Random();
        // finchè l'array non è vuoto
        while (!numbers.isEmpty()) {
            // aspetta un secondo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // estrai nuovo numero casuale
            int rand_int = r.nextInt(numbers.size());
            // rimuovi numero estratto dall'array
            int numeroEstratto=numbers.remove(rand_int);
            System.out.println("Estratto il numero"+numeroEstratto);
        }
    }

}
