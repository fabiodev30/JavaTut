import Parte1.*;
import Parte3.BattagliaNavale;
import Parte3.TryCatch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // --------------PARTE 1----------------
        Esercizio1 es=new Esercizio1(100,0);
        es.esercizio();
        es.plus1();
        Esercizio2 es2=new Esercizio2();
        es2.intervallo();
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
        System.out.println("Massimo: " + maxMinOrdinati[1]);

        /*// --------------ESERCIZI ASSEGNATI----------------
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
        }*/

        // --------------PARTE 2----------------
        /*Esercizio1 es=new Esercizio1();
        es.start();*/
        /*Esercizio2 es2=new Esercizio2();
        es2.start();
        es2.estraiNumero();*/
        // INIZIO ESERCIZIO 3
        /*CatalogoAuto catalogoAuto = new CatalogoAuto();
        Scanner myObj = new Scanner(System.in);
        while (true) {
        Auto newAuto = new Auto();
        // creazione auto
        System.out.println("Inserisci velocità massima");
        int risposta = Integer.parseInt(myObj.nextLine());
        newAuto.setVelocitaMassima(risposta);
        System.out.println("Inserisci numero porte");
        risposta = Integer.parseInt(myObj.nextLine());
        newAuto.setNumeroPorte(risposta);
        System.out.println("Inserisci colore");
        String colore = myObj.nextLine();
        newAuto.setColore(colore);
        System.out.println("Inserisci anno produzione");
        String annoProduzione = myObj.nextLine();
        newAuto.setAnnoProduzione(annoProduzione);
        // aggiungi auto al catalogo
        catalogoAuto.addAuto(newAuto);
        // visualizza auto del catalogo
        catalogoAuto.stampaCatalogo();
        System.out.println("Vuoi rimuovere un'auto? (s/n)");
        String risposta2 = myObj.nextLine();
        if (risposta2.equals("s")) {
            System.out.println("Inserisci id auto da rimuovere");
            int id = Integer.parseInt(myObj.nextLine());
            Auto auto = catalogoAuto.searchAuto(id);
            catalogoAuto.removeAuto(auto);
        }
        System.out.println("Vuoi ricercare un'auto? (s/n)");
        risposta2 = myObj.nextLine();
        if (risposta2.equals("s")) {
            System.out.println("Inserisci id auto da ricercare");
            int id = Integer.parseInt(myObj.nextLine());
            Auto auto = catalogoAuto.searchAuto(id);
            System.out.println(auto.toString());
        }
        // fai stampa catalogo
        catalogoAuto.stampaCatalogo();
        System.out.println("Vuoi uscire? (s/n)");
        risposta2 = myObj.nextLine();
        if (risposta2.equals("s")) {
            break;
        }
        }*/
        // INIZIO ESERCIZIO 4 PRIMA VERSIONE
        /*Esercizio4 es4=new Esercizio4();
        es4.creaMazzo();
        es4.stampaMazzo();
        es4.mescolaMazzo();
        es4.stampaMazzo();
        es4.suddividiMazzo(3);*/
        // INIZIO ESERCIZIO 4 SECONDA VERSIONE
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


