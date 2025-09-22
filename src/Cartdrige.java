public class Cartdrige extends Medium{
    private boolean vollstaendigesSet;
    private String entwicklerstudio;
    Enum_fuer_Konsolentyp Konsolentyp;


    public Cartdrige(String titel, double wert, String standort, boolean vollstaendigesSet, String entwicklerstudio, Enum_fuer_Konsolentyp konsolentyp) {
        super(titel, wert, standort);
        this.vollstaendigesSet = vollstaendigesSet;
        this.entwicklerstudio = entwicklerstudio;
        Konsolentyp = konsolentyp;

    }
    public boolean isVollstaendigesSet() {
        return vollstaendigesSet;
    }

    public String getEntwicklerstudio() {
        return entwicklerstudio;
    }

    public Enum_fuer_Konsolentyp getKonsolentyp() {
        return Konsolentyp;
    }

    public void setVollstaendigesSet(boolean vollstaendigesSet) {
        this.vollstaendigesSet = vollstaendigesSet;
    }

    public void setEntwicklerstudio(String entwicklerstudio) {
        this.entwicklerstudio = entwicklerstudio;
    }

    public void setKonsolentyp(Enum_fuer_Konsolentyp konsolentyp) {
        Konsolentyp = konsolentyp;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Konsolentyp: " + Konsolentyp + "Cartdige, ist das Set vollständig? " + vollstaendigesSet + " ,entwicklerstudio: " + entwicklerstudio);
    }




}
