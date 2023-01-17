package Ball;

public class Ball {
    public static void main(String[] args) {
        System.out.println(ball(13));
        System.out.println(ballmemo(13));

    }
    private static int ball(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        return ball(n - 1) +  ball(n - 2) +  ball(n - 3);
    }
    static int[] arrBall = new int[100];
    private static int ballmemo(int n){
        arrBall[0] = 0;
        arrBall[1] = 1;
        arrBall[2] = 2;
        arrBall[3] = 4;

        arrBall[n] = ball(n - 1) +  ball(n - 2) +  ball(n - 3);
//        for(int i =0;i<arrBall.length;i++){
//            System.out.print(arrBall[i]);
//        }
        return arrBall[n];
    }
}
