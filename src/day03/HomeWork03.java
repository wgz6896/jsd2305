package day03;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println("请用户输入分数");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        } else if (score < 60) {
            System.out.println("D");
        } else {
            System.out.println("不合法");
        }
    }
}
