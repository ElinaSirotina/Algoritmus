package com.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 6, 7, 8};

        // O(n),  n - length of array
        linearSearch(arr, 7);

        // O(log n),  n -length of array
        binarySearch(arr, 7);


    }

    private static int linearSearch(int[] arr, int i) {
        return -1;
    }

    private static int binarySearch(int[] arr, int i) {
        return -1;
    }

    // time complexity O(1)
    // space complexity O(1)
    public static int sum(int one, int two) {
        return one + two;
    }

    // time complexity O(n)
    // space complexity O(1)
    public static void printStars(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("*");
        }
    }

    // time complexity O(n) ~ O(n + n/2) (more detailed analysis)
    // space complexity O(n/2) ~ O(n)
    public static void printStars1(int[] arr) {
        // arr 0,1,2,3,4,5
        String stars[] = new String[arr.length / 2];

        // stars 0,1,2
        // stars[3] -> IndexOutOfBoundException
        for (int i = 1; i < arr.length; i += 2) {
            stars[i / 2] = "*" + i;
        }
        for (int i = 0; i < stars.length; i++) {
            System.out.println(stars[i]);
        }
    }

    // time complexity
    // O(n^2) X
    // O(10 * n) V
    //
    // space complexity
    // O(n) X
    // O(10*n) X
    // O(1) V
    public static void printStars2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("*");
            }
        }
    }

    // time complexity O(n log n)(
    // space complexity

    // 2 ^ 3 = 8, log_2(8) = 3
    // Math.log is natural logarithm, base is number `e`
    public static void printStars3(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < Math.log(arr.length); j++) {
                System.out.println("*");
            }
        }
    }

    // time complexity
    // O (n^3), n - max(numbers.length, stars.length) V
    // O (m + n * m * n) ~ O(n^2 * m + m),  n - numbers.length , m - stars.length  V

    // O(n^2), n - X
    // O(n), n - numbers.length + stars.length X
    // O(n2 + n1 * n2), n1 - numbers.length , n2 stars.length  X
    // O (n1 + n2 ^2) n1 - numbers.length , n2 stars.length X
    public static void printStars4(int[] numbers, String[] stars) {
        int m = stars.length;
        int n = numbers.length;
        for (int i = 0; i < m; i++) { // O(m) 1
            System.out.println("*");
        }

        for (int i = 0; i < m * n; i++) { // O( m * n) 2
            for (int j = 0; j < n; j++) { // O (n) 3
                System.out.println("-");

            }
        }
        // O (m) + O(m * n) * O(n) = O( m + m * n * n )
    }

    public static void printStars5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("+");
        }
    }

    // numbers =[1,2,4,7,9,12,3,-6,1]
    // *********
    // +++++++++
    // 9 = length of array, 18 number operations
    // n = length of array, 2 * n = n + n number of operation

    public static void printStars6(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("*");
            }
        }
    }

    //  numbers =[1,2,4]
    // i = 0
    // i = 0, j = 0 => *
    // i = 0, j = 1 => *
    // i = 0, j = 2 => *
    // i = 0, j = 3 => 3  ( j) < 3 (length of array) false

    // i = 1
    // i = 1, j = 0 => *
    // i = 1, j = 1 => *
    // i = 1, j = 2 => *
    // i = 1, j = 3 => 3  ( j) < 3 (length of array) false

    // i = 2
    // i = 2, j = 0 => *
    // i = 2, j = 1 => *
    // i = 2, j = 2 => *
    // i = 2, j = 3 => 3  ( j) < 3 (length of array) false


    // 3 length of array , 9 = 3^2 operations
    // n length of array , n * n = n^2 operations


    // Find the greater common divisor
    // 48, 12
    // 3 - common divisor, 48 % 3 = 0, 12 % 3 = 0
    // 12 - the greatest common divisor, 48 % 12 = 0, 12 % 12 = 0

    // time complexity O (n) , n - min(a , b)
    // space complexity O(1)
    public static int getGCD(int a, int b) {
        int gcd = 1;
        for (int k = 1; k < Math.min(a, b); k++) {
            if (a % k == 0 && b % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    // assumes a > b
    // time complexity O  faster than O(n) in average
    // space complexity O(1)
    public static int getGCDEuklid(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // a = 48, b = 9
    // 1st iteration
    // a = 48, b = 9, tmp = 3 (48 % 9 = 3 (5 * 9 = 45, 48 -45 = 3))
    // a = 9 (a = b)
    // b = 3 (b = tmp)

    // 2nd iteration
    // a = 9, b = 3, tmp = 0 (9 % 3 = 0)
    // a = 3 (a = b)
    // b = 0 (b = tmp)

    // b != 0 false
    // return a


    // time complexity
    // O(n^2)
    // O(1.5 * n)
    // O(0.25 * n^2)
    // O(0.5 * n^2)
    // space complexity O(1)
    public static void printStars7(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // i = 0, j = 1.. n => n - 1 operations in internal cycle
    // i = 1, j = 2.. n => n - 2
    // i = 2, j = 3.. n => n - 3
    // ....
    // i = n - 2, j = n - 2 + 1..n = n - 1..n  => 1 operation
    // i = n - 1, 0


    // O((n-1) + (n-2) + (n-3) + ... + 1 + 0) - estimate

    // Optional (math magic)
    // (n-1) + (n-2) + (n-3) + ... + 1 + 0 = (n^2 -3n + 2 ) / 2 (arithmetic progression)

    // O (n^2 -3n + 2) ~ O(n^2)


    // time complexity
    // best case O(1)
    // worst case O(n)
    // average case O(n/2) ~ O(n)
    public static int linearSearchExample(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                // best case i == 0
                // average case i = n / 2
                return i;
            }
        }

        // worst case
        return -1;
    }


    // the greatest common divisor
    // input a, b - numbers
    // for each number from 1 to a or b whichever is less compute divisor a or b
    // if both divisors equal to 0 then we have found common divisor

    // O(min(a,b))


    // time complexity best case = average case = worst case = O(n^2)
    // space complexitO(1)
    public static void printStar8(int[] arr) {
        int n = arr.length;
        while (n != 0) { // O(n)
            for (int i = 0; i < n - 1; i++) { // O (n-1)
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }

    // O (n * (n-1)) ~ O (n^2)


}
