package Parte2;

import java.util.Scanner;

public class Esercizio1 {
    public Esercizio1(){

    }

    public void start(){
        Scanner myObj = new Scanner(System.in);
        while (true){
            System.out.println("Come stai?");
            String risposta = myObj.nextLine();
            System.out.println(risposta);
            System.out.println("Che tempo fa?");
            String risposta2 = myObj.nextLine();
            System.out.println(risposta2);
            System.out.println("Che ore sono?");
            String risposta3 = myObj.nextLine();
            System.out.println(risposta3);
            System.out.println("Vuoi uscire(y/n)?");
            String risposta4 = myObj.nextLine();
            if (risposta4.equals("y")){
                break;
            }
        }
    }
}
