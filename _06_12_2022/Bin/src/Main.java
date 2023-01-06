import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0]=5;
        array[1] = 7;
        array[2] = 10;
        array[3] = 12;
        array[4] = 14;
        array[5] = 16;
        array[6] = 19;
        array[7] = 20;
        array[8] = 22;
        array[9] = 25;

        int left = 0;
        int right = array.length-1;
        int index = 0;
        int res = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска");
        int q = scanner.nextInt();

        while (left<=right){
            index = (right+left)/2;
            if(array[index]==q){
                res = index;
                break;
            }
            if(array[index]<q){
                left = index+1;
            }
            else{
                right = index-1;
            }
        }
        if(res != -1){
            System.out.println("Индекс элемента равен" + res);
        }
        else{
            System.out.println("Такого элемента нет в массиве");
        }

    }
}