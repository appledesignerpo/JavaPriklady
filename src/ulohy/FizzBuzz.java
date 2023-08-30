package ulohy;

public class FizzBuzz {
    public static void main(String[] args) {
        int rozsah = 100; // Rozsah

        // Cyklus prechadzania cez cisla od 1 do zadaneho rozsahu
        for (int i = 1; i <= rozsah; i++) {
            // Podmienka pre FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Delitelne 3 a 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Delitelne 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Delitelne 5
            } else {
                System.out.println(i); // Alebo
            }
        }
    }
}