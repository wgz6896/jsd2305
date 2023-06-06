package day04;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("请用户输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num >0){
            System.out.println("+");
        }else if(num < 0){
            System.out.println("-");
        }else
            System.out.println("0");
    }
}
