package test;

import static java.lang.Integer.sum;

public class TestCase {
    public static void main(String[] args) {
        int sumNumber = sum(1,4);
        if (sumNumber != 5) {
            System.err.println("Test failed");

        } else {
            System.err.println("Passed");
        }
    }
}
