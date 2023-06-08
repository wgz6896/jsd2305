package 编程思想.编程思想03;

import java.util.Random;
import java.util.Scanner;

//生成N位验证码（大写字母、小写字母、数字）
//训练目标：数组+方法+
//1、得到一个N位验证码，从一堆字符中取，可以通过建立一个随机下表进行选择数组
//那么如何得到几位呢？Scanner
//2、然后将这位数传入方法中，由方法完成验证码取，只需要main接受一个String的变量
public class VerificationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("几位验证码");
        int num = scanner.nextInt();
        String code = code(num);
        System.out.println(code);
    }
    public static String code(int num){
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9','你'};
        //来一个下表进行存储随机数，用来取chs的字符
        int index = 0;
        //再来一个字符串返回给main
        String code = "";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            index = random.nextInt(62);
            code += chs[index];
        }
        return code;
    }
}