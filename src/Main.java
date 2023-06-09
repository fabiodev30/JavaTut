import EserciziAssegnati.PrimoEs;
import EserciziAssegnati.SecondoEs;
import Parte2.*;
import Parte3.BattagliaNavale;
import Parte3.TryCatch;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*// INIZIO ESERCIZIO 4 PRIMA VERSIONE
        Esercizio4 es4=new Esercizio4();
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
        List<String> list = new LinkedList<>();
        list.add(0,"a");
        list.add(1,"b");
        System.out.println(list);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("prova");
        arrayList.add("Pisa");
        System.out.println( arrayList.indexOf("Pisa"));
        HashMap<String,String> mappa=new HashMap<>();
        mappa.putAll(Map.of("Pisa","Pisa","Firenze","Firenze"));
       // per ogni chiave
        for (String key : mappa.keySet()) {
            // stampa chiave e valore
            System.out.println(key + " " + mappa.get(key));
        }

    }
        }


