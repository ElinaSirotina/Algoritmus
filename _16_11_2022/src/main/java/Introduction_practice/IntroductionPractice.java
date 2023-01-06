package Introduction_practice;

import java.io.OptionalDataException;

public class IntroductionPractice {
    private static OptionalDataException array;

    public static void main(String[] args) {

        int[] array = new int[] {
                1,23,4,5,6,7};
                int number = 5;

        int[] arr = new int[0];
        int result =searchNumber(arr, number);
                printResult(result);
        }

    private static void printResult(int result) {
        if (result==-1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number of index = " +result);
        }
    }
    
    private static int searchNumber(int[] arr, int number) {
    

        for (int i = 0; i < array.length; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
           return  -1;
        }
    }

