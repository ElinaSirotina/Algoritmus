public class Main {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int[] mergedArray = merge(arr1, arr2);
        int k = 7;
        System.out.println(mergedArray[k]);

    }

    public static int stepen(int x, int n) {
        if(n > 0) {
            return x * stepen(x, n - 1);
        } else {
            return 1;
        }
    }

    public static int binpow(int x, int n) {
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return binpow (x, n-1) * x;
        else {
            int b = binpow (x, n/2);
            return b * b;
        }
    }

    public static int[] merge(int[] a, int[] b) {
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



