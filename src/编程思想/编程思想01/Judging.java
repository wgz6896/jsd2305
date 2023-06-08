package 编程思想.编程思想01;

import java.util.Scanner;

/*
 * 需求
 * 有N名评委打分
 * 选手最终得分：去掉最高分和最低分的
 * 平均分
 */
public class Judging {
    public static void main(String[] args) {
        //方法中需要输入评委人数则，需要Scanner
       double []score = score(5);
       double total = restScore(score);
        System.out.println(totalAvg(total,score));

    }//将三个过程用不同的方法封装，实现不同的功能
    //第一个方法是对其打分，有N位则分数不能只有一个，那就返回一个数组，数组存储分数
    public static double []score(int num/*表示几位评委*/){
        double []score = new double[num];
        //评委打分也需要进行输入，
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请评委打分： ");
            score[i] = scanner.nextDouble();
        }
        return score;//得到了一个都是分数的数组，接着要去掉最高分和最低分,得到的一个总分
    }
    public static double restScore(double []score){//既然要找出max就需要在一开始定义一个max对数组进行判断
        double total = 0;
        double max = score[0];
        double min = score[0];
        for (int i = 0; i < score.length; i++) {
            total +=score[i];
        }
        for (int i = 0; i < score.length; i++) {

            if(max > score[i]){
                max = score[i];
            }
            if(min<score[i]){
                min = score[i];
            }
        }
        return (total-max-min);//这里应该返回一个去掉了最高分和最低分的总分，那么就已开始需要将上一步录分的总分得到，则需要调用上一个方法
    }
    //如今得到了总分就进行平均分计算
    public static double totalAvg(double total,double []score){//如果把平均分单独放可能会更好，更加清楚
        // 这里自己加入了total的形参，不如直接在方法中调用上面求total的方法，更加便捷，相对来说
        total /= score.length-2;
        return total;
    }
}
