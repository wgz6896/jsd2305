package day03;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("请用户输入年份：  ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("非闰年");
        }
    }
}
