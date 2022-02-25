package Fahrzeuge;

public class Auto extends AufDerStrasse implements Elektrisch, Verbrennungsmotor{
    private String modell;
    private int baujahr;


    public Auto(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis,
                int id, String antrieb, int reifenanzahl, String naechsterTUEV, String modell, int baujahr){
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, 4, naechsterTUEV);
        this.modell = modell;
        this.baujahr = baujahr;

    }

    public String getModell() {
        return modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setBaujahr(int baujahr) {
        baujahr = baujahr;
    }



    @Override
    public void laden() {
        if (this.getAntrieb() == "Fahrzeuge.Elektrisch"){
            System.out.println("Die 2. Straße rechts rein und dort ist eine Ladesäule.");
        } else {
            System.out.println("Mit dem Motor lieber eine Tankstelle aufsuchen.");
        }
    }

    @Override
    public void tanken() {
        if (this.getAntrieb() == "Fahrzeuge.Verbrennungsmotor"){
            System.out.println("In 100m geradeaus gibt es eine Tankstelle.");
        } else {
            System.out.println("Zum Glück hat die Tankstelle da vorne auch eine Ladesäule für E-Fahrzeuge.");
        }
    }
}
