package Fahrzeuge;

public class Museumslok extends AufSchienen implements Verbrennungsmotor{
    private String name;
    private int tankanzeige;

    public Museumslok(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis, int id, String antrieb, String abfahrtsort, String ankunftsort, String name){
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, abfahrtsort, ankunftsort);
        this.name = name;
        this.tankanzeige = 100;
    }

    public void rundfahrt(){
        if(tankanzeige == 0) {
            System.out.println("Die Rundfahrt ist leider nicht möglich. Der Sprit ist alle!");
        }
        tankanzeige = tankanzeige - 10;

    }
    @Override
    public void tanken() {
        if(tankanzeige <= 20){
            System.out.println("Ich muss tanken!");
        } else {
            System.out.println("Mein Tank ist noch voll genug.");
        }

    }
}
