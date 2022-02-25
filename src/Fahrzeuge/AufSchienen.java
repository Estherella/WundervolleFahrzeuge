package Fahrzeuge;

public abstract class AufSchienen extends Fahrzeug{
    private String abfahrtsort;
    private String ankunftsort;

    // Hier folgt der Konstruktor
    public AufSchienen(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis,
                       int id, String antrieb, String abfahrtsort, String ankunftsort) {
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb);
        this.abfahrtsort = abfahrtsort;
        this.ankunftsort = ankunftsort;

    }
    // Hier folgen die Methoden
    public void kommtAus() {
        System.out.println("Ich komme aus: " + this.abfahrtsort);
    }
    public void faehrtNach(){
        System.out.println("Ich fahre nach: " + this.ankunftsort);
    };

    @Override
    public String gibFortbewegung(){
        return "Ich fahre auf Schienen!";
    }

}
