package Parte1;

import java.util.Random;

public class Esercizio1 {
    private int max;
    private int min;
    public Esercizio1(int max,int min){
        this.max=max;
        this.min=min;
    }
    public void intervallo(){
        //  200-100+1+100
        double risultato=Math.random()*(max-min+1)+min;
        System.out.println(risultato);
    }

    public void intervallo2(){
        Random r=new Random();
        int rand_int=r.nextInt(max)+1; // Genera un numero casuale tra 1 a 100 esclusi
        System.out.println(rand_int);
    }
}
