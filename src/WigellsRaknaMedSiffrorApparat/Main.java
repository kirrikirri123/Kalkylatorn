package WigellsRaknaMedSiffrorApparat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KalkylatorMethods kalkylMetod = new KalkylatorMethods();
        String start = "";

       boolean userChoice = true;
       //while (userChoice) {
        kalkylMetod.MainMenu(start);
        int menuScan = scanner.nextInt();
        System.out.println();

        switch (menuScan) {
            case 1 ->  System.out.println("Vilka två tal vill du få summan utav? Avskilj termerna med mellanslag."); // +
            int userIntFirst = scanner.nextInt();
            int userIntSec = scanner.nextInt();
                    kalkylMetod.add(userIntFirst, userIntSec);
                    System.out.println("________________________________________________");
                    System.out.println();
            case 2 ->System.out.println("Vilka två tal vill du få differensen utav? Avskilj termerna med mellanslag."); //-
            case 3 -> ; // *
            case 4 -> ; // /
            case 5 -> System.out.println(" Avslutar programmet \n Tack för att du använde Wigells räkna-ihop-siffror-apparat.");
            userChoice = false;
        }

      // }
    }
}