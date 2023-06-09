package Parte1;

public class Esercizio4 {

    public  Esercizio4() {
    }

    // come parametro abbiamo un array di numeri interi e dobbiamo returnare il max ed il min
    public int[] findMaxMin( int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // return new int[]{max, min};ì
        return new int[]{max, min} ;
    }

}
