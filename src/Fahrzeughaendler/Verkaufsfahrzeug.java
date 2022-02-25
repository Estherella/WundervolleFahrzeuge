package Fahrzeughaendler;

import Fahrzeuge.Fahrzeug;

public class Verkaufsfahrzeug {
    Fahrzeug fahrzeug;
    int id;
    int preis;

    public Verkaufsfahrzeug(Fahrzeug fahrzeug, int id, int preis) {
        this.fahrzeug = fahrzeug;
        this.id = id;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Verkaufsfahrzeug{" +
                "fahrzeug=" + fahrzeug +
                ", id=" + id +
                ", preis=" + preis +
                '}';
    }
}


