package ulohy;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

 class RoundedSum {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double sum = 123.13698; // Inicializujeme premennú na ukladanie súčtu hodnôt

        System.out.println("Zadávajte číselné hodnoty (pre ukončenie zadajte záporné číslo):");

        while (true) {
            try {
                System.out.print("Zadajte číslo: ");
                double input = scanner.nextDouble();

                if (input < 0) {
                    break; // Ukončíme cyklus, ak používateľ zadá záporné číslo
                }

                numbers.add(input); // Pridáme číslo do ArrayListu
                sum += input; // Sčítame hodnotu k súčtu
            } catch (InputMismatchException e) {
                System.out.println("Neplatný vstup. Zadajte platné číslo.");
                scanner.next(); // Vyčistíme neplatný vstup zo skenera
            }
        }

        System.out.println("Zadali ste nasledujúce čísla:");
        for (double number : numbers) {
            System.out.println(number);
        }

        // Zaokrúhlenie na 2 desatinné miesta
        double roundedSum = Math.round(sum * 100.0) / 100.0;
        System.out.println("Súčet všetkých zadaných čísel je: " + roundedSum);

        scanner.close();
    }
}


