package day04;

public class WhileDemo {
    public static void main(String[] args) {
        int num = 1;
        while (num< 4){
            System.out.println("执行第"+num+"次");
            num++;
        }
        //num =1 ，num<4,sout（执行第一次）num++
        //num = 2，num <4,sout(执行第二次) num++
        //num = 3,num <4,sout（执行第三次）num++
        //num = 4 ,num = 4,不满足条件，sout不执行，也就是只输出三次

    }
}
