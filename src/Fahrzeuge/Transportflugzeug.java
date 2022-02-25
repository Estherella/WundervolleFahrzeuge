package Fahrzeuge;

import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Transportflugzeug extends InDerLuft implements Verbrennungsmotor {
    private int zuladung;
    private int modell;

    public Transportflugzeug(int geschwindigkeit, String farbe, String hersteller, String treibstoff, double preis, int id, String antrieb, String airline, int aktuelleHoehe, int zuladung, int modell) {
        super(geschwindigkeit, farbe, hersteller, treibstoff, preis, id, antrieb, airline, aktuelleHoehe);
        this.zuladung = zuladung;
        this.modell = modell;
    }

    public int getZuladung() {
        return zuladung;
    }

    public void setZuladung(int zuladung) {
        this.zuladung = zuladung;
    }

    public int getModell() {
        return modell;
    }

    public void setModell(int modell) {
        this.modell = modell;
    }

    public void starten(){
        System.out.println("Das Flugzeug startet und hat schon eine Höhe von 100m");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int secBisFlughoehe = 3;

            public void run() {

                System.out.println(secBisFlughoehe);
                secBisFlughoehe--;

                if (secBisFlughoehe < 0) {
                    System.out.println("Wir haben die Flughöhe von " + Transportflugzeug.super.getAktuelleHoehe());
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }
    @Override
    public void tanken() {
        System.out.println("Vor jedem Start wird das Flugzeug getankt.");
    }
}
