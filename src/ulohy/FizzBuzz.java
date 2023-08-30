package ulohy;

public class FizzBuzz {
    public static void main(String[] args) {
        int rozsah = 100; // Rozsah

        // Cyklus prechádzania cez čísla od 1 do zadaného rozsahu
        for (int i = 1; i <= rozsah; i++) {
            // Podmienka pre FizzBuzz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); // Ak je číslo deliteľné 3 a 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz"); // Ak je číslo deliteľné 3
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // Ak je číslo deliteľné 5
            } else {
                System.out.println(i); // Inak, vypíšeme samotné číslo
            }
        }
    }
}