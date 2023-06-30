package uebung5;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeVonProdukten {
    static List<Produkt> Products = new ArrayList<>();
    static final DateTimeFormatter fmt2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    static final DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd.MM.yy");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Was möchten sie tun ?");
            System.out.println("1-> Produkt hinzufügen\n2-> Produkte anschauen\nexit->Sonstige Eingabe");
            String eingabe = sc.nextLine().trim().toLowerCase();

            switch (eingabe) {
                case "1" -> addProducts();
                case "2" -> displayProducts();
                default -> {
                    System.out.println("Exiting application");
                    return;
                }
            }
        }

    }

    private static void addProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Produkte mit Verfallsdatum -> 1\n" +
                "Produkte ohne Verfallsdatum -> 2");
        String choice = sc.nextLine().trim();

        switch (choice) {
            case "1" -> addVerderblicheProdukte();
            case "2" -> addNichtVerderblicheProdukte();
            default -> {
                System.out.println("Invalid choice, please enter again");
                addProducts();
            }
        }
    }

    private static void displayProducts(){ //zeigt mir alle vorhandenen Produkte
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (Produkt product : Products) {
            System.out.println("Name: " + product.getName() +
                    "\nBeschreibung: " + product.getBeschreibung() +
                    "\nAufnahmedatum: " + product.getAufnahmedatum().format(fmt2) +
                    "\nMenge: " + product.getMenge() +
                    "\nPreis: " + product.getPreis() + " €" +
                    "\nVerfallsdatum: " + product.getAblaufdatum().format(fmt4) +
                    "\n**********");
        }
        System.out.println();
    }

    private static void addVerderblicheProdukte(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Datum der Aufname in den bestand: Format:dd-MM-yyyy");
        String date = sc.nextLine().trim();
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate aufnahmedatum = LocalDate.parse(date, fmt2);

        System.out.println("Produktname");
        String name = sc.nextLine().trim();

        System.out.println("Produktbeschreibung:");
        String beschreibung = sc.nextLine().trim();

        System.out.println("Produktmenge");
        int menge = sc.nextInt();
        sc.nextLine();

        System.out.println("Preis des Produktes");
        double preis = sc.nextDouble();
        sc.nextLine();

        System.out.println("Verfallsdatum: ");
        String ablaufDate = sc.nextLine().trim();
        LocalDate ablaufDatum = LocalDate.parse(ablaufDate, fmt2);

        Produkt newProduct = new Produkt(aufnahmedatum, name, beschreibung, menge, preis,ablaufDatum);

        Products.add(newProduct);
    }

    private static void addNichtVerderblicheProdukte(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Datum der Aufname in den bestand: Format:dd-MM-yyyy");
        String date = sc.nextLine().trim();
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate aufnahmedatum = LocalDate.parse(date, fmt2);

        System.out.println("Produktname");
        String name = sc.nextLine().trim();

        System.out.println("Produktbeschreibung:");
        String beschreibung = sc.nextLine().trim();

        System.out.println("Produktmenge");
        int menge = sc.nextInt();

        sc.nextLine();
        System.out.println("Preis des Produktes");
        double preis = sc.nextDouble();

        sc.nextLine();
        Produkt newProduct = new Produkt(aufnahmedatum, name, beschreibung, menge, preis, null);

        Products.add(newProduct);
    }



}
