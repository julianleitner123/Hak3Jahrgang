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
            medium.anzeigen();
        }
    }
}

