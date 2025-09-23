package Landerer_Modul1;

import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> medienlist;

    public Medienbibliothek() {
        this.medienlist = new ArrayList();
    }

    public void mediumhinzufuegen(Medium medium) {
        this.medienlist.add(medium);
    }

    public void alleMedienausgeben(){

        for(Medium medium : this.medienlist){
            System.out.println(" -------------------------- ");
            medium.anzeigen();
        }
    }
    public ArrayList<VHS_Kassette> alleVHSMedien() {
        ArrayList<VHS_Kassette> vhs = new ArrayList();
        for(Medium medium : medienlist){
            if(medium instanceof VHS_Kassette){
                vhs.add((VHS_Kassette) medium);
            }
        }

        return vhs;
    }
}

