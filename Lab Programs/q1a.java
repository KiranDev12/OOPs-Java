/*
    1. a) Generate prime numbers for the given range.
    Name of the program: _1aPrime.java
 */

/*STEPS:
 * Run a loop inclusive of a and b
 * 0 and 1 arent prime numbers
 * Check divisibility from 2 onwards until i
 */
public class q1a {
    public static void main(String[] args) {

        int lower = 1, upper = 20;

        for (int i = lower; i <= upper; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int n) {

        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;

        // checking the number of divisors b/w 1 and the number n
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        // if reached here then must be true
        return true;
    }
}