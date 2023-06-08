package Parte2;

import java.util.ArrayList;
import java.util.List;

public class CatalogoAuto {

    private List<Auto> autos=new ArrayList<>();
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
        }
    }

    // ricerca auto dal catalogo
    public Auto searchAuto(int id){
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

}
