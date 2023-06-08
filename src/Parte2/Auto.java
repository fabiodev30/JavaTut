package Parte2;

public class Auto {
    private int id;
    private int numeroPorte;

    private  String colore;

    private String annoProduzione;

    private int velocitaMassima;

    public Auto() {
        // crea un id random
        this.id = (int) (Math.random() * 1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(String annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }

    // to string
    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", numeroPorte=" + numeroPorte +
                ", colore='" + colore + '\'' +
                ", annoProduzione='" + annoProduzione + '\'' +
                ", velocitaMassima=" + velocitaMassima +
                '}';
    }
}
