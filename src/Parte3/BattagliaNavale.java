package Parte3;

import java.util.Scanner;

public class BattagliaNavale {

    private boolean isFirstGame = true;
    private Scanner myObj = new Scanner(System.in);
    private int[][] matrice;

    public BattagliaNavale() {
    }

    // Crea la griglia e la restituisce
    public void creaGriglia() {
        System.out.println("Inserisci la dimensione della griglia");
        int dimensioneMatrice = myObj.nextInt();

        // Crea la matrice con la dimensione inserita
        matrice = new int[dimensioneMatrice][dimensioneMatrice];
        int naviMassimeDisponibili = dimensioneMatrice*dimensioneMatrice / 3;

        // Popola la griglia
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                int random = (int) (Math.random() * 2);

                if (random == 1 && naviMassimeDisponibili > 0) {
                    matrice[i][j] = 1;
                    naviMassimeDisponibili--;
                } else {
                    matrice[i][j] = 0;
                }
            }
        }
        System.out.println("Griglia creata!");
    }

    // Stampa la griglia
    public void stampaGriglia(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void startGame() {
        if (isFirstGame) {
            creaGriglia();
            isFirstGame = false;
        }

        while (true) {
            System.out.println("Inserisci il comando:");
            System.out.println("0 - Esci");
            System.out.println("1 - Colpisci una nave");
            System.out.println("2 - Stampa la griglia");
            System.out.println("3 - Ricomincia la partita da zero");

            int comando = myObj.nextInt();
            myObj.nextLine(); // Consuma il carattere di nuova linea

            switch (comando) {
                case 0:
                    return;
                case 1:
                    boolean tuttiZeri = checkVittoria();
                    if (tuttiZeri) {
                        System.out.println("Hai vinto!");
                        System.out.println("Vuoi ricominciare? (S/N)");
                        String risposta = myObj.nextLine();
                        if (risposta.equals( "S") || risposta.equals("s")) {
                            creaGriglia();
                            break;  // Esce dallo switch
                        } else {
                            return;
                        }
                    } else {
                        System.out.println("Inserisci la posizione riga:");
                        int riga = myObj.nextInt();
                        System.out.println("Inserisci la posizione colonna:");
                        int colonna = myObj.nextInt();
                        myObj.nextLine(); // Consuma il carattere di nuova linea

                        if (riga >= 0 && riga < matrice.length && colonna >= 0 && colonna < matrice[riga].length) {
                            if (matrice[riga][colonna] == 1) {
                                matrice[riga][colonna] = 0;
                                System.out.println("Hai colpito una nave!");
                                // fai un controllo per vedere se hai vinto
                                boolean vi=checkVittoria() ;
                                if (vi){
                                    System.out.println("Hai vinto!");
                                    System.out.println("Vuoi ricominciare? (S/N)");
                                    String risposta = myObj.nextLine();
                                    if (risposta.equals( "S") || risposta.equals("s")) {
                                        creaGriglia();
                                        break;  // Esce dallo switch
                                    } else {
                                        return;
                                    }
                                }

                            } else {
                                System.out.println("Non hai colpito una nave.");
                            }
                        } else {
                            System.out.println("Posizione non valida!");
                        }
                    }
                    break;
                case 2:
                    stampaGriglia(matrice);
                    break;
                case 3:
                    creaGriglia();
                    break;
                default:
                    System.out.println("Comando non valido!");
                    break;
            }
        }
    }
    public boolean checkVittoria(){
        boolean tuttiZeri = true;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == 1) {
                    tuttiZeri = false;
                }
            }
        }
        return tuttiZeri;
    }
}
