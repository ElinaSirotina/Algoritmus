package com.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 6, 8, 11};
        int[] arr2 = new int[]{5, 9, 10, 13, 56, 78, 99, 112};
        int[] result = merge(arr1, arr2);

        System.out.println("Result = " + Arrays.toString(result));


        int[] arr = new int[]{5, 8, 11, 3, 8, 7, 13, 2, 6};
        int[] sorted = mergeSort(arr);
        System.out.println("sorted = " + Arrays.toString(sorted));

        int[] nums = {70, 250, 50, 300, 1};
        System.out.println(getMaxElement(arr, 0));

    }

    // Merge sort pseudocode

    // input - array of integers
    // output - sorted same array

    // if length array < 3 then sort array
    // divide input array
    // for left half and right half do merge sort
    // combine two sorted parts

    // divide
    // [5,8,11,3,8,7,13,2,6]
    // left = [5,8,11,3,6], right = [8,7,13,2]
    // left = [5,8,11], right = [3,6] ; left = [8,7], right = [13,2]
    // left = [5,8], right = [11] ; right = [3,6] ; left = [8,7], right = [13,2]
    // conquer
    // left = [5,8], right = [11]; right [3,6];  left = [8,7], right = [2,13] // [13,2] -> [2,13]
    // combine (merge)
    // have to combine two sorted arrays
    // merge


    // time complexity O(n * log n); O(n) - cycles

    // 1 - array length n
    // 2 - arrays length n/2
    // 4 - arrays length n/4
    // 8

    // n - arrays length 1 or 2

    // 2^x=n => log_2n = x
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else if (arr.length == 2) {
            if (arr[0] <= arr[1]) {
                return arr;
            } else {
                int tmp = arr[0];
                arr[0] = arr[1];
                arr[1] = tmp;
                return arr;
            }
        } // O(1)

        int midIdx = arr.length / 2;

        int[] left = new int[midIdx];
        for (int i = 0; i < midIdx; i++) { // O(n/2) ~ O(n)
            left[i] = arr[i];
        }

        int[] right = new int[arr.length - midIdx];
        for (int i = 0; i < right.length; i++) { // O(n/2) ~ O(n)
            right[i] = arr[i + midIdx];
        }


        int[] leftSorted = mergeSort(left); // recursive call
        int[] rightSorted = mergeSort(right); // recursive call
        int[] sortedResult = merge(leftSorted, rightSorted); // O(n)
        return sortedResult;
    }


    // how to combine two sorted arrays

    // input - arr1 - sorted, arr2 - sorted
    // output -  arr - sorted and has element from arr1 and arr2

    // arr1.length = n
    // arr2.length = m
    // output.length = n + m

    // arr1 = [4,6,8,11], arr2 = [5,9,10,13]
    // result = []

    // if arr1[0] < arr2[0] (4 < 5) then arr1[0] is less than every element in arr2
    // and at the same time is less than every element in arr1 (because  arr1 sorted)
    // result = [ arr1[0] ] ( result = [4])

    // if arr1[1] < arr2[0] (6 < 5) - false else then arr2[0] is less than every element in arr2
    // and is less than every element in arr1 (except for arr1[0])
    // result = [ arr1[0], arr2[0] ] (result = [4,5])

    // if arr1[1] < arr[1] (6 < 9)
    // result = [ arr1[0], arr2[0], arr1[1] ] (result = [4,5,6])

    //  so on

    // (result = [4,5,6,8,9,10,11])
    // copy the rest of arr2

    // arr1 = [4,6], arr2 = [5,9,10,13,17,21,24,56,99]
    // result = []

    // result  = [4]
    // result = [4,5]
    // result = [4,5,6] // no more elements in arr1
    // result = [4,5,6] + [9,10,13,17,21,24,56,99] =[4,5,6,9,10,13,17,21,24,56,99]

    // take minimum from each array and compare them
    // добавить в результат меньший из двух элементов
    // continue from left to right
    // if we moved all elements from one array to result then copy the rest of other array to result


    // time complexity O(n) n - arr1.length + arr2.length
    // space complexity O(n) n - arr1.length + arr2.length
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        // if there are struggles how to start to write a code, one can start literally transcribing
        // pseudocode to java instructions
