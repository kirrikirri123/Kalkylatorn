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
            case 1 : System.out.println("Vilka två tal vill du få summan utav? Avskilj termerna med mellanslag, avsluta med enter.");
                int userAddFirst = scanner.nextInt(); int userAddSec = scanner.nextInt();
                kalkylMetod.add(userAddFirst, userAddSec);
                System.out.println("________________________________________________");
                System.out.println();
                break;
            case 2  : System.out.println("Vilka två tal vill du få differensen utav? Avskilj termerna med mellanslag, avsluta med enter.");
                int userSubFirst = scanner.nextInt(); int userSubSecond = scanner.nextInt();
                kalkylMetod.sub(userSubFirst,userSubSecond);
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 3 : System.out.println("Vilka två tal vill du få produkten utav? Avskilj faktorerna med ett mellanslag, avsluta med enter.");
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 4 : System.out.println("Vilka två tal vill du få kvoten utav? Avskilj med mellanslag, avsluta me enter.") ; // /
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 5 : System.out.println(" Avslutar programmet \n Tack för att du använde Wigells räkna-ihop-siffror-apparat.");
            userChoice = false;
            default : System.out.println(" Åh nej, något blev fel. Prova att ange vald siffran till vänster om vald räknemetod i menyn ");
        }

      // }
    }
}