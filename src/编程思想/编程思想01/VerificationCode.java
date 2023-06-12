package 编程思想.编程思想01;

import java.util.Random;

//生成N位验证码（大写字母、小写字母、数字）
//训练目标：数组+方法+随机数
//首先验证码是随机位数，那么可以用户进行一个输入也可以直接定好是4为或者8为，这里就定为数组的元素个数有几个
//调用一个字符串类型的数组 ，去对验证码进行拿取，怎么拿？
//由于没学String类型，对于随机产生的一个字符，在方法中拿一个String类型的进行拼接
//这些验证码，所以就需要一个数组进行存储，里面有数字，有英文，有大小写，那应该使用一个字符或者字符穿变量进行存储
//通常可以采用字符类型，也可以采用字符串类型，就直接使用字符串的数组String 【】arr
//这个过程比较麻烦，可以通过是调用方法进行处理
public class VerificationCode {
    public static void main(String[] args) {
        System.out.println(codd(4));
    }
    public static String codd(int num){//num表示的是，取几位验证码
        //调用一个字符串类型的数组 ，去对验证码进行拿取，怎么拿
        String code = "";//存一个空值，让随机下表的char进行传值
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
                '3', '4', '5', '6', '7', '8', '9','你'};
        Random random = new Random();//
        int index ;//拿一个数存储随机得到的下表，传给char
        for (int i = 0; i < num; i++) {//为什么范围是整个chs？
            //因为决定验证码个数是由外部输入的
            index = random.nextInt(chs.length);
            code += chs[index];
        }
        return code;
    }
}
//最关键的地方就在与，在方法中保留了一个String code进行对chs数组的拼接

