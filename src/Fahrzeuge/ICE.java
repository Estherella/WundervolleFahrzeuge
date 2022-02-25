package Fahrzeuge;

public class ICE extends AufSchienen implements Elektrisch{
    private String name;
    private String ankunftszeit;

    public ICE(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis, int id,
               String antrieb, String abfahrtsort, String ankunftsort, String name, String ankunftszeit) {
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, abfahrtsort, ankunftsort);
        this.name = name;
        this.ankunftszeit = ankunftszeit;
    }

    @Override
    public void laden() {
        System.out.println("Ich muss nicht geladen werden. Ich habe immer Strom!");
    }
}
