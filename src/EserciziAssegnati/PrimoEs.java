package EserciziAssegnati;

import java.util.Arrays;
import java.util.Map;

public class PrimoEs {
    // una matrice di interi
    private int[] array;

    private int[] array1;

    // costruttore che prende in input due array di interi
    public PrimoEs(int[] array, int[] array1) {
        this.array = array;
        this.array1 = array1;
    }

    public boolean confrontoArraySol1() {
        return Arrays.equals(array, array1);
    }

    public boolean confrontoArraySol2() {
        if (array.length != array1.length) {
            return false;
        }
        // ordino i due array
        Arrays.sort(array);
        Arrays.sort(array1);
        // scorro i due array
        for (int i = 0; i < array.length; i++) {
            // se l'elemento dell'array1 è diverso dall'elemento dell'array2
            if (array[i] != array1[i]) {
                // ritorno false
                return false;
            }
        }
        return true;
    }

    // TODO: fare con hasmap
    public boolean soluzioneOttima() {
        if (array.length != array1.length) {
            return false;
        }
        // insersci in una hashmap l'array e come valori ci insersci il numero di volte che compare
        Map<Integer, Integer> mappa = null;
        for (int i = 0; i < array.length; i++) {
            if (mappa.containsKey(array[i])) {
                // se la chiave è già presente incrementa il valore
                mappa.put(array[i], mappa.get(array[i]) + 1);
            } else {
                // altrimenti inserisci la chiave e metti il valore a 1
                mappa.put(array[i], 1);
            }
        }
        // scorri l'altro array e per ogni elemento decrementi il valore nella hashmap
        // se il valore è 0 ritorna false
        for (int i = 0; i < array1.length; i++) {
            if (mappa.containsKey(array1[i])) {
                // se la chiave è già presente incrementa il valore
                mappa.put(array1[i], mappa.get(array1[i]) - 1);
                if (mappa.get(array1[i]) == 0) {
                    return false;
                }
            } else {
                // altrimenti inserisci la chiave e metti il valore a 1
                return false;
            }
        }
        return true;
    }

}

