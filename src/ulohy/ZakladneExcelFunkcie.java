package ulohy;

public class ZakladneExcelFunkcie {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 15, 28, 35}; // Pole  cisla

        int sum = 0;

        // Scitanie v poli
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Celkový súčet hodnot v poli je: " + sum);

    }
}
