package ulohy;
/*
Úloha č. 1: Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        */
public class ZakladneExcelFunkcie {

    public static void main(String[] args) {
        double [] cisla = {10, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami

        double sum = scitaj(cisla);
        System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);

        double priemer = priemeruj(cisla);
        System.out.println("Výsledok priemerovania hodnôt v poli je: " + priemer);

        double priemerEfektivne = priemerujEfektivne(cisla);
        System.out.println("Výsledok EFEKTIVNÉHO priemerovania hodnôt v poli je: " + priemerEfektivne);

        // vytvor metodu s nazvom pocet na ziskanie poctu vstupnych hodnot pola*
        int pocetHodnot = pocet(cisla);
        System.out.println("Počet hodnôt v poli je: " + pocetHodnot);

        //Vytvor metodu s nazvom max na ziskanie najvyssej hodnoty **
        double maxHodnota = max(cisla);
        System.out.println("Najväčšia hodnota v poli je: " + maxHodnota);

        // Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty ***
        double minHodnota = min(cisla);
        System.out.println("Najnižšia hodnota v poli je: " + minHodnota);
    }

    // Metoda na scitanie hodnot v poli
    private static double scitaj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum;
    }

    // Metoda na priemerovanie hodnot v poli
    private static double priemeruj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum / cisla.length;
    }

    // Metoda na efektivne priemerovanie hodnot v poli
    private static double priemerujEfektivne(double[] cisla) {
        return scitaj(cisla) / cisla.length;
    }

    //vytvor metodu s nazvom pocet na ziskanie poctu vstupnych hodnot pola*
    private static int pocet(double[] cisla) {
        return cisla.length;
    }


    //Vytvor metodu s nazvom max na ziskanie najvyssej hodnoty **
    private static double max(double[] cisla) {
        double max = cisla[0]; // Predpokladáme, že prvý prvok je zároveň najväčší
        for (int i = 1; i < cisla.length; i++) {
            if (cisla[i] > max) {
                max = cisla[i]; // Aktualizácia najväčšej hodnoty, ak je nájdený väčší prvok
            }
        }
        return max;
    }

   // Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty ***
    private static double min(double[] cisla) {
        double min = cisla[0]; // Predpokladáme, že prvý prvok je zároveň najnižší
        for (int i = 1; i < cisla.length; i++) {
            if (cisla[i] < min) {
                min = cisla[i]; // Aktualizácia najnižšej hodnoty, ak je nájdený menší prvok
            }
        }
        return min;
    }


    // TODO Vytvor metodu s nazvom pocet na zistenie poctu vstupnych hodnot (pola)*
    // TODO Vytvor metodu s nazvom max na ziskanie najvyssej hodnoty **
    // TODO Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty ***


}