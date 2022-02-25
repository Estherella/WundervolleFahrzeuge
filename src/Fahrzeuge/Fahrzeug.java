package Fahrzeuge;

public abstract class Fahrzeug {
    // Hier folgen die Attribute:
    private int geschwindigkeit;
    private String farbe;
    private String hersteller;
    private String treibstoff;
    private double preis;
    private int id;
    private String antrieb;

    // Hier folgt der Konstruktor
    public Fahrzeug(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis, int id, String antrieb){
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
        this.hersteller = hersteller;
        this.treibstoff = treibstoff;
        this.preis = preis;
        this.id = id;
        this.antrieb = antrieb;
    }
    // Hier folgen die Methoden
    public abstract String gibFortbewegung();

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }
    public String getFarbe() {
        return farbe;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public String getHersteller() {
        return hersteller;
    }
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    public String getTreibstoff() {
        return treibstoff;
    }
    public void setTreibstoff(String treibstoff) {
        this.treibstoff = treibstoff;
    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAntrieb() {
        return antrieb;
    }
    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }

    @Override
    public String toString() {
        return "Fahrzeuge.Fahrzeug{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", farbe='" + farbe + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", treibstoff='" + treibstoff + '\'' +
                ", preis=" + preis +
                ", id=" + id +
                '}';
    }
}
