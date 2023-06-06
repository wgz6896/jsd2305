package day04;

import java.util.Scanner;

//2. 接收用户输入的年份year和月份month，计算该年该月的天数，并输出
//首先需求是求出该月的天数，那么就分为平年和闰年的二月，月有份大月小月，这些都要区分
//首先完成用户输入的年份与月份需要Scanner
//你需要判断这个年份是否为闰/平，需要一个变量进行存储，loop
//先对平闰年判断好，然后在进行月份，如果判断了是闰年就进入下一个月份，需要用到switch，对平闰进行分开（其实不一定，也可以直接通过if）
//如果是平年
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入年份");
        int year = scanner.nextInt();//接受年份
        System.out.println("请用户输入月份");
        int month = scanner.nextInt();//接受月份
        int loop = 1;//如果是闰年就改为2，不是不变
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }break;
            default:
                System.out.println("error");

        }
//        if((year%4==0&&year%100!=0)||year %400==0){
//            loop = 2;
//        }
//        switch(loop){
//            case 1://平年，又要分大小月跟二月
//                if(month == 2 ){
//                    System.out.println("该"+year+"为平年"+month+"月"+"有28天");
//                }else if(month == 1||month==3||month == 5||month==7||month==8||month == 10||month==12){
//                    //这种情况肯定是用switch最好，然后二月的差别，再在case中进行划分平闰年
//                    System.out.println("该"+year+"为平年"+month+"月"+"有31天");
//                }else {
//                    System.out.println("该"+year+"为平年"+month+"月"+"有30天");
//                }
//            case 2://闰年
//        }
    }
}
