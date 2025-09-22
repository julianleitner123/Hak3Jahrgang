import java.util.ArrayList;

public class Medienbibliothek {

    private ArrayList<Medium> bibliothek = new ArrayList();

    public ArrayList<Medium> getBibliothek() {
        return bibliothek;
    }

    public void setBibliothek(ArrayList<Medium> bibliothek) {
        this.bibliothek = bibliothek;
    }

    public Medienbibliothek(ArrayList<Medium> bibliothek) {
        this.bibliothek = bibliothek;

    }

}
