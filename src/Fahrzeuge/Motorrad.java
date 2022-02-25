package Fahrzeuge;

public class Motorrad extends AufDerStrasse implements Elektrisch, Verbrennungsmotor{
    private String modell;
    private int baujahr;


    public Motorrad(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis,
                    int id, String antrieb, int reifenanzahl, String naechsterTUEV, String modell, int baujahr){
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, 2, naechsterTUEV);
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
            System.out.println("Einmal links und dort gibt es eine Ladesäule.");
        } else {
            System.out.println("Lieber an eine Tankstelle fahren.");
        }
    }

    @Override
    public void tanken() {
        if (this.getAntrieb() == "Fahrzeuge.Verbrennungsmotor"){
            System.out.println("Die nächste Tankstelle ist in 2km.");
        } else {
            System.out.println("Tanken kann dieses Fahrzeuge.Fahrzeug nicht.");
        }
    }
}
