package ulohy;

public class FizzBuzz {
    public static void main(String[] args) {
        int rozsah = 100; // rozsah

        for (int i = 1; i <= rozsah; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
