package Fahrzeuge;

public class Segelflugzeug extends InDerLuft {
    private String modell;
    private String pilot;

    public Segelflugzeug(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis, int id, String antrieb, String airline, int aktuelleHoehe, String modell, String pilot) {
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, airline, aktuelleHoehe);
        this.modell = modell;
        this.pilot = pilot;
    }


    public String getModell() {
        return modell;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }


}
