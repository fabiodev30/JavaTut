package EserciziAssegnati;

import java.util.ArrayList;

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
                    // aggiungo l'elemento all'array intersezione
                    intersezione.add(array[i]);
                }
            }
        }
        // ritorno l'array intersezione
       System.out.println("Elementi intersezione:"+intersezione);
    }

}
