package 编程思想.编程思想03;

import javafx.scene.transform.Scale;

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
        //要想得到机票原价，月份，舱位的选择，这里就有三个变量，进行用户的输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请选择舱位： 1、头等舱 2、商务舱 3、经济舱");
        int type = scanner.nextInt();
        double finalPrice = finalPrice(price, month, type);
        if (finalPrice != -1) {
            System.out.println("最终的价格为： " + finalPrice);
        }
    }//对其方法进行封装，你最终需要得到的是价格，返回来类型为double

    public static double finalPrice(/*这里应该对上面传入*/double price, int month, int type) {
        double finalPrice = price;
        //对输入的值进行判断是否有错误的数据
        if (price < 0) {
            System.out.println("价格输入错误");
        }
        if (month > 12 || month < 1) {
            System.out.println("月份输入错误");
        }
        if (type > 3 || type < 1) {
            System.out.println("舱位选择错误");
        }
        switch (type) {
            case 1:
                if (month >= 5 && month <= 10) {
                    finalPrice *= 0.9;
                } else {
                    finalPrice *= 0.7;
                }
                break;
            case 2:
                if (month >= 5 && month <= 10) {
                    finalPrice *= 0.85;
                } else {
                    finalPrice *= 0.65;
                }
                break;
            case 3:
                if (month >= 5 && month <= 10) {
                    finalPrice *= 0.8;
                } else {
                    finalPrice *= 0.6;
                }
        }
        return finalPrice;
    }
}
