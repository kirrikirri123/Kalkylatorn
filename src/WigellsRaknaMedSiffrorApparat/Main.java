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
           boolean addAgain = true;
           boolean subAgain = true;
           boolean multiAgain= true;
           boolean divAgain = true;
           boolean moduAgain = true;
                  kalkylMetod.MainMenu(start);
        System.out.print("\t\t\t");
        String userMenuIn =scanner.next();
        int menuScan = userMenuIn.charAt(0);


        System.out.println("------> ------->");

        switch (menuScan) {
            case '1' :
            case '+':
                while (addAgain){System.out.println("Vilka två tal vill du få summan utav? Avskilj termerna med mellanslag eller enter.");
                double userAddFirst = scanner.nextDouble(); double userAddSec = scanner.nextDouble();
                kalkylMetod.add(userAddFirst, userAddSec);
            System.out.println("________________________________________________");
            System.out.println();
            System.out.println("Addition igen? Skriv in JA");
            String userAdd = scanner.next();if (!userAdd.equalsIgnoreCase("JA")){addAgain= false;}}
                break;
            case '2':
            case '-':
                while (subAgain){ System.out.println("Vilka två tal vill du få differensen utav? Avskilj termerna med mellanslag eller enter.");
                double userSubFirst = scanner.nextDouble(); double userSubSecond = scanner.nextDouble();
                kalkylMetod.sub(userSubFirst,userSubSecond);
            System.out.println("________________________________________________");
            System.out.println();
                System.out.println("Subtraktion igen? Skriv in JA");
                String userSub = scanner.next();if (!userSub.equalsIgnoreCase("JA")){subAgain= false;}}
            break;
            case '3':
            case '*':
                while (multiAgain){System.out.println("Vilka två tal vill du få produkten utav? Avskilj faktorerna med mellanslag eller enter.");
                double userMultiFirst = scanner.nextDouble(); double userMultiSecond = scanner.nextDouble();
                kalkylMetod.mulit(userMultiFirst,userMultiSecond);
            System.out.println("________________________________________________");
            System.out.println();
                System.out.println("Multiplikation igen? Skriv in JA");
                String userMulti = scanner.next();if (!userMulti.equalsIgnoreCase("JA")){multiAgain= false;}}
            break;
            case '4':
            case '/':
                while (divAgain){ System.out.println("Vilka två tal vill du få kvoten utav? Avskilj med mellanslag eller enter.");
                double userDivFirst = scanner.nextDouble(); double userDivSecond = scanner.nextDouble();;
                kalkylMetod.div(userDivFirst, userDivSecond);
            System.out.println("________________________________________________");
            System.out.println();
                System.out.println("Division igen? Skriv in JA");
                String userDiv = scanner.next();if (!userDiv.equalsIgnoreCase("JA")){divAgain= false;}}
            break;
            case '5':
            case '%':
                while (moduAgain){System.out.println("Modulus räknar ut resten efter du dividerat två tal. Vilka två tal vill du testa ? Avskilj med mellanslag eller enter.");
                double userModFirst = scanner.nextDouble(); double userModSecond = scanner.nextDouble();;
                kalkylMetod.modu(userModFirst, userModSecond);
            System.out.println("________________________________________________");
            System.out.println();
                System.out.println("Modulus igen? Skriv in JA");
                String userModu = scanner.next();if (!userModu.equalsIgnoreCase("JA")){moduAgain= false;}}
            break;
            case '6' : System.out.println(" Avslutar programmet ! \n Tack för att du använde Wigells räkna-med-siffror-apparat.");
            userChoice = false;
            break;
                default : System.out.println(" Åh nej, något blev fel! Prova att ange siffran till vänster om vald räknemetod i menyn. ");


        }

       }
    }
}