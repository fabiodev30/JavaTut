package Parte1;

import java.util.*;

public class Esercizio2 {

    // genera array vuoto di numeri
    private Map<Integer, Boolean> mappa;
    private Random r;
    private Integer max;
    private Integer min;
    private Integer count;

    public Esercizio2() {
        this.r = new Random();
        this.mappa=new HashMap<>();
        this.max = 90;
        this.min = 1;
        this.count = 0;
    }


    public void intervallo() {
        for (int i = 1; i <= 90 ; i++) {
            mappa.put(i,false);
        }
        // finchè l'array non è vuoto
        while (!areAllExtracted()) {
            // aspetta un secondo
            try {
                // estrai nuovo numero casuale
                int randInt=r.nextInt(max-min+1)+min;
                if (!mappa.get(randInt)) {
                    mappa.put(randInt,true);
                    count++;
                    System.out.println("Estratto il numero "+randInt);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sono stati estratti " + count + " numeri");
    }

    private Boolean areAllExtracted() {
        for (Map.Entry<Integer, Boolean> coppia : mappa.entrySet()) {
            if (!coppia.getValue()) {
                return false;
            }
        }
        return true;
    }

}
