package uebung2;

import java.util.Arrays;
import java.util.Random;
public class DiceCup {

    private Random rand = new Random();

    private int size = 6; // Standard

    public int roll() {
        return rand.nextInt(6) +1;
    }

    public int[] roll(int num) {
        int[] results = new int[num]; //Baut ein leeres array mit vorgegebener Größe

        for(int i = 0; i < results.length;i++){
            results[i] = roll();
        }

        return results;
    }



    public static void main(String[] args) {

        DiceCup cup = new DiceCup();
        System.out.println("Ein Würfel: " + cup.roll());

        int[] res = cup.roll(100);
        String resStr = Arrays.toString(res);
        System.out.println("Mehrere Würfe: " + resStr);

        for(int i : res){
            System.out.println(i);
        }
    }
}
