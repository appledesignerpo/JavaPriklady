/*
package ulohy;

import java.util.Scanner;



class Penazenka {
    private double zostatok;

    public Penazenka(double pociatocnyZostatok) {
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

    public void vyberPeniaze(double suma) {
        if (suma > 0 && suma <= zostatok) {
            zostatok -= suma;
            System.out.println("Zostatok po výbere: " + zostatok);
        } else {
            System.out.println("Nedostatok prostriedkov na účte.");
        }
    }
}


public class FinancnaAplikacia {
    class Autentifikacia {
        private static final String SPRÁVNE_HESLO = "123";

        public static boolean overHeslo(String zadaneHeslo) {
            return SPRÁVNE_HESLO.equals(zadaneHeslo);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte heslo: ");
        String zadaneHeslo = scanner.nextLine();

        if (Autentifikacia.overHeslo(zadaneHeslo)) {
            // Užívateľ bol úspešne autentifikovaný
            System.out.println("Vitajte v finančnej kalkulačke!");
            // Tu môžete umožniť používateľovi vykonávanie finančných výpočtov


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
*/
