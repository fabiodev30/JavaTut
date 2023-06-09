package Parte2;


import java.util.HashSet;
import java.util.Set;

public class Esercizio2 {

    Set<Integer> set1 = new HashSet<>(); // set di numeri

    // set di numeri
    public Esercizio2(){

    }

    public void start(){
        // inserire in set1 lista numeri compresi tra 0 escluso e 90 incluso
        for (int i = 1; i <= 90; i++) {
            set1.add(i);
        }
    }

    // stampa il set
    public void stampaSet(){
        System.out.println(set1);
    }

    // TODO:

    // estrai numero e rimuovilo dal set fino a quando il set non è vuoto
    public void estraiNumero(){
        // ciclo while per estrarre i numeri
        while(!set1.isEmpty()){
           // prendi il valore massimo del set
            int max= set1.stream().max(Integer::compare).get();
            // prendi il valore minimo del set
            int min= set1.stream().min(Integer::compare).get();
            // estraggo un numero casuale dal set basandomi sul numero massimo e minimo
            int numeroCasuale = (int) (Math.random() * (max - min + 1) + min);
            // stampo il numero estratto
            System.out.println(numeroCasuale);
            // rimuovo il numero dal set
            set1.remove(numeroCasuale);
        }
    }



}
