package WigellsRaknaMedSiffrorApparat;

public class KalkylatorMethods {

    public void MainMenu(String x) {

        System.out.println("Välj en av räknemetoderna.\nSkriv in funktionens nummer och bekräfta med enter.\n");
        System.out.println("[1] + Addition + ");
        System.out.println("[2] - Subtraktion -");
        System.out.println("[3] * Multiplikation *");
        System.out.println("[4] / Division / ");
        System.out.println("[5] % Modulus % ");
        System.out.println("[6] Avsluta programmet!");
    }


    // Addition
    public void add(double x, double y) {
        System.out.println("Summan av talen blir = " + (x + y));
    }

    // Subtraktion
    public void sub(double x, double y) {
        System.out.println("Differensen av talen blir = " + (x - y));
    }

    // Multiplikation
    public void mulit(double x, double y) {
        System.out.println("Produkten av talen blir = " + (x * y));
    }  //Division

    public void div(double x, double y) {
        if (y == 0) {
            System.out.println("Tyvärr, det går inte dela ett tal med noll. Försök igen");
        } else {
            System.out.println("Kvoten av talen blir = " + (x / y));
        }
    }

    // Modulus
    public void modu(double x, double y) {
        if (x <= y) {
            System.out.println("Täljaren i ditt tal måste vara större än nämnaren, försök igen ! ");
        } else if (x == 0 || y == 0) {
            System.out.println("Tyvärr, modulus går ej beräkna med talet noll, försök igen");
        } else {
            System.out.println("Resten ur ditt dividerade tall blir = " + (x % y));
        }
    }
}
