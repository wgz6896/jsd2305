package 编程思想;
//找到2-100之间的所有素数
//首先：你是判断素数还是不判断素数
//判断不是素数的话：除了1和他本身取余都！=0//不行
//判断是素数
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {//
            for (int j = 2; j < 100; j++) {//是直接对全部2-100进行比较，实际上不需要这么麻烦，建议改为j<i
                if(i%j==0){//首先判断他能否能够被整除，如果能就判断是否等于自身，等于就是素数，不等于就不是素数
                    if( i == j){
                        System.out.println("素数： "+ i);
                    }
                    else if(i!=j){
                        break;
                    }
                }
            }
        }
    }
}
