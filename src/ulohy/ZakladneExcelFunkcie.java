package ulohy;
/*
Úloha č. 1: Úloha na základné Excel funkcie.
        Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        */
public class ZakladneExcelFunkcie {

    public static double scitaj(double cisla[]) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum;
    }

    public static void main(String[] args) {
        double [] cisla = {10.5, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami
        System.out.println("Výsledok sčítania hodnôt v poli je: " + scitaj(cisla));
    }
}
