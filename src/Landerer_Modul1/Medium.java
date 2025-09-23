package Landerer_Modul1;

public class Medium {

    private String Titel;
    private double Wert;
    private String Standort;

    public void setTitel(String titel) {
        Titel = titel;
    }

    public void setWert(double wert) {
        Wert = wert;
    }

    public void setStandort(String standort) {
        Standort = standort;
    }

    public Medium(String titel, double wert, String standort) {
        Titel = titel;
        Wert = wert;
        Standort = standort;


    }

    public String getTitel() {
        return Titel;
    }

    public double getWert() {
        return Wert;
    }

    public String getStandort() {
        return Standort;
    }

    public void anzeigen(){
        System.out.println("[Landerer_Modul1.Medium] " + "Titel: " + Titel + " Wert: " + Wert + " Standort: " + Standort);

    }
}
