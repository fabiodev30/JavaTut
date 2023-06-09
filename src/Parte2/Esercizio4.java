package Parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Esercizio4 {
    // arraylist di mazzo di carte
    List<String> mazzo = new ArrayList<>();
    public Esercizio4() {
    }

   /* // ----PRIMA VERSIONE CON CARTE 52----
    // metodo per creare il mazzo di carte
    public void creaMazzo() {
        // array di semi
        String[] semi = { "cuori", "quadri", "fiori", "picche" };
        // array di numeri con 11 12 13 che sono jack regina e re
        String[] numeri = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13" };
        // ciclo for per creare il mazzo di carte
        for (int i = 0; i < semi.length; i++) {
            for (int j = 0; j < numeri.length; j++) {
                // aggiunta delle carte al mazzo
                mazzo.add(numeri[j] + semi[i]);
            }
        }
    }

    // metodo per vedere mazzo di carte
    public void stampaMazzo() {
        // ciclo for per stampare il mazzo di carte
        for (int i = 0; i < mazzo.size(); i++) {
            System.out.println(mazzo.get(i));
        }
    }

    // mescolare mazzo di carte
    public void mescolaMazzo() {
        // ciclo for per mescolare il mazzo di carte
        for (int i = 0; i < mazzo.size(); i++) {
            // variabile per generare un numero casuale
            int random = (int) (Math.random() * mazzo.size());
            // variabile per salvare la carta da scambiare
            String carta = mazzo.get(i);
            // scambio delle carte
            mazzo.set(i, mazzo.get(random));
            mazzo.set(random, carta);
        }
    }

    // suddividere il mazzo di carte
    public void suddividiMazzo(int nSuddivisioni){
        // devo suddividere il mazzo in base alla suddivisioni ricevute come paremtetro
        // come suddividere il mazzo che è un array / nSuddivsioni


        // devo prendere il numero di carte che poi dovrò ciclare
        int numeroCarte=mazzo.size()/nSuddivisioni;

        // devo creare un array di array
        List<List<String>> mazzoSuddiviso=new ArrayList<>();
        // devo creare un array di stringhe
        List<String> carte=new ArrayList<>();
        // devo ciclare il mazzo
        for (int i = 0; i < mazzo.size(); i++) {
            // devo aggiungere le carte all'array
            carte.add(mazzo.get(i));
            // se l'array è pieno
            if(carte.size()==numeroCarte){
                // aggiungo l'array di carte all'array di array
                mazzoSuddiviso.add(carte);
                // svuoto l'array di carte
                carte=new ArrayList<>();
            }
        }
        // stampo il mazzo suddiviso
        for (int i = 0; i < mazzoSuddiviso.size(); i++) {
            System.out.println("--------SUDDIVISIONE------------- "+i);
            // creao array list di stringhe
            List<String> carteDiCuoriMaggiori2=new ArrayList<>();
            List<String> carteDiCuoriMinoriUguali2=new ArrayList<>();
            List<String> carteDiQuadri=new ArrayList<>();
            List<String> carteDiPiccheMinoriUguali2EFioriMaggiori4=new ArrayList<>();
            List<String> carteDiFioriCompresiTra2E4=new ArrayList<>();
            List<String> altreCarte=new ArrayList<>();
            for (int j = 0; j < mazzoSuddiviso.get(i).size(); j++) {
                // controllo se la carta è di cuori e se è maggiore di 2
                if(mazzoSuddiviso.get(i).get(j).contains("cuori") && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))>2){
                    // aggiungo la carta all'array
                    carteDiCuoriMaggiori2.add(mazzoSuddiviso.get(i).get(j));
                }
                // controllo se la carta è di cuori e se è minore o uguale a 2
                else if(mazzoSuddiviso.get(i).get(j).contains("cuori") && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))<=2){
                    // aggiungo la carta all'array
                    carteDiCuoriMinoriUguali2.add(mazzoSuddiviso.get(i).get(j));
                }
                // controllo se la carta è di quadri
                else if(mazzoSuddiviso.get(i).get(j).contains("quadri")){
                    // aggiungo la carta all'array
                    carteDiQuadri.add(mazzoSuddiviso.get(i).get(j));
                }
                // controllo se la carta è di picche e se è minore o uguale a 2 o se è di fiori e se è maggiore di 4
                else if((mazzoSuddiviso.get(i).get(j).contains("picche") && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))<=2) || (mazzoSuddiviso.get(i).get(j).contains("fiori") && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))>4)){
                    // aggiungo la carta all'array
                    carteDiPiccheMinoriUguali2EFioriMaggiori4.add(mazzoSuddiviso.get(i).get(j));
                }
                // controllo se la carta è di fiori e se è compresa tra 2 e 4
                else if(mazzoSuddiviso.get(i).get(j).contains("fiori") && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))>=2 && Integer.parseInt(mazzoSuddiviso.get(i).get(j).substring(0,1))<=4){
                    // aggiungo la carta all'array
                    carteDiFioriCompresiTra2E4.add(mazzoSuddiviso.get(i).get(j));
                }
                // altrimenti
                else{
                    // aggiungo la carta all'array
                    altreCarte.add(mazzoSuddiviso.get(i).get(j));
                }
            }
            System.out.println("Carte di cuori maggiori di 2: "+carteDiCuoriMaggiori2);
            System.out.println("Carte di cuori minori o uguali a 2: "+carteDiCuoriMinoriUguali2);
            System.out.println("Carte di quadri: "+carteDiQuadri);
            System.out.println("Carte di picche minori o uguali a 2 o carte di fiori maggiori di 4: "+carteDiPiccheMinoriUguali2EFioriMaggiori4);
            System.out.println("Carte di fiori comprese tra 2 e 4: "+carteDiFioriCompresiTra2E4);
            System.out.println("Altre carte: "+altreCarte);
        }

    }
}*/

    // ---------SECONDA VERSIONE con carte numero casuale min 4 max 20----------------
    // TODO: numero di carte in input
    public void creaMazzo(){
        // creo un array di stringhe
        mazzo=new ArrayList<>();

        Random random=new Random();
        // creo un array di stringhe
        String[] semi={"cuori","quadri","picche","fiori"};
        // ciclo for per ogni seme crea numero random tar 1 e 5 relativo al numero di carte
        for (int i = 0; i < semi.length; i++) {
            int numeroCasuale = random.nextInt(5) + 1;
            // ciclo for per creare le carte
            for (int j = 1; j <= numeroCasuale; j++) {
                // creo la carta
                String carta=j+semi[i];
                // aggiungo la carta al mazzo
                mazzo.add(carta);
            }
        }

    }

    // stampa mazzo
    public void stampaMazzo(){
        // ciclo for per stampare il mazzo
        for (int i = 0; i < mazzo.size(); i++) {
            System.out.println(mazzo.get(i));
        }
    }

    // metodo controllo mazzo


    public void suddividiMazzo() {
        List<String> carteDiCuoriMaggiori2 = new ArrayList<>();
        List<String> carteDiCuoriMinoriUguali2 = new ArrayList<>();
        List<String> carteDiQuadri = new ArrayList<>();
        List<String> carteDiPiccheMinoriUguali2EFioriMaggiori4 = new ArrayList<>();
        List<String> carteDiFioriCompresiTra2E4 = new ArrayList<>();
        List<String> altreCarte = new ArrayList<>();

        // ciclo per il mazzo
        for (int i = 0; i < mazzo.size(); i++) {
            // controllo se la carta è di cuori e se è maggiore di 2
            if (mazzo.get(i).contains("cuori") && Integer.parseInt(mazzo.get(i).substring(0, 1)) > 2) {
                // aggiungo la carta all'array
                carteDiCuoriMaggiori2.add(mazzo.get(i));
            }
            // controllo se la carta è di cuori e se è minore o uguale a 2
            else if (mazzo.get(i).contains("cuori") && Integer.parseInt(mazzo.get(i).substring(0, 1)) <= 2) {
                // aggiungo la carta all'array
                carteDiCuoriMinoriUguali2.add(mazzo.get(i));
            }
            // controllo se la carta è di quadri
            else if (mazzo.get(i).contains("quadri")) {
                // aggiungo la carta all'array
                carteDiQuadri.add(mazzo.get(i));
            }
            // controllo se la carta è di picche e se è minore o uguale a 2 o se è di fiori e se è maggiore di 4
            else if ((mazzo.get(i).contains("picche") && Integer.parseInt(mazzo.get(i).substring(0, 1)) <= 2) || (mazzo.get(i).contains("fiori") && Integer.parseInt(mazzo.get(i).substring(0, 1)) > 4)) {
                // aggiungo la carta all'array
                carteDiPiccheMinoriUguali2EFioriMaggiori4.add(mazzo.get(i));
            }
            // controllo se la carta è di fiori e se è compresa tra 2 e 4
            else if (mazzo.get(i).contains("fiori") && Integer.parseInt(mazzo.get(i).substring(0, 1)) >= 2 && Integer.parseInt(mazzo.get(i).substring(0, 1)) <= 4) {
                // aggiungo la carta all'array
                carteDiFioriCompresiTra2E4.add(mazzo.get(i));
            }
            // altrimenti
            else {
                // aggiungo la carta all'array
                altreCarte.add(mazzo.get(i));
            }
        }
        // stampo le liste
        System.out.println("Carte di cuori maggiori di 2: " + carteDiCuoriMaggiori2);
        System.out.println("Carte di cuori minori o uguali a 2: " + carteDiCuoriMinoriUguali2);
        System.out.println("Carte di quadri: " + carteDiQuadri);
        System.out.println("Carte di picche minori o uguali a 2 o carte di fiori maggiori di 4: " + carteDiPiccheMinoriUguali2EFioriMaggiori4);
        System.out.println("Carte di fiori comprese tra 2 e 4: " + carteDiFioriCompresiTra2E4);
        System.out.println("Altre carte: " + altreCarte);


    }
}