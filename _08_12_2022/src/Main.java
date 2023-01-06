public class Main {
    public static Object main(String[] args) {
        //Даны два целых числа x и n, напишите функцию для вычисления x^n
        //решение 1 - рекурсивно O(n)
        //решение 2 - улучшить решение 1 до O(log n)
        //1)
        public static int stepen(int x,int n){
            if (n > 0) {
                return x * stepen(x, n - 1);
            } else {
                return 1;
            }
        }
        //2)
        public static int binpow (int x, int n){
            if (n == 0)
                return 1;
            if (n % 2 == 1) {
                int i = binpow(x, n - 1) * x;
                return i;
            } else {
                int b = binpow(x, n / 2);
                return b * b;
            }
        }
        ---------------------------------------
        //Имеем два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
        // который будет находиться на k-й позиции в конечном отсортированном массиве.
        // Массив 1 - 100 112 256 349 770
        //Массив 2 - 72 86 113 119 265 445 892
        //к = 7
        //Вывод : 256
        //Окончательный отсортированный массив -
        // 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
        //7-й элемент этого массива равен 256.

        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int[] mergedArray = merge(arr1, arr2);
        int k = 7;
        System.out.println(mergedArray[k]);


        (int[] a,int[] b){
            int[] result = new int[a.length + b.length];
            int aIndex = 0;
            int bIndex = 0;
            int i = 0;

            while (i < result.length) {
                result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
                if (aIndex == a.length) {
                    System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                    break;
                }
                if (bIndex == b.length) {
                    System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                    break;
                }
                i++;
            }
            return result;
        }

    }

    private static int[] merge(int[] arr1, int[] arr2) {
        return new int[0];
    }

    private static int binpow(int x, int i) {

        return x;
    }

    private static int stepen(int x, int i) {
        return 0;
    }
}