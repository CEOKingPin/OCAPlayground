package uebung2;

import java.util.Arrays;
import java.util.Random;

public class wuerfelSpiel {

    static Random rand = new Random();

    public static int wuerfeln() {
        int zufallszahl = rand.nextInt(6) + 1;
        return zufallszahl;
    }

    public static int[] mehrereWuerfel() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void zaehler(int[] arr) {
        int[] counts = new int[6];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - 1]++;
        }

        System.out.print("Wurfergebnis:");
        for (int i = 0; i < counts.length; i++) {
            System.out.print(" " + counts[i] + " mal " + (i + 1) + ",");
        }
        System.out.println();
    }

    public static int[] Wuerfel10() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static int[] Wuerfel100() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Deine Zahl: " + wuerfeln());
        int[] arr = mehrereWuerfel();
        System.out.println();
        System.out.println("Alle Würfe: " + Arrays.toString(arr));
        zaehler(arr);
        System.out.println();
        System.out.println("10er Würfel: " + Arrays.toString(Wuerfel10()));
        System.out.println("100er Würfel: " + Arrays.toString(Wuerfel100()));
    }
}
