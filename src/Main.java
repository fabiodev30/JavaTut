import EserciziAssegnati.PrimoEs;
import EserciziAssegnati.SecondoEs;
import Parte1.Esercizio1;
import Parte1.Esercizio2;
import Parte1.Esercizio3;
import Parte1.Esercizio4;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // --------------PARTE 1----------------
        /*Esercizio1 es=new Esercizio1(100,0);
        es.intervallo();
        es.intervallo2();
        // Esercizio2 es2=new Esercizio2();
        // es2.intervallo();
        Esercizio3 es3=new Esercizio3("ciao come stai");
        es3.toUppercase();
        es3.toLowercase();
        es3.capitalize();
        // array di numeri interi
        int[] array = { 1, 2, 3, 4, 5 };
        // istanza della classe Esercizio4
        Esercizio4 esercizio4 = new Esercizio4();
        // chiamata al metodo findMaxMin
        int[] maxMin = esercizio4.findMaxMin(array);
        int[] maxMinOrdinati= Arrays.stream(maxMin).sorted().toArray();
        // stampa del minimo
        System.out.println("Minimo: " + maxMinOrdinati[0]);
        // stampa del massimo
        System.out.println("Massimo: " + maxMinOrdinati[1]);*/
        // --------------PARTE 2----------------
        // array di numeri interi
        int[] array = { 1, 2, 3, 4, 5 };
        int[] array1 = { 1, 2, 3, 4, 5 };
        // istanza SecondoEs
        SecondoEs secondoEs = new SecondoEs(array, array1);
        // chiamata al metodo Intersezione
        secondoEs.Intersezione();
        PrimoEs primoEs = new PrimoEs(array, array1);
        if (primoEs.confrontoArraySol1()) {
            System.out.println("Gli array sono uguali");
        } else {
            System.out.println("Gli array sono diversi");
        }

        if (primoEs.confrontoArraySol2()) {
            System.out.println("Gli array sono uguali");
        } else {
            System.out.println("Gli array sono diversi");
        }



    }

}