//        if (arr1[0] <= arr2[0]) {
//            result[0] = arr1[0];
//
        // here we can see than code is becoming inefficient
//            if (arr1[1] <= arr2[0]) {
//                result[1] = arr1[1];
//            }
//            else {
//                result[1] = arr2[0];
//            }
//
//        }
//        else {
//            result[0] = arr2[0];
//
//        }
        int i = 0, j = 0;
        for (; i < n && j < m; ) {
            if (arr1[i] <= arr2[j]) {
                result[i + j] = arr1[i];
                i++;
            } else {
                result[i + j] = arr2[j];
                j++;
            }
        }

        for (int k = i; k < n; k++) {
            result[k + j] = arr1[k];
        }

        for (int k = j; k < m; k++) {
            result[k + i] = arr2[k];
        }

        return result;
    }


    // class work


    // linear search for maximum
    static int getMaxElement(int[] arr) {
        // brute force approach (how we did earlier)
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMaxElementRec(int[] arr) {
        return getMaxElement(arr, 0);
    }

    static int getMaxElement(int[] arr, int index) {
        // divide and conquer approach
        int max;
        int length = arr.length;
        // find max of current (index) element
        // do recursive call to the rest of arr

        // index goes from 0 1, ,2 .. ,length - 1, length
        if (length > index) {
            // search for max in
            max = getMaxElement(arr, index + 1);
            if (arr[index] > max) {
                return arr[index];
            } else {
                return max;
            }
        } else {
            return arr[length - 1]; // arr[index - 1];
        }
    }
    // arr = [4,5,7,2], length = 4
    // getMaxElement(arr, 0), max - unknown, index = 0
    //      getMaxElement(arr, 1) max - unknown, index = 1
    //          getMaxElement(arr, 2) max - unknown , index = 2
    //              getMaxElement(arr, 3) max - unknown,index = 3
    //                  getMaxElement(arr, 4), index = 4
    //                  length > 4 => false
    //                  return 2 (arr[3])
    //              max = 2, arr[3] =2
    //              return 2
    //          max = 2
    //          2 < 7 (7 = arr[2])
    //          return 7
    //      max = 7
    //      7 > 5 (5 = arr[1])
    //      return 7
    // max = 7
    // 7 > 4 ( 4 = arr[0])
    // return 7


    // Quick sort
    // input arr of integers
    // out sorted arr

    // choose base element (how to choose - open question)
    // we can choose always first element, last element, random
    // divide it two parts:
    // in left part all elements which less than base element
    // in right part all elements which greater than base element

    // repeat recursively for each half

    // arr [5,8,11,3,8,7,13,2,6]
    // base element = 6
    // left [5,3,2], right = [8,11,8,7,13] =>  [5,3,2,6,8,11,8,7,13] - base element is in place
    // base 2: left [] right [5,3]; base 13 - left [8,11,8,7] =>   [2,5,3,6,8,11,8,7,13]
    // base 3 [5]; base 7 right [8,11,8] =>  [2,3,5,6,7,8,11,8,13]
    // base 8 right [8,11] =>  [2,3,5,6,7,8,11,8,13]
    // base 11 => [2,3,5,6,7,8,8,11,13]


    // [5,8,11,3,8,7,13,2,6] =>? [5,3,2,6,8,11,8,7,13]
    // i = 0 => [5,8,11,3,8,7,13,2,6]
    // i = 1 => [5,6,11,3,8,7,13,2,8] // not a way
    // i = 2 => [5,6,11,3,8,7,13,2,8] X

    //i = 1 => [5,11,3,8,7,13,2,6,8] X


    // i = 0, j = 0 => j =1 [8,5,11,3,8,7,13,2,6]
    // i = 1, j = 1 => j = 2 [8,11,5,3,8,7,13,2,6]

    public static int[] regrouping(int[] arr) {

        int n = arr.length;
        int base = arr[n -1];
        int j = 0;
        for (int i = j; i < n; i++) {
            if (arr[i] <= base) {
                j++;
                // swap arr[i] and arr[j]
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }


}
