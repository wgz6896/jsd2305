package 编程思想.编程思想02;

import java.util.Scanner;

/*
 * 需求：机票价格按照季节（淡旺季）
 * 舱位（头等舱、商务舱、经济舱）
 * 旺季（5-10月），头等舱9折，商务舱8.5折，经济舱8折
 * 淡季（11-4）头等舱7折，商务舱65折，经济舱6折
 * 如果要得到最后的价格，可以将计算价格的过程封装成一个方法
 * 通过用户进行输入，告知信息
 * */
public class Discount {
    public static void main(String[] args) {
        //需要输入三个量，舱位，月份，机票原价
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入原价");
        double price = scanner.nextDouble();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入舱位类型");
        int type = scanner.nextInt();
        double finalPrice = finalPrice(price,month,type);
        if(finalPrice !=-1){
            System.out.println(finalPrice);
        }
    }
    //然后通过一个方法对着三个不同的变量进行判断,最后得到的是一个最终的价格

    public static double finalPrice(double price, int month, int type) {
        //如果传入数据不正确需要进行一个判断
        if (price < 0) {
            System.out.println("输入价格错误");
            return -1;//就是用来区分你有没有输入错误的值
        }
        if (month > 12 || month < 1) {
            System.out.println("输入月份错误");
            return -1;

        }
        if (type < 1 || type > 3) {
            System.out.println("输入舱位错误");
            return -1;

        }//这次按月份分
        switch (month) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if (type == 1) {
                    price *= 0.9;
                } else if (type == 2) {
                    price *= 0.85;
                } else if (type == 3) {
                    price *= 0.8;
                }
                break;
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                if (type == 1) {
                    price *= 0.7;
                } else if (type == 2) {
                    price *= 0.75;
                } else if (type == 3) {
                    price *= 0.6;
                }
        }
        return price;
    }
}
