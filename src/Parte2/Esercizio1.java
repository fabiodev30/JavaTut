package Parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Esercizio1 {
    public Esercizio1(){

    }

    public void start(){
        Scanner myObj = new Scanner(System.in);
        while (true){
            System.out.println("Inserisci domanda da fare al bot:\n 0- come stai?\n 1- che tempo fa?\n 2- che ore sono? \n 3- vuoi uscire?");
            int risposta = myObj.nextInt();
            switch (risposta){
                case 0:
                    // crea delle risposte casuali basate su un array di stringhe
                    List<String> risposte = new ArrayList<>();
                    risposte.add("Bene grazie");
                    risposte.add("Male");
                    risposte.add("Così così");
                    // genera un numero casuale tra 0 e 2
                    int random = (int) (Math.random() * 3);
                    System.out.println(risposte.get(random));
                    break;
                case 1:
                    // crea delle risposte casuali basate su un array di stringhe
                    List<String> risposte2 = new ArrayList<>();
                    risposte2.add("Fa brutto");
                    risposte2.add("Fa bello");
                    risposte2.add("Sta per piovere...");
                    // genera un numero casuale tra 0 e 2
                    int random2 = (int) (Math.random() * 3);
                    System.out.println(risposte2.get(random2));
                    break;
                case 2:
                    // crea delle risposte casuali basate su un array di stringhe
                    List<String> risposte3 = new ArrayList<>();
                    risposte3.add("Sono le 10");
                    risposte3.add("Sono le 11");
                    risposte3.add("Sono le 12");
                    // genera un numero casuale tra 0 e 2
                    int random3 = (int) (Math.random() * 3);
                    System.out.println(risposte3.get(random3));
                    break; // esci dallo switch
                case 3:
                    // esci dal programma
                    System.out.println("Arrivederci");
                    return;
                default:
                    System.out.println("Non ho capito");
                    break;
            }

        }
    }
}
