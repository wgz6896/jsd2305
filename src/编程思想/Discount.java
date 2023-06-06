package 编程思想;

import java.util.Scanner;

//淡旺季机票打折，假设旺季打8折，淡季打5折，所以得先有一个价格price
//涉及月份应该使用switch
public class Discount {
    public static void main(String[] args) {
        double price = 800;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入机票月份");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("打8折后为： "+price*0.8);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("打五折后为： "+price*0.5);
        }
    }
}
