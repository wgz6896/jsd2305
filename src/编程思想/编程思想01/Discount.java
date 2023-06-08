package 编程思想.编程思想01;

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
        //第一步，输入月份、舱位、机票原价
        //第一种先对舱位的选择进行一个switch的判断
        //既然需要对用户的请求进行判断就需要Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价 ");
        double price = scanner.nextDouble();
        System.out.println("请用户输入月份");
        int month = scanner.nextInt();
        System.out.println("请用户输入乘坐的舱位类型：1、头等舱 2、商务舱 3、经济舱");
        int type = scanner.nextInt();
        double finalPrice = finalPrice(price, month, type);//由于这里应该是灵活使用的一个price不能定死，就应该在前面有一个scanner进行传值
        if (finalPrice != -1) {
            System.out.println("机票的原来价格为：  " + price + "打完折的价格为：  " + finalPrice);
        } else {
            System.out.println("输入有误，正在退出系统...");
        }
    }

    public static double finalPrice(double price, int month, int type) {//同时对月份，原价，舱位进行一个选择判断
        double finalPrice = price;
        if (price < 0) {
            System.out.println("输入价格有误");
            return -1;//你需要对这些错误的输入进行一个区分，可以使用一个flag直接判断，但是不如直接return进行返回-1
        }
        if (month > 12 || month < 1) {
            System.out.println("时间输入有误");
            return -1;
        }
        if (type > 3 || type < 1) {
            System.out.println("舱位选择有误");
            return -1;
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
