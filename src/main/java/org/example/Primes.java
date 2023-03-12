package org.example;

public class Primes {
    public static void main(String[] args) {
        System.out.print("1 2");
        for (byte i = 3; i < 101; i+=2)
            if (isPrime(i))
                System.out.print(" " + i);
        System.out.println();
    }
    private static boolean isPrime(byte num) {
        byte stop = (byte) (Math.sqrt(num) + 1);
        for (byte i = 3; i < stop; i+=2)
            if (num % i == 0)
                return false;
        return true;
    }

}
