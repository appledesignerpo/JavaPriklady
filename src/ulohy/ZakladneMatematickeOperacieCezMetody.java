package ulohy;
// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo
public class ZakladneMatematickeOperacieCezMetody {
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
    //System.out.printf("%s 2 cisel je %.1f a %.1f je: %.1f%n" ,operacia, cislo1,cislo2,vysledok);
    // Na odsadenie textu 10 znakov zlava sme pouzili  %-10s  +  dalsi argument  rep. prazdny text ktory je reprezentovany ""
    //System.out.printf("%10s %s 2 čísiel %.1f a %.1f je: %.1f%n","", operacia, cislo1, cislo2, vysledok);
    System.out.printf("%s 2 čísiel %.1f a %.1f je: %.1f%n", operacia, cislo1, cislo2, vysledok);
}


    public static void main(String[] args) {

        double cislo1 = 8, cislo2 = 2.5;
       // scitanie(cislo1,cislo2);
        //System.out.println("Sucet 2 cisle je " + scitanie(cislo1, cislo2));
       //System.out.printf("\nSucet 2 cisle %.1f a %.1f je:  %.1f", cislo1, cislo2, scitanie(cislo1, cislo2));


        //System.out.println("Odcitanie 2 cisle je " + odcitanie(cislo1, cislo2));
        //System.out.printf("\nOdcitanie 2 cisle %.1f a %.1f je:  %.1f", cislo1, cislo2, odcitanie(cislo1, cislo2));

        //System.out.println("Nasobenie 2 cisle je " + nasobenie(cislo1, cislo2));
        //System.out.printf("\nNasobenie 2 cisle %.1f a %.1f je:  %.1f", cislo1, cislo2, nasobenie(cislo1, cislo2));

        //System.out.println("Delenie 2 cisle je " + delenie(cislo1, cislo2));
        //System.out.printf("\nDelenie 2 cisle %.1f a %.1f je:  %.1f", cislo1, cislo2, delenie(cislo1, cislo2));

       // System.out.println("Modulo 2 cisle je " + modulo(cislo1, cislo2));
        //System.out.printf("\nModulo 2 cisel /zvysok po deleni/  %.1f a %.1f je:  %.1f", cislo1, cislo2, modulo(cislo1, cislo2));
// vypis vysledkov  matematicky operacii  volanim metody vypis

        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Nasobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Delenie", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo - zvysok po deleni:", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
