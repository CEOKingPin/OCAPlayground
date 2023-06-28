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
                    case 'a':
                        links(feld);
                        break;
                    case 'd':
                        rechts(feld);
                        break;
                    case 'w':
                        oben(feld);
                        break;
                    case 's':
                        unten(feld);
                        break;
                }
            }
        }

    }

    private static void show(int[][] feld){
        for(int i = 0;i < feld.length;i++){
            for(int j = 0; j < feld[i].length; j++){
                System.out.print(feld[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void links(int[][] feld){
        if (posy - 1 >= 0) {
            feld[posx][posy] = 0;
            posy--;
            feld[posx][posy] = 7;
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
