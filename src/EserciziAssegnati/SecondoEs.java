package EserciziAssegnati;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SecondoEs {
    // inizializza 2 liste di interi
    private int[] array;
    private int[] array1;

    // costruttore che prende in input due array di interi
    public SecondoEs(int[] array,int[] array1) {
        this.array = array;
        this.array1=array1;
    }

    // metodo che fa intersezione fra due array di interi
    // soluzione lineare
    public  void Intersezione(){
        // inizializzo un array di interi con dimensione dinamica
        ArrayList<Integer> intersezione = new ArrayList<Integer>();
        // scorro l'array1
        for (int i = 0; i < array.length; i++) {
            // scorro l'array2
            for (int j = 0; j < array1.length; j++) {
                // se l'elemento dell'array1 è uguale all'elemento dell'array2
                if (array[i] == array1[j]) {
                    // verifico se l'elemento è già presente nell'array intersezione rimuovendo i duplicati
                    if (!intersezione.contains(array[i])) {
                        // aggiungo l'elemento all'array intersezione solo se non è già presente
                        intersezione.add(array[i]);
                    }
                }
            }
        }
        // ritorno l'array intersezione
       System.out.println("Elementi intersezione:"+intersezione);
    }

    // metodo che fa intersezione fra due array di interi
    // soluzione lineare
    public  void Intersezione1(){
        // creo una mappa di interi
        Set<Integer> intersezione = new HashSet<Integer>();
        // creao una array di interi con dimensione dinamica
        ArrayList<Integer> intersezione1 = new ArrayList<Integer>();
        // aggiungo tutti gli elementi dell'array1 alla mappa
        for (int i = 0; i < array.length; i++) {
            intersezione.add(array[i]);
        }
        // scorro l'array2
        for (int i = 0; i < array1.length; i++) {
            // se l'elemento dell'array2 è presente nella mappa
            if (intersezione.contains(array1[i])) {
                // aggiungo l'elemento all'array intersezione solo se non è già presente
                if (!intersezione1.contains(array1[i])) {
                    intersezione1.add(array1[i]);
                }
            }
        }

        // ritorno l'array intersezione
        System.out.println("Elementi intersezione:"+intersezione);
    }

}
