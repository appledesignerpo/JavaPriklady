package ulohy;

import java.util.Scanner;

public class PenazenkaAplikacia {
    private static double zostatok = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vyberte operáciu:");
            System.out.println("1 - Vklad peňazí");
            System.out.println("2 - Výber peňazí");
            System.out.println("3 - Zobrazenie zostatku");
            System.out.println("0 - Ukončiť program");
            int volba = scanner.nextInt();

            switch (volba) {
                case 1:
                    System.out.print("Zadajte sumu na vklad: ");
                    double vkladSuma = scanner.nextDouble();
                    vkladPenazi(vkladSuma);
                    break;
                case 2:
                    System.out.print("Zadajte sumu na výber: ");
                    double vyberSuma = scanner.nextDouble();
                    vyberPenazi(vyberSuma);
                    break;
                case 3:
                    zobrazZostatok();
                    break;
                case 0:
                    System.out.println("Ďakujeme, že ste použili peňaženku.");
                    return;
                default:
                    System.out.println("Neplatná voľba, skúste znova.");
            }
        }
    }

    private static void vkladPenazi(double suma) {
        if (suma > 0) {
            zostatok += suma;
            System.out.println("Vklad " + suma + " € bol úspešne uskutočnený.");
        } else {
            System.out.println("Neplatná suma na vklad.");
        }
    }

    private static void vyberPenazi(double suma) {
        if (suma > 0 && suma <= zostatok) {
            zostatok -= suma;
            System.out.println("Výber " + suma + " € bol úspešne uskutočnený.");
        } else {
            System.out.println("Neplatná suma na výber alebo nedostatok peňazí na účte.");
        }
    }

    private static void zobrazZostatok() {
        System.out.println("Aktuálny zostatok: " + zostatok + " €");
    }
}
