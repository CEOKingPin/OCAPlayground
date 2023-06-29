package uebung3;

import java.util.Scanner;

public class BrettspielOptimiert {
    // Spielfeldgröße
    private int[][] feld = new int[10][10];
    private int posx = 4;
    private int posy = 4;

    public static void main(String[] args) {
        BrettspielOptimiert brettspiel = new BrettspielOptimiert();
        brettspiel.start();
    }

    public void start() {
        //Roboter icon
        feld[posx][posy] = 7;

        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                show();
                System.out.println("Welche Richtung ? w,a,s,d");
                String eingabe = sc.nextLine().toLowerCase();
                if(eingabe.equals("exit")) break;
                for (char bewegung : eingabe.toCharArray()) {
                    switch (bewegung) {
                        case 'a' -> bewegeRoboter(0, -1);
                        case 'd' -> bewegeRoboter(0, 1);
                        case 'w' -> bewegeRoboter(-1, 0);
                        case 's' -> bewegeRoboter(1, 0);
                    }
                }
            }
        }
    }

    private void show() {
        for (int[] ints : feld) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private void bewegeRoboter(int dx, int dy) {
        int newX = posx + dx;
        int newY = posy + dy;
        if (istGültigePosition(newX, newY)) {
            feld[posx][posy] = 0;
            posx = newX;
            posy = newY;
            feld[posx][posy] = 7;
        }
    }

    private boolean istGültigePosition(int x, int y) {
        return x >= 0 && x < feld.length && y >= 0 && y < feld[0].length;
    }
}
