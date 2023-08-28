package ulohy;

/*   Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.*/
public class ArraySumPriklad {
    public static void main(String[] args) {
        int[] numbers = {55, 1045, 1554, 24540, 25454}; // Pole s cislom

        int sum = getSum(numbers); // Zavolanie  metody getSum() pre scitanie

        System.out.println("Celkový sucet hodnot v poli je: " + sum);
    }

    // Metoda pre scitanie hodnot v poli
    public static int getSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

