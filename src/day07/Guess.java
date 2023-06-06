package day07;
import java.util.Random;
import java.util.Scanner;
/*
*需求：猜数字小游戏
* 训练目标：while（true）自造死循环+break
*/
public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1000)+1;//0-999,要变成1-1000则需要加一
        System.out.println(num);
        while(true){
            System.out.println("猜吧");
            int guess = scanner.nextInt();
            if(guess >  num){
                System.out.println("大了");
            }else if(guess < num ){
                System.out.println("小了");
            }else if(guess == num){
                System.out.println("猜对了");
                break;
            }
        }
    }
}
