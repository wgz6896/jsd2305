package 编程思想;

//打印99乘法表
//1、首先你要得到1*1=1.是选择对列循环输出还是对行进行循环输出
//2、选择按列输出，因为第一列全部数都是相同的，可以通过循环嵌套得到
//3、当打印2的乘法表的时候，需要进行换列，如何实现(该方法不行，因为java中无法实现按列输出只能进行换行输出\n，所以需要进行换行)
//4、那么空掉的哪一格怎么输出呢？
//5、找规律，也就i，j相同的时候进行换行
public class ChengFaBiao {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {//这里输出行
            for (int j = 1; j <= i; j++) {//这里输出列
                System.out.print(j + "*" + i + "=" + (i * j)+"\t");
//                if (i == j) {
//                    System.out.println();
//                }
            }
            System.out.println();

        }
    }
}
