package uebung5;

import java.time.LocalDate;

public class Produkt {

    private final LocalDate aufnahmedatum;
    private final String name;
    private final String beschreibung;
    private final int menge;
    private final double preis;
    private final LocalDate ablaufdatum;

    public Produkt(LocalDate aufnahmedatum, String name, String beschreibung, int menge, double preis, LocalDate ablaufdatum) {
        this.aufnahmedatum = aufnahmedatum;
        this.name = name;
        this.beschreibung = beschreibung;
        this.menge = menge;
        this.preis = preis;
        this.ablaufdatum = ablaufdatum;
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
    public LocalDate getAblaufdatum(){ return ablaufdatum;}
}
