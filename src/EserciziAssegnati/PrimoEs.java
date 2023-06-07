package EserciziAssegnati;

import java.util.Arrays;

public class PrimoEs {
    // una matrice di interi
    private int[] array;

    private  int[] array1;

    // costruttore che prende in input due array di interi
    public PrimoEs(int[] array,int[] array1) {
        this.array = array;
        this.array1=array1;
    }

    public boolean confrontoArraySol1(){
        return Arrays.equals(array, array1);
    }

    public boolean confrontoArraySol2(){
        if(array.length!=array1.length){
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

    

}
