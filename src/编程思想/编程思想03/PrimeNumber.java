package 编程思想.编程思想03;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("素数为：  "+i);
            }
        }
    }
}
