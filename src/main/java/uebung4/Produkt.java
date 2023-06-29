package uebung4;

import java.time.LocalDate;

public class Produkt {

    private final LocalDate aufnahmedatum;
    private final String name;
    private final String beschreibung;
    private final int menge;
    private final double preis;

    public Produkt(LocalDate aufnahmedatum, String name, String beschreibung, int menge, double preis) {
        this.aufnahmedatum = aufnahmedatum;
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
    }
    public LocalDate getAufnahmedatum() {
        return aufnahmedatum;
    }
    public String getName() {
        return name;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public int getMenge() {
        return menge;
    }
    public double getPreis() {
        return preis;
    }
}
