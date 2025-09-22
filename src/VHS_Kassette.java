public class VHS_Kassette extends Medium {


    private int Spieldauer;
    private String Filmqualitaet;

    public VHS_Kassette(String titel, double wert, String standort, int spieldauer, String filmqualitaet) {
        super(titel, wert, standort);
        Spieldauer = spieldauer;
        Filmqualitaet = filmqualitaet;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println(" Spieldauer: " + Spieldauer + " Filmqualitaet: " + Filmqualitaet);
    }
}
