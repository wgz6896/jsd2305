package 编程思想.编程思想02;

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
        int num = scanner.nextInt();
        String code = code(num);
        System.out.println(code);
    }
    public static String code(int num){
        String code = "";//用来存储随产生的字符
        //因为需要从一堆字符中随机得到一些字符，则需要一个Random以及数组还有数组的下表，三个变量
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9','你'};
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(62);//得到一个下表
            code += chs[index];//使用字符串拼接符进行拼接字符得到验证码
        }
        return code;
    }
}
