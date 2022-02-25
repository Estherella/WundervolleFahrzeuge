package Fahrzeughaendler;


import Fahrzeuge.Fahrzeug;

import java.util.ArrayList;

public class Fahrzeughaendler {
    private String name;
    public ArrayList<Verkaufsfahrzeug> verkaufsliste;

    public Fahrzeughaendler(String name) {
        this.name = name;
        this.verkaufsliste = new ArrayList<Verkaufsfahrzeug>();
    }

    public Fahrzeughaendler(String name, ArrayList<Verkaufsfahrzeug> verkaufsliste) {
        this.name = name;
        this.verkaufsliste = verkaufsliste;
    }

    public void addFahrzeug(Verkaufsfahrzeug fahrzeug) {
        this.verkaufsliste.add(fahrzeug);
    }

    public ArrayList<Verkaufsfahrzeug> aufStrasse(){
        ArrayList<Verkaufsfahrzeug> aufStrasse = new ArrayList<>();
        for(Verkaufsfahrzeug verkaufsfahrzeug: verkaufsliste){
            if (verkaufsfahrzeug.fahrzeug.gibFortbewegung().equals("Ich fahre auf der Straße!")){
                aufStrasse.add(verkaufsfahrzeug);

            }
        }
        return aufStrasse;
    }

    public ArrayList<Verkaufsfahrzeug> aufSchiene(){
        ArrayList<Verkaufsfahrzeug> aufSchiene = new ArrayList<>();
        for(Verkaufsfahrzeug verkaufsfahrzeug: verkaufsliste){
            if (verkaufsfahrzeug.fahrzeug.gibFortbewegung().equals("Ich fahre auf Schienen!")){
                aufSchiene.add(verkaufsfahrzeug);

            }
        }
        return aufSchiene;
    }

    public ArrayList<Verkaufsfahrzeug> inLuft(){
        ArrayList<Verkaufsfahrzeug> inLuft = new ArrayList<>();
        for(Verkaufsfahrzeug verkaufsfahrzeug: verkaufsliste){
            if (verkaufsfahrzeug.fahrzeug.gibFortbewegung().equals("Ich fliege!")){
                inLuft.add(verkaufsfahrzeug);

            }
        }
        return inLuft;
    }
    

    public void verkaufen(int id, int preis){
        for(Verkaufsfahrzeug verkaufsfahrzeug: verkaufsliste){
            if (verkaufsfahrzeug.id == id && verkaufsfahrzeug.preis >= preis ){
                System.out.println(verkaufsfahrzeug);
                verkaufsliste.remove(id);
            } else if (verkaufsfahrzeug.id == id && verkaufsfahrzeug.preis < preis) {
                System.out.println("Das Fahrzeug ist teurer als der gezahlte Betrag");
            }
        }


    }



}
