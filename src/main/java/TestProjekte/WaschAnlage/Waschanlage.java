package TestProjekte.WaschAnlage;

import java.util.Scanner;
public class Waschanlage {

    public static void main(String[] args) throws InterruptedException {

        final String TBL_ROW = "| %-10s | %-10s | %-10s | \n";


        System.out.println("Welches Programm möchten sie ?");
        System.out.printf(TBL_ROW,"Programm 1","Programm 2","Programm 3");
        System.out.printf(TBL_ROW,"Normal","Profi","Premium");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        System.out.println(choice);

        switch (choice) {
            case "1" -> WaschAnlage.Normal();
            case "2" -> WaschAnlage.Profi();
            case "3" -> WaschAnlage.Premium();
            default -> {
                break;
            }

        }
    }

    public static class WaschAnlage {
        private static final String[] importantInfo = {

                ".20%",
                "..47%",
                "...69%",
                "....100%"
        };

        public static void CarDirty() {
            String[] car = {
                    "  ______            W|W",
                    " /|_||_\\`.__        W|W",
                    "(   _    _ _\\       W|W",
                    "=`-(_)--(_)-'       W|W",
                    "*********************|***",
            };

            for (String line : car) {
                System.out.println(line);
            }
        }

        public static void CarClean() {
            String[] car = {
                    " W|W         ______",
                    " W|W        /|_||_\\`.__",
                    " W|W       (   _    _ _\\",
                    " W|W       =`-(_)--(_)-' ",
                    "**|**********************",
            };

            for (String line : car) {
                System.out.println(line);
            }
            System.out.println("Das Fahrzeug ist nun sauber.");
        }

        private static void sleeper(int sleep) throws InterruptedException {
            Thread.sleep(sleep);
        }

        private static void Normal() throws InterruptedException {
            sleeper(500);
            System.out.println("Normale Reinigung startet gleich...");
            sleeper(1000);
            for (String s : importantInfo) {
                sleeper(1150);
                System.out.println(s);
            }
            WaschAnlage.CarDirty();
            sleeper(5000);
            WaschAnlage.CarClean();
        }

        // Deine anderen Methoden können auf "importantInfo" zugreifen

        private static void Profi(){
            System.out.println("Test2");
        }

        private static void Premium(){
            System.out.println("PremiumTest");
        }
    }






}

