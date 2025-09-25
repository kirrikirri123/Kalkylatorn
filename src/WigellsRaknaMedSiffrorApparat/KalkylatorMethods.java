package WigellsRaknaMedSiffrorApparat;

import java.util.Scanner;

public class KalkylatorMethods {

    public void MainMenu(String x ){

        System.out.println("Välkommen till Wigells räkna-med-siffor-apparat.\n" +
                "Välj en av följande räknemetoder genom att skriva in funktionens nummer:\n");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraktion");
        System.out.println("[3] Multiplikation");
        System.out.println("[4] Division");
        System.out.println("[5] Avsluta programmet!");
    }


// Addition

    public void add(int x, int y){
        System.out.println("Summan av talen blir = " +(x+y));
    }
    public void sub(int x,int y) {
        System.out.println("Differensen av talen blir = " + (x-y));
    }
    }



