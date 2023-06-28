package uebung3;

import java.util.Scanner;
public class Brettspiel {
    // Standard Position des Roboters beim start
    static int posx = 4;
    static int posy = 4;

    public static void main(String[] args) {
        // Spielfeldgröße
        int[][] feld = new int[10][10];

        //Roboter icon
        feld[posx][posy] = 7;

        Scanner sc = new Scanner(System.in);
        while(true){
            show(feld);
            System.out.println("Welche Richtung ? w,a,s,d");
            String eingabe = sc.nextLine();
            if(eingabe.equals("exit")) break;
            for (char bewegung : eingabe.toCharArray()) {
                switch (bewegung) {
                    case 'a' -> links(feld);
                    case 'd' -> rechts(feld);
                    case 'w' -> oben(feld);
                    case 's' -> unten(feld);
                }
            }
        }

    }

    private static void show(int[][] feld){
        for (int[] ints : feld) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void links(int[][] feld){
        if (posy - 1 >= 0) {
            feld[posx][posy] = 0; //alte position auf 0 ändern
            posy--;
            feld[posx][posy] = 7; // neue position
        }
    }

    private static void rechts(int[][] feld){
        if (posy + 1 < feld[0].length) {
            feld[posx][posy] = 0;
            posy++;
            feld[posx][posy] = 7;
        }
    }

    private static void oben(int[][] feld){
        if (posx - 1 >= 0) {
            feld[posx][posy] = 0;
            posx--;
            feld[posx][posy] = 7;
        }
    }

    private static void unten(int[][] feld){
        if (posx + 1 < feld.length) {
            feld[posx][posy] = 0;
            posx++;
            feld[posx][posy] = 7;
        }
    }

}
