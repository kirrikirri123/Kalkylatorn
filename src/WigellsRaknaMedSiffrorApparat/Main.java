package WigellsRaknaMedSiffrorApparat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KalkylatorMethods kalkylMetod = new KalkylatorMethods();
        String start = "\nVälkommen till Wigells räkna-med-siffor-apparat!\n";

       boolean userChoice = true;
       System.out.println(start);
       while (userChoice) {
        kalkylMetod.MainMenu(start);
        int menuScan = scanner.nextInt();
                System.out.println();

        switch (menuScan) {
            case 1 : System.out.println("Vilka två tal vill du få summan utav? Avskilj termerna med mellanslag, avsluta med enter.");
                double userAddFirst = scanner.nextDouble(); double userAddSec = scanner.nextDouble();
                kalkylMetod.add(userAddFirst, userAddSec);
                System.out.println("________________________________________________");
                System.out.println();
                break;
            case 2  : System.out.println("Vilka två tal vill du få differensen utav? Avskilj termerna med mellanslag, avsluta med enter.");
                double userSubFirst = scanner.nextDouble(); double userSubSecond = scanner.nextDouble();
                kalkylMetod.sub(userSubFirst,userSubSecond);
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 3 : System.out.println("Vilka två tal vill du få produkten utav? Avskilj faktorerna med ett mellanslag, avsluta med enter.");
                double userMultiFirst = scanner.nextDouble(); double userMultiSecond = scanner.nextDouble();
                kalkylMetod.mulit(userMultiFirst,userMultiSecond);
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 4 : System.out.println("Vilka två tal vill du få kvoten utav? Avskilj med mellanslag, avsluta med enter.") ;
            double userDivFirst = scanner.nextDouble(); double userDivSecond = scanner.nextDouble();;
            kalkylMetod.div(userDivFirst, userDivSecond);
            System.out.println("________________________________________________");
            System.out.println();
            break;
            case 5 : System.out.println(" Avslutar programmet ! \n Tack för att du använde Wigells räkna-ihop-siffror-apparat.");
            userChoice = false;
            break;
                default : System.out.println(" Åh nej, något blev fel! Prova att ange siffran till vänster om vald räknemetod i menyn. ");


        }

       }
    }
}