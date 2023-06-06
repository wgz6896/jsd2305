package 编程思想;

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
//        double price1 = 800;
//        double price2 = 700;
//        double price3 = 600;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请用户分别输入机票月份、舱位");
//        int month = scanner.nextInt();
//        String ship = scanner.next();
//        switch (month){
//            case 5:
//            case 6:
//            case 7:
//                if(ship.equals("头等舱")) {
//                    System.out.println("选择头等舱，在旺季打9折后为： " + price1 * 0.9);
//                }else if(ship.equals("商务舱")){
//                    System.out.println("选择商务舱，在旺季打85折后为：  "+price2*0.85);
//                }else if(ship.equals("经济舱")){
//                    System.out.println("选择经济舱，在旺季打85折后为：  "+price3*0.8);
//                }
//                break;
//            case 11:
//            case 12:
//            case 1:
//                System.out.println("打五折后为： "+price1*0.5);
//                break;
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = scanner.nextDouble();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请选择舱位：1、头等舱 2、商务舱 3、经济舱");
        int type = scanner.nextInt();
        double finalPrice = work(price, month, type);
        if (finalPrice != -1) {
            System.out.println("最终价格为：  " + finalPrice);
        }

    }

    public static double work(double price, int month, int type) {
        double finalPrice = price;
        boolean loop = true;
        //先做错误的情况
        if (price < 0) {
            System.out.println("机票原价输入错误");
            return -1;
        }
        if (month < 1 || month > 12) {
            System.out.println("月份输入错误");
            return -1;
        }
        if (type > 3 || type < 1) {
            System.out.println("舱位输入错误");
            return -1;
        } else {
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
                    break;
            }
        }
        return finalPrice;
    }
}
