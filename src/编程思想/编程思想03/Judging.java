package 编程思想.编程思想03;

import java.util.Scanner;

/*
 * 需求
 * 有N名评委打分
 * 选手最终得分：去掉最高分和最低分的
 * 平均分
 */
public class Judging {
    public static void main(String[] args) {
        //首先你需要得到一个随机的评委，Scanner，你需要让评委打分（方法1）
        //去掉最高分最低分（方法2），求平均分（方法3）
        //你不需要知道评委打了多少分，你只需要得到的是平均分
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入评委人数");
        int num = scanner.nextInt();
        double finalScores = avgScore(scores(num));
        System.out.println(finalScores);
    }
    //分数的录入，将他存储进数组中，并且将
    public static double []scores (int num){
        Scanner scanner = new Scanner(System.in);
        double []scores = new double[num];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请评委打分");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }
    //将分数录入好后，进行去掉最高分最低分的操作，最终得到的总分，所以返回类型是double
    public static double finalScores(double []scores){
        double finalScores = 0;
        double max = scores[0];
        double min = scores[0];//将最大值最小值进行存储
        for (int i = 0; i < scores.length; i++) {
            finalScores += scores[i];
        }
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]){
                max = scores[i];
            }
            if(min > scores[i]){
                min = scores[i];
            }
        }
        return finalScores-max -min;
    }
    //去掉最高分，最低分后，求取平均分,也是得到分数，所以返回类型也是double
    public static double avgScore(double []scores){
        //为什么这里使用的是数组类型呢，是由于后面写的时候，发现需要调用数组，
        // 如果在方法中在创建调用数就会很麻烦，或者在形参中加一个数组类型，可以但是也会有点迷惑
        //所以直接形参是一个数组，对数组进行方法2的调用得到总分进行球平均分
        double avgScores = finalScores(scores);
        return avgScores/(scores.length-2);
    }
}
