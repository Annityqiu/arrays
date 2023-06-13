package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Define an array of car brands
        String[] carBrands = {"Toyota", "BMW", "Mercedes-Benz", "Ford", "Honda"};

        // Print the number of items in the carBrands array
        System.out.println("Number of items in carBrands: " + carBrands.length);

        // Print the 3rd item of the carBrands array
        System.out.println("Third item of carBrands: " + carBrands[2]);

        // Declare an empty array of integers called primeNumbers with a size of 6 items
        int[] primeNumbers = new int[6];

        // Populate the primeNumbers array with the first 6 prime numbers
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        // Print the content of the primeNumbers array
        System.out.println("Content of primeNumbers array:");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }
    }
}