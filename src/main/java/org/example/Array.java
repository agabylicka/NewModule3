package org.example;

public class Array {
    public int sumArray(int[] numbers) {
        int sum = 0;

        for ( int i = 0; i < numbers.length; i++) {
            sum+= i;
        }
        return sum;
    }
}
