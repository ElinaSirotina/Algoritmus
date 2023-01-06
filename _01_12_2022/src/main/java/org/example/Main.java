package org.example;

public class Main {
    public static void main(String[] args) {
        printNumbers2 (5);

    }

    private static void printNumbers2(int i) {
    }

    void method2(int n) {

        for (int i = 0; i < n / 2; i++) {
            for (int j = 1; j + n / 2 <= n; j++) { // 0(n)
                for (int k = 1; k <= n; k = k * 2) {
                    System.out.println("I am expert");
                }
            }
        }

    }

    // best case a=b 0(1)
// worst 0(n)
// a,b> 0
    void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    void printNumbers(int n) {
        if (n < 0) return;

        System.out.println(n + " ");
        printNumbers(n - 1);
    }

    void printNumbersIteration(int n) {
        for (int i = n; i>=0; i--) {
            System.out.println(n+" ");
        }
    }
}
// 0(n*n*log(n))

// third for
// i=0, j=1, k=1
// i=0, j=1, k=2
// i=0,j=1, k=4
// i=0, j=1, k=8=2*2*2=2^3
// i=0, j=1, k=16


 // second for
// i=0, j=1, 1+n/2
// i=0, j=2, 2+n/2
// i=0, j=n/2, n/2+n/2
//...
// i=0, j=n/2, n/2+n/2=2

// j + n/2 ==n, j=n/2


// Recursion




