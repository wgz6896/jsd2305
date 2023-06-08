package 编程思想.编程思想01;
//首先你要得到2-100的素数，就需要分辨出什么是素数
//不能被除了自身以外的整除的就不是素数，那么就需要取余计算，那么就需要进行两个数的取余
//因此你需要有两个数进行取余，则就是两个for,但是你要输出素数，要分辨是不是素数，那就使用一个flag进行区分
public class PrimeNumber {
    public static void main(String[] args) {
//        boolean flag = true;
//        for (int i = 2; i <101 ; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {//判断是否能小于且能被整除，能的话就停止循环，进入外层循环
//                if(i%j == 0){
//                    flag = false;//对是否为素数进行区分
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("素数为：  " + i);
//            }
//        }
        //也可以这么写
        //先对这些 数能否被 整除进行一个判断，在接着判断是否这个数＝本身
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < 101; j++) {
                if(i%j==0){
                    if(i==j ){
                        System.out.println("素数为：  "+i);
                    }else if(i!=j){
                        break;
                    }
                }
            }
        }
    }
}
