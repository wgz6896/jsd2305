package 编程思想;

import java.util.Random;

//生成N位验证码（大写字母、小写字母、数字）
//训练目标：数组+方法+随机数
public class VerificationCode {
    public static void main(String[] args) {
//       String code = generateVeriCode(4);
//        System.out.println("验证码:  "+code);
        String code = generateVeriCode(8);
        System.out.println(code);
//        System.out.println("=======");
//        int []arr = {1,2,3,4};
//        System.out.println(arr.length);
    }//如果需要使用char【】数组类型，就改为String

    public static String generateVeriCode(int num) {
        String code = "";
        Random random = new Random();
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9','你'};
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(chs.length);//0-62
            code += chs[index];//用字符串与字符进行拼接
        }
//        System.out.println(chs.length);
        return code;
    }
}
