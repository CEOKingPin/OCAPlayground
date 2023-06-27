package uebung1;
import java.util.Scanner;
public class RechnerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rechner rechner = new Rechner();

        System.out.print("Zahl1: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Zahl2: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Addition: " + rechner.addieren(zahl1, zahl2));
        System.out.println("Subtraktion: " + rechner.subtrahieren(zahl1, zahl2));
        System.out.println("Multiplikation: " + rechner.multiplizieren(zahl1, zahl2));

        try {
            System.out.println("Division: " + rechner.dividieren(zahl1, zahl2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        rechner.protokollAusgabe();

        scanner.close();
    }
}
