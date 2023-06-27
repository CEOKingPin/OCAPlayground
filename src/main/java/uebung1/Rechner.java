package uebung1;

import java.util.*;

public class Rechner {
    private List<String> protokoll = new ArrayList<>();
    public double addieren(double a, double b) {
        double ergebnis = a + b;
        protokoll.add(a+" + " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double subtrahieren(double a, double b) {
        double ergebnis = a - b;
        protokoll.add(a + " - " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double multiplizieren(double a, double b) {
        double ergebnis = a * b;
        protokoll.add(a + " * " + b + " = " + ergebnis);
        return ergebnis;
    }

    public double dividieren(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null, wirklich ?");
        }
        double ergebnis = a / b;
        protokoll.add(a + " / " + b + " = " + ergebnis);
        return ergebnis;
    }

    public void protokollAusgabe() {
        System.out.println("Protokoll: ");
            for (String eintrag : protokoll) {
                System.out.println(eintrag);
            }
    }
}