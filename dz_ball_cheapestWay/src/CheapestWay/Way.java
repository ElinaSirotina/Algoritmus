package CheapestWay;

public class Way {
    public static void main(String[] args) {
        System.out.println(way(6,6));
        System.out.println(wayMemo(6,6));
    }
    static private int way(int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return way(n - 1, m) + way(n, m - 1);
    }
    static long[][] arrWay = new long[100][100];
    static private long wayMemo(int n, int m){
        if(n == 1 || m == 1) return 1;
        arrWay[n][m] = wayMemo(n - 1, m) + wayMemo(n, m - 1);
        return arrWay[n][m];
    }
}
