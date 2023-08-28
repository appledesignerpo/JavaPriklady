package ulohy;

/*   Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.*/
public class ArraySumPriklad {



    public static void main(String[] args) {
        int[] numbers = {52, 10, 15, 20, 25}; // Pole s libovolnými čísly

        int sum = getSum(numbers); // Volání metody getSum() pro sčítání

        System.out.println("Celkový součet hodnot v poli je: " + sum);
    }

    // Metoda pro sčítání hodnot v poli
    public static int getSum(int[] array) {
        int sum = 0; // Inicializace proměnné pro celkový součet

        // Iterace přes pole a sčítání hodnot
        for (int num : array) {
            sum += num; // Přidání aktuální hodnoty k celkovému součtu
        }

        return sum; // Vrácení celkového součtu
    }
}

