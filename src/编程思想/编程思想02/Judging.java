package 编程思想.编程思想02;

import java.util.Scanner;

/*
 * 需求
 * 有N名评委打分
 * 选手最终得分：去掉最高分和最低分的
 * 平均分
 */
public class Judging {
    public static void main(String[] args) {
        //1、首先是有几位评委进行一个输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("几位评委？");
        int num = scanner.nextInt();
        double Avg =  finalScores(scores(num));
        if(Avg !=-1) {
            System.out.println("平均分位： " + Avg);
        }//2、至于怎么录入，去掉最高最低，平均分通过方法,由于录入需要通过一个数组进行存储分数
        //也就是说，录入分数是返回一个数组类型
    }
    public static double []scores (int num){
        double []scores = new double[num];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请评委输入分数：  ");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }//分数录入完成后，去掉最高分，去掉最低分，得到的是一个总分
    public static double total(double []scores){
        double max = scores[0];
        double min = scores[0];
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]){
                max = scores[i];
            }
            if(min > scores[i] ){
                min = scores[i];
            }
        }
        return total - max -min;
    }//去掉最高最低分后，取平均分
    public static double finalScores(double []scores){
        double total = total(scores) ;
        double finalTotal = total / (scores.length-2);
        return finalTotal;
    }
}
