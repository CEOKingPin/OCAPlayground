package uebung4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ListeVonProdukten {
    static List<Produkt> Products = new ArrayList<>();
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

    private static void displayProducts(){ //zeigt mir alle vorhandenen Produkte
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (Produkt product : Products) {
            System.out.println("Name: " + product.getName() +
                    "\nBeschreibung: " + product.getBeschreibung() +
                    "\nDatum: " + product.getAufnahmedatum().format(dtf).replace("-",".") +
                    "\nMenge: " + product.getMenge() +
                    "\nPreis: " + product.getPreis() + " €\n" +
                    "**********");
        }
        System.out.println();
    }

    private static void addProducts() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Datum der Aufname in den bestand: Format:dd-MM-yyyy");
        String date = sc.nextLine().trim();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate aufnahmedatum = LocalDate.parse(date, dtf);

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
        Produkt newProduct = new Produkt(aufnahmedatum, name, beschreibung, menge, preis);

        Products.add(newProduct);
    }




}