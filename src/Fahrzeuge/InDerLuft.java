package Fahrzeuge;

public class InDerLuft extends Fahrzeug {
    private String airline;
    private int aktuelleHoehe;

    public InDerLuft(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis,
                     int id, String antrieb, String airline, int aktuelleHoehe){
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb);
        this.airline = airline;
        this.aktuelleHoehe = aktuelleHoehe;
    }

    //Hier folgen die Methoden


    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getAktuelleHoehe() {
        return aktuelleHoehe;
    }

    public void setAktuelleHoehe(int aktuelleHoehe) {
        this.aktuelleHoehe = aktuelleHoehe;
    }

    public void gibAktuelleHoehe(){
        System.out.println(aktuelleHoehe);
    }
    public void gibAirline(){
        System.out.println(airline);
    }


    @Override
    public String gibFortbewegung() {
        return "Ich fliege!";
    }
}
