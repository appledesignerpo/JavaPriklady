package ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo
public class ZakladneMatematickeOperacieCezMetodyKonzolovyVstupHodnot {
    public static double scitanie(double cislo1, double cislo2) {
        double sucet = cislo1 + cislo2;
        return sucet;
        //return cislo1 + cislo2; // Alternativny, resp. efektivny sposob vypoctu spolu s jeho vratenim
    }

    public static double odcitanie(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }

    public static double nasobenie(double cislo1, double cislo2) {
        return cislo1 * cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double modulo(double cislo1, double cislo2) {
        return cislo1 % cislo2;
    }
public static void vypis(String operacia, double cislo1, double cislo2, double vysledok){

    System.out.printf("%s 2 čísiel %.1f a %.1f je: %.1f%n", operacia, cislo1, cislo2, vysledok);
}


    public static void main(String[] args) {

        double cislo1 = 8, cislo2 =0;
// konozolovy vstup uzivatela
        Scanner skener = new Scanner(System.in); // Incializacia konzoloveho skenera na vstup z klavesnice
        System.out.println("Zadaj prve číslo 1: ");
        //cislo1 = skener.nextDouble(); // java realne caka  aby pouzivatel vlozil nejake cislo  + potvrdzje enterom


        try {
            cislo1 = skener.nextDouble(); // Java realne caka, aby pouzivatel vlozil nejaku hodnotu (cislo), ktoru potvrdzuje klavesou Enter
        } catch (InputMismatchException e) {
            System.out.println("Zadal si neakceptovatelny formát čísla");
            skener.close();
            System.exit(1); //nasilne ukoncenie
        }


        System.out.println("Zadaj prve číslo 2: ");
        cislo2 = skener.nextDouble();


// vypis vysledkov  matematicky operacii  volanim metody vypis

        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Nasobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo - zvysok po deleni:", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
