package ulohy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;





class Penazenka2 {
    private double zostatok;

    public Penazenka2(double pociatocnyZostatok) {
        this.zostatok = pociatocnyZostatok;
    }

    public double getZostatok() {
        return zostatok;
    }

    public void vlozPeniaze(double suma) {
        if (suma > 0) {
            zostatok += suma;
            System.out.println("Zostatok po vklade: " + zostatok);
        } else {
            System.out.println("Neplatná suma na vklad.");
        }
    }

    public void vyberPeniaze2(double suma) {
        if (suma > 0 && suma <= zostatok) {
            zostatok -= suma;
            System.out.println("Zostatok po výbere: " + zostatok);
        } else {
            System.out.println("Nedostatok prostriedkov na účte.");
        }
    }
}





public class FinancnaAplikacia2 {


    class PrveSpustenie {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Vitajte pri prvom spustení finančnej kalkulačky!");
            System.out.print("Vytvorte si heslo: ");
            String noveHeslo = scanner.nextLine();

            // Uloženie hesla do súboru
            try {
                FileWriter writer = new FileWriter("heslo.txt");
                writer.write(noveHeslo);
                writer.close();
                System.out.println("Heslo bolo úspešne uložené.");
            } catch (IOException e) {
                System.out.println("Chyba pri ukladaní hesla.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulozeneHeslo = citajUlozeneHeslo();

        if (ulozeneHeslo == null) {
            // Prvý spustenie, používateľ musí vytvoriť heslo
            // Implementujte kód zo "PrveSpustenie"
        } else {
            System.out.print("Zadajte heslo: ");
            String zadaneHeslo = scanner.nextLine();

            if (ulozeneHeslo.equals(zadaneHeslo)) {
                System.out.println("Vitajte v finančnej kalkulačke!");
                // Implementujte kód pre finančnú kalkulačku




            System.out.print("Zadajte počiatočný zostatok: ");
            double pociatocnyZostatok = scanner.nextDouble();

            Penazenka penazenka = new Penazenka(pociatocnyZostatok);

            System.out.println("Vaša peňaženka bola vytvorená s pociatocným zostatkom: " + pociatocnyZostatok);

            while (true) {
                System.out.println("Vyberte požadovanú operáciu napr.:");
                System.out.println("1 - Vklad peňazí max 150");
                System.out.println("2 - Výber peňazí");
                System.out.println("3 - Zobrazenie zostatku");
                System.out.println("0 - Ukončiť program");
                int volba = scanner.nextInt();

                switch (volba) {
                    case 1 -> {
                        System.out.print("Zadajte sumu na vklad: ");
                        double vkladSuma = scanner.nextDouble();
                        penazenka.vlozPeniaze(vkladSuma);
                    }
                    case 2 -> {
                        System.out.print("Zadajte sumu na výber: ");
                        double vyberSuma = scanner.nextDouble();
                        penazenka.vyberPeniaze(vyberSuma);
                    }
                    case 3 -> System.out.println("Aktuálny zostatok: " + penazenka.getZostatok());
                    case 0 -> {
                        System.out.println("Ďakujeme, že ste použili finančnú aplikáciu.");
                        return;
                    }
                    default -> System.out.println("Neplatná voľba, skúste znova.");
                }
            }
            } else {
                System.out.println("Nesprávne heslo. Prístup zamietnutý.");
            }

        }



    }
    private static String citajUlozeneHeslo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("heslo.txt"));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            return null; // Súbor s heslom neexistuje, ešte nebolo vytvorené heslo
        }
    }

}



