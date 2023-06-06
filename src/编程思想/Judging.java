package 编程思想;

import java.util.Scanner;

//评委给选手打分，去掉最高分和最低分的平均分
//首先评委打分就需要用户进行一个输入，假设是五个裁判，需要5次循环
//进行五次输入打分，通过将分存入数组，在对数组进行比较，得到max和min//也可以不需要数组,但是就需要定义很多新的变量
//问题就在于如何比冒泡发更好的取出最大最小值，没有应该就只有冒泡法比较好，
// 如果是用arr[0]一个一个比较的话，代码更加冗余，比完max，又要用arr[1]一个一个比较min
public class Judging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] arr = new double[5];
        double temp = 0;
        double total = 0;
//        double max = 0;
        int times = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请评委打分： ");
            arr[i] = scanner.nextDouble();
            times++;
        }
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i]>arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == 0||i ==arr.length-1){
                continue;
            }else {
                 total += arr[i];
            }
        }
        System.out.println("评委打出的平均分是：  "+total/times);
    }
}
