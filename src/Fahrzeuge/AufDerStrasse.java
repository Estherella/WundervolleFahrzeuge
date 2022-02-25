package Fahrzeuge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AufDerStrasse extends Fahrzeug{
    private int reifenanzahl;
    private String naechsterTUEV;

    // Hier folgt der Konstruktor
    public AufDerStrasse(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis,
                         int id, String antrieb, int reifenanzahl, String naechsterTUEV){
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb);
        this.reifenanzahl = reifenanzahl;
        this.naechsterTUEV = naechsterTUEV;
    }

    // Hier folgen die Methoden
    public void gibReifen(){
        System.out.println("Ich habe " + reifenanzahl + "Reifen.");
    }
    public void tuevAbgelaufen(){
        LocalDateTime ldt = LocalDateTime.now();
        String datum2 = DateTimeFormatter.ofPattern("MM/yyyy", Locale.ENGLISH).format(ldt);

        if (naechsterTUEV.compareTo(datum2) <= 0) {
            System.out.println("TÜV abgelaufen!");
        }
    }

    @Override
    public String gibFortbewegung() {
        return "Ich fahre auf der Straße!";
    }
}
