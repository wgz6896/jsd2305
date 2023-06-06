package 编程思想;
/*
* 需求
* 有N名评委打分
* 选手最终得分：去掉最高分和最低分的平均分
 */
import java.util.Scanner;
//giao
//评委给选手打分，去掉最高分和最低分的平均分
//首先评委打分就需要用户进行一个输入，假设是五个裁判，需要5次循环
//进行五次输入打分，通过将分存入数组，在对数组进行比较，得到max和min//也可以不需要数组,但是就需要定义很多新的变量
//问题就在于如何比冒泡发更好的取出最大最小值，没有应该就只有冒泡法比较好，
// 如果是用arr[0]一个一个比较的话，代码更加冗余，比完max，又要用arr[1]一个一个比较min
public class Judging {
    public static void main(String[] args) {
        double []score = arr(5);
        double avg = calAvg(score);
        System.out.println("平均分： "+avg);
    }
    public static double []arr(int num){//只负责录入分数
        Scanner scanner = new Scanner(System.in);
        double []arr = new double[num];
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请评委打分： ");
            arr[i] = scanner.nextDouble();
        }
        return arr;
    }
    public static double calAvg(double []score){
        double total = calTotal(score);
        double avg = total/(score.length-2);
        return avg;
    }
    public static double calTotal(double []arr){
        double total = 0;
        double temp = 0;
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
        return total;
    }

}
