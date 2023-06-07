package Parte1;

public class Esercizio3 {
    public String stringa;
    public Esercizio3(String stringa){
        this.stringa=stringa;
    }

    public void toUppercase(){
        System.out.println(stringa.toUpperCase());
    }

    public  void  toLowercase(){
        System.out.println(stringa.toLowerCase());
    }

    // prime lettere maiuscole
    public void capitalize(){
        // splitto la stringa in un array di stringhe usando come separatore lo spazio
        String[] words=stringa.split(" ");
        String capitalized="";
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            // prendo la prima lettera della parola
            String firstLetter=word.substring(0,1);
            // prendo il resto della parola
            String rest=word.substring(1);
            // concateno la prima lettera maiuscola con il resto della parola
            capitalized+=firstLetter.toUpperCase()+rest+" ";
        }
        System.out.println(capitalized);
    }







}
