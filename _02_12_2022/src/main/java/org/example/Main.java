package org.example;

class Algoritm {
    public static void main(String[] args) {
//        int[] ar = new int[50];
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = i + 1;
//        }
//        for (int n : ar) {
//            int result = test5(n);
//            System.out.println("n = " + n + " | " + result);
//            float j = n;
//            System.out.println("____________________");
//        }
//        System.out.println(method(2,2));
//        System.out.println(method(1,200));
//        System.out.println(method(200,1));
//        System.out.println(method(200,0));
//        System.out.println(method(200,100));
//        System.out.println(method(200,150));
//        System.out.println(method(50, 200));
//        System.out.println(method(100,200));
//        System.out.println(method(150,149));

//        int[] array5 = {1};
//        int[] array1 = {1, 1, 8};
//        int[] array4 = {1, 8, 8};
//        int[] array2 = {1, 1, 2, 6, 6};
//        int[] array = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 8};
//        int[] array11 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9};
//        int[] array12 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10};
//        int[] array13 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10};
//        int[] array14 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17};
//        int[] array15 = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16};

//        System.out.println(findOne(array5) + " " + (findOne(array5) == 1));
//        System.out.println(findOne(array1) + " " + (findOne(array1) == 8));
//        System.out.println(findOne(array4) + " " + (findOne(array4) == 1));
//        System.out.println(findOne(array2) + " " + (findOne(array2) == 2));
//        System.out.println(findOne(array) + " " + (findOne(array) == 4));
//        System.out.println(findOne(array11) + " " + (findOne(array11) == 9));
//        System.out.println(findOne(array12) + " " + (findOne(array12) == 10));
//        System.out.println(findOne(array13) + " " + (findOne(array13) == 9));
//        System.out.println(findOne(array14) + " " + (findOne(array14) == 17));
//        System.out.println(findOne(array15) + " " + (findOne(array15) == 1));

//        System.out.println(test5(array5) + " " + (test5(array5) == 1));
//        System.out.println(test5(array1) + " " + (test5(array1) == 8));
//        System.out.println(test5(array4) + " " + (test5(array4) == 1));
//        System.out.println(test5(array2) + " " + (test5(array2) == 2));
//        System.out.println(test5(array) + " " + (test5(array) == 4));
//        System.out.println(test5(array11) + " " + (test5(array11) == 9));
//        System.out.println(test5(array12) + " " + (test5(array12) == 10));
//        System.out.println(test5(array13) + " " + (test5(array13) == 9));
//        System.out.println(test5(array14) + " " + (test5(array14) == 17));
//        System.out.println(test5(array15) + " " + (test5(array15) == 17));
//        for (int i = 0; i < 20; i++) {
//            System.out.println("n = " + i + " | " + method3(i));
//        }
    }

    //    First level: 1) Вычислить сложность следующих алгоритмов

    // Best - O(1)
    // Worst - O(n*2)
    static int test1(int n) {
        int count = 0;
        if (n == 1) return count;
        for (int i = 1; i <= n; i++) {
            count++;
            for (int j = 1; j <= n; j++) {
//                System.out.println("*");
                count++;
                break;
            }
        }
        return count;
    }

    // Best - O(1)
    // Worst - O(n * (n + 1))
    static int test2(int n) {
        int count = 0;
        if (n == 1) return count;
        for (int i = 1; i <= n; i++) {
            count++;
            for (int j = 1; j <= n; j++) {
                count++;
//                System.out.println("*");
            }
        }
        return count;
    }

    // Best - O(1)
    // Worst - O(n * (2 + (0.5  + ... + 0.5)n))
    static int test3(int n) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            count++;
            for (int j = n; j > i; j--) {
                a = a + i + j;
                count++;
            }
        }
        return count;
    }

    // Best - O(n*2)
    //Worst - O((n-1 - 1 - 1 ... -1)n * (n-1)*3)
    static int test4(int n) {
        int inCycle = 0;
        int inInCycle = 0;
        int i, j, a = 0;
        for (i = n / 2; i <= n; i++) {
            inCycle++;
            for (j = 2; j <= n; j = j * 2) {
                a = a + n / 2;
                inInCycle++;
            }
        }
        System.out.println("f = " + inCycle);
        System.out.println("s = " + inInCycle);
        return inCycle + inInCycle;
    }


    //2) Find the element that appears once in a sorted array
//    Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
//    Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент.


    // Best - O(1)
    // Worst - O(n-2)
    static int findOne(int[] array) {
        int result = 0;
        int count = 0;
        if (array.length == 1) {
            count++;
//            System.out.println("IF Count = " + count + " length " + array.length);
            return array[0];
        } else if (array.length == 3) {
            count++;
//            System.out.println("ELSE IF Count = " + count + " length " + array.length);
            return (array[1] != array[0]) ? array[0] : array[2];
        }
        for (int i = 1; i < array.length - 1; i += 1) {
            count++;
            if (array[i] != array[i - 1] && array[i] != array[i + 1]) {
//                System.out.println("FOR LOOP Count = " + count + " length " + array.length);
                return array[i];
            }
        }
//        System.out.println("END OF ARRAY Count = " + count + " length " + array.length);
        return (array[0] != array[1]) ? array[0] : array[array.length-1];
    }


    //    Задачки со звёздочкой - вычислить сложность в лучшем и худшем случае.
    // Best = O(logn)
    // Worst = O(n)
    static int test5(int n) {
        int count = 0;
        int a = 0, i = n;
        while (i > 0) {
//            a += i;
            i /= 2;
            count++;
        }
        return count;
    }

    // Best O(1)
    // Worst O(infinitive)
    static int method(int a, int b) {
        int count = 0;
        while (a != b) {
            count++;
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return count;
    }

    // Best - O(1)
    // Worst - O(n*2 + 1)
    static int method2(int n) {
        int count = 0;
        for (int i = 0; i < n / 2; i++) { // O(n/2)
            count++;
            for (int j = 1; j + n / 2 <= n; j++) { // O(1 + n/2)
                count++;
                for (int k = 1; k <= n; k = k * 2) { // n/2
                    count++;
//                    System.out.println("I am expert!");
                }
            }
        }
        return count;
    }

    // Best - O(1)
    // Worst - O(n * n+1)
    static int method3(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) { // O(n)
            count++;
            for (int j = 1; j <= n; j = j + i) { // O(n+1)
                count++;
//                System.out.println("I am expert!");
            }
        }
        return count;
    }
}