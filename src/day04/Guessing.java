package day04;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
//        int num = (int) (Math.random() * 1000 + 1);
        Random guess = new Random();
        int num = guess.nextInt(100);
        int num1 ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请用户输入数字： ");
            num1 = scanner.nextInt();
            if (num1 > num) {
                System.out.println("猜大了");
            } else if (num1 < num) {
                System.out.println("菜小了");
            }else{
                System.out.println("duile");
            }
        } while (num != num1);
        int []arr = new int[]{4,5,6};
        int []arr1 = {1,2};
//        System.out.println("caiduile");
//        System.out.println("请用户输入数字");
//        num1 = scanner.nextInt();
//        while (num1 != guess) {
//            if (num1 > guess) {
//                System.out.println("猜大了");
//            } else {
//                System.out.println("菜小了");
//            }
//            num1 = scanner.nextInt();
//        }
//        System.out.println("duile");
    }
}
