import java.util.Scanner;

public class Obdlznik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Víta vás program na výpočet obvodu a obsahu obdĺžnika!");
        System.out.println("Použite príkaz s pre výpočet alebo q pre ukončenie.");

        while (true) {
            System.out.print("Zadajte príkaz: ");
            String prikaz = scanner.next();

            if (prikaz.equals("s")) {
                System.out.print("Zadajte dĺžku strany a: ");
                double a = scanner.nextDouble();
                System.out.print("Zadajte dĺžku strany b: ");
                double b = scanner.nextDouble();

                double obvod = vypocitajObvod(a, b);
                double obsah = vypocitajObsah(a, b);

                System.out.println("Obvod obdĺžnika: " + obvod);
                System.out.println("Obsah obdĺžnika: " + obsah);
            } else if (prikaz.equals("q")) {
                System.out.println("Koniec programu v jave.");
                break;
            } else {
                System.out.println("Neplatný príkaz, skúste znova.");
            }
        }

        scanner.close();
    }

    private static double vypocitajObvod(double a, double b) {
        return 2 * (a + b);
    }

    private static double vypocitajObsah(double a, double b) {
        return a * b;
    }
}
