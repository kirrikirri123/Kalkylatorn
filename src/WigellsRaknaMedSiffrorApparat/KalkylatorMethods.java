package WigellsRaknaMedSiffrorApparat;

import java.util.Scanner;

public class KalkylatorMethods {

    public void MainMenu(String x ){

        System.out.println("Välj en av räknemetoderna.\nSkriv in funktionens nummer och bekräfta med enter.\n");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraktion");
        System.out.println("[3] Multiplikation");
        System.out.println("[4] Division");
        System.out.println("[5] Avsluta programmet!");
    }


    // Addition
    public void add(double x, double y){
        System.out.println("Summan av talen blir = " +(x+y));
    }
    // Subtraktion
    public void sub(double x,double y) {
        System.out.println("Differensen av talen blir = " + (x-y));
    }
    // Multiplikation
    public void mulit(double x, double y){
        System.out.println("Produkten av talen blir = "+ (x*y));
    }
    //Division
    public void div(double x, double y) {
        System.out.println("Kvoten av talen blir = "+(x/y));
    }
    }



