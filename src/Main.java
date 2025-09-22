//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Medienbibliothek medienbibliothek = new Medienbibliothek();
        VHS_Kassette vhs = new VHS_Kassette("He Man the Masters of the Univers", 120, "Büro",120, "Ausgezeichnet" );

        Cartdrige cartdrige = new Cartdrige("Zelda", 300, "Keller, UG", true, "Nintendo", Enum_fuer_Konsolentyp.N64);


        medienbibliothek.mediumhinzufuegen(vhs);
        medienbibliothek.mediumhinzufuegen(cartdrige);




      medienbibliothek.alleMedienausgeben();


    }
;


}