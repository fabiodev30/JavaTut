package Parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoAuto {

    private List<Auto> autos=new ArrayList<>();

    private Scanner myObj = new Scanner(System.in);
    public CatalogoAuto() {
    }

    public void addAuto(Auto auto){
        autos.add(auto);
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public void removeAuto(Auto auto){
        // se l'auto è presente nel catalogo la rimuove
        if(autos.contains(auto)) {
            autos.remove(auto);
            System.out.println("Auto rimossa");
        }else {
            System.out.println("Auto non presente nel catalogo");
        }
    }

    // ricerca auto dal catalogo
    public Auto searchAuto(int id){
        // se il catalogo è vuoto ritorna null
        if(autos.isEmpty()){
            System.out.println("Catalogo vuoto");
            return null;
        }
        for (Auto auto : autos) {
            if(auto.getId()==id){
                return auto;
            }
        }
        return null;
    }

    // stampa tutte le auto presenti nel catalogo
    public void stampaCatalogo(){
        for (Auto auto : autos) {
            System.out.println(auto.toString());
        }
    }

    public void start() {

        while (true) {
            System.out.println("Vuoi visualizzare il catalogo? (s/n)");
            String risposta1 = myObj.nextLine();
            if (risposta1.equals("s")) {
                this.stampaCatalogo();
            }
            System.out.println("Vuoi inserire un'auto? (s/n)");
            String rispostaInserimento = myObj.nextLine();
            if (rispostaInserimento.equals("s")) {
                Auto newAuto = new Auto();
                // creazione auto
                Integer risposta = null;
                Boolean isInt = false;
                while (!isInt) {
                    System.out.println("Inserisci velocità massima");
                    try {
                        risposta = Integer.parseInt(myObj.nextLine());
                        isInt=true;
                    } catch (NumberFormatException ex) {
                        System.out.println("Inserire velocità correta");
                    }
                }
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
                this.addAuto(newAuto);
                // visualizza auto del catalogo
                this.stampaCatalogo();
            }
            System.out.println("Vuoi rimuovere un'auto? (s/n)");
            String risposta2 = myObj.nextLine();
            if (risposta2.equals("s")) {
                System.out.println("Inserisci id auto da rimuovere");
                int id = Integer.parseInt(myObj.nextLine());
                Auto auto = this.searchAuto(id);
                if (auto != null) {
                    this.removeAuto(auto);
                } else {
                    System.out.println("Auto non trovata");
                }

            }
            System.out.println("Vuoi ricercare un'auto? (s/n)");
            risposta2 = myObj.nextLine();
            if (risposta2.equals("s")) {
                System.out.println("Inserisci id auto da ricercare");
                int id = Integer.parseInt(myObj.nextLine());
                Auto auto = this.searchAuto(id);
                if (auto != null) {
                    System.out.println(auto.toString());
                } else {
                    System.out.println("Auto non trovata");
                }
            }
            // fai stampa catalogo
            this.stampaCatalogo();
            System.out.println("Vuoi uscire? (s/n)");
            risposta2 = myObj.nextLine();
            if (risposta2.equals("s")) {
                return; // esce dal programma
            }
        }
    }

}
