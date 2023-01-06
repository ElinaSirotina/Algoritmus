package Introduction_practice;

import java.util.Scanner;

public class Task {




        public static void main(String[] args) {

//            Start
//            get number input: a, b, c
//            declare sum
//            sum=a+b+c
//            print sum
//            End


            Scanner in  = new Scanner(System.in);
            System.out.println("Enter number 1");
            int num1 = in.nextInt();

            System.out.println("Enter number 2");
            int num2 = in.nextInt();

            System.out.println("Enter number 3");
            int num3 = in.nextInt();

            int sum=num1+num2+num3;


            System.out.println(sum+" is the sum of the three integers");
        }

    }

