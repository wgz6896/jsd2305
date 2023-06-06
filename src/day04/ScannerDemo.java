package day04;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入数字");
        int age = scanner.nextInt();
        System.out.println(age);
        System.out.println("请用户输入字符");
        char c = scanner.next().charAt(0);
        System.out.println(c);

    }
}
