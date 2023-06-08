package 编程思想.编程思想02;
//首先素数，是不能被自身以外的整除，那么如果被整除且不是本身，则不是素数，不需要输出
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < 101; j++) {
                if(i%j==0){
                    if(i==j){
                        System.out.println("素数： "+i);
                    }else {
                        break;//如果不当i！=j时候就退出的话，会导致，迟早i=j，这样就不存在素数判断了
                    }
                }
            }
        }
    }
}
