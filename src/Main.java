import EserciziAssegnati.PrimoEs;
import EserciziAssegnati.SecondoEs;
import Parte2.*;
import Parte3.BattagliaNavale;
import Parte3.TryCatch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       /* // --------------PARTE 1----------------
        Esercizio1 es=new Esercizio1(100,0);
        es.esercizio();
        es.plus1();
        // TODO: esercizio 2 da rivedere
        //Esercizio2 es2=new Esercizio2();
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

        /*// --------------ESERCIZI ASSEGNATI----------------
        // array di numeri interi
        int[] array = { 1, 2, 3, 4, 5 ,5};
        int[] array1 = { 1, 2, 3, 4,5,5 };
        // istanza SecondoEs
        SecondoEs secondoEs = new SecondoEs(array, array1);
        // chiamata al metodo Intersezione
        secondoEs.Intersezione();
        secondoEs.Intersezione2();
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
        }*/
        // --------------PARTE 2----------------
        Esercizio1 es=new Esercizio1();
        es.start();
        Esercizio2 es2=new Esercizio2();
        es2.start();
        es2.estraiNumero();
        // INIZIO ESERCIZIO 3
        CatalogoAuto catalogoAuto = new CatalogoAuto();
        System.out.println("Benvenuto nel catalogo auto");
        catalogoAuto.start();

        // INIZIO ESERCIZIO 4 PRIMA VERSIONE
        /*Esercizio4 es4=new Esercizio4();
        es4.creaMazzo();
        es4.stampaMazzo();
        es4.mescolaMazzo();
        es4.stampaMazzo();
        es4.suddividiMazzo(3);*/
        // INIZIO ESERCI3ZIO 4 SECONDA VERSIONE
        /*Esercizio4 es4=new Esercizio4();
        es4.creaMazzo();
        es4.stampaMazzo();
        es4.suddividiMazzo();*/
        // --------- Parte 3 ------------
        /*TryCatch tryCatch = new TryCatch();
        tryCatch.start();*/
        /*BattagliaNavale battagliaNavale = new BattagliaNavale();
        battagliaNavale.startGame();*/

            }
        }


