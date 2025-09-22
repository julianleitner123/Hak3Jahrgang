public class Cartdrige extends Medium{
    private boolean vollstaendigesSet;
    private String entwicklerstudio;
    private String Konsolentyp;

    public boolean isVollstaendigesSet() {
        return vollstaendigesSet;
    }

    public String getEntwicklerstudio() {
        return entwicklerstudio;
    }

    public String getKonsolentyp() {
        return Konsolentyp;
    }

    public void setVollstaendigesSet(boolean vollstaendigesSet) {
        this.vollstaendigesSet = vollstaendigesSet;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        this.entwicklerstudio = entwicklerstudio;
    }

    public void setKonsolentyp(String konsolentyp) {
        Konsolentyp = konsolentyp;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Konsolentyp: " + Konsolentyp + "vollstaendigesSet" + vollstaendigesSet + "entwicklerstudio" + entwicklerstudio);
    }

    public Cartdrige(String titel, double wert, String standort, boolean vollstaendigesSet, String entwicklerstudio, String konsolentyp) {
        super(titel, wert, standort);
        this.vollstaendigesSet = vollstaendigesSet;
        this.entwicklerstudio = entwicklerstudio;
        Konsolentyp = konsolentyp;

    }


}
