package Landerer_Modul1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Medienbibliothek medienbibliothek = new Medienbibliothek();
        VHS_Kassette vhs = new VHS_Kassette("He Man the Masters of the Univers", 120, "Büro",120, "Ausgezeichnet" );
        Cartdrige cartdrige = new Cartdrige("Zelda", 300, "Keller, UG", true, "Nintendo", Enum_fuer_Konsolentyp.N64);
        Buch herr = new Buch("Herr der Ringe", 50, " Wohnzimmer, OG", "1234456786543563");



        medienbibliothek.mediumhinzufuegen(vhs);
        medienbibliothek.mediumhinzufuegen(cartdrige);
        medienbibliothek.mediumhinzufuegen(herr);




      medienbibliothek.alleMedienausgeben();

        System.out.println(" ---- alle VHS in der Liste -----");

      for(VHS_Kassette VHS : medienbibliothek.alleVHSMedien()){
          VHS.anzeigen();
      }
    }
;


}