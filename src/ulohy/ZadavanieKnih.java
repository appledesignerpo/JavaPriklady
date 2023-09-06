package ulohy;

import java.util.ArrayList;
import java.util.Scanner;

public class ZadavanieKnih {
    public static void main(String[] args) {
        ArrayList<String> knihy = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vitajte v aplikaci Zadavanie Knih!");
        System.out.println("Zadajte názvy knih (pre ukončenie zadejte 'koniec'):");

        while (true) {
            System.out.print("Zadajte názov knihy: ");
            String nazev = scanner.nextLine();

            if (nazev.equalsIgnoreCase("koniec")) {
                break; // Ukoncime cyklus, az kym nebude koniec
            }

            knihy.add(nazev); // do zoznamu
        }

        if (knihy.isEmpty()) {
            System.out.println("Nevložili jste žiadne knihy.");
        } else {
            System.out.println("Zoznam zadaných knih:");
            for (String kniha : knihy) {
                System.out.println(kniha);
            }
        }

        scanner.close();
    }
}
