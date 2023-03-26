import java.util.Arrays;

public class Main {
    public static boolean findPairWithSum(int[] arr, int X) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == X) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 50, 75, 80};
        System.out.println(findPairWithSum(arr, 70)); // true
        System.out.println(findPairWithSum(arr, 55)); // true
        System.out.println(findPairWithSum(arr, 1000)); // false
    }
}