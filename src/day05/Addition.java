package day05;

import java.util.Random;
import java.util.Scanner;

//随即加法运算器
//答对一题加十分，答错一题不加分
public class Addition {
    public static void main(String[] args) {
        int total = 0;
        int score = 0;
        for (int i = 1; i <=10; i++) {
            Random random = new Random();
            //int num1 = (int)(Math.random()*100);
            //int num2 = (int)(Math.random()*100);
            Scanner scanner = new Scanner(System.in);
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            total = num1 + num2;
            System.out.println("("+i+")请计算： "+num1 +"+"+ num2 + "=?");
            System.out.println("请用户输入答案");
            int admin = scanner.nextInt();
            if(admin == total){
                System.out.println("恭喜你回答正确，加10分");
                score += 10;
            }else{
                System.out.println("不好意思回答错误，不加分");
            }
        }
        System.out.println("用户的总分为： "+score);
    }
}
