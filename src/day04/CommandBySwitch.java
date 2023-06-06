package day04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择功能：1、存款 2.取款 3.查询余额 4.退卡");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("存款");
                break;
            case 2:
                System.out.println("取款");
                break;
            case 3:
                System.out.println("查询余额");
                break;
            case 4:
                System.out.println("退卡");
                break;
            default:
                System.out.println("error");
        }
    }
}
