package ooday05;

public class StaticFinalDemo {
    public static void main(String[] args) {
    double a  = A.PI;
        System.out.println(A.COUNT);
        System.out.println(A.num);
    }
}

class A{
    public static final double PI = 3.1415926,COUNT = 100;
    //常常使用类名.调用,要求声明的同时赋值
//    public static final int COUNT = 5;//常量是编译器编译时，就会将常量直接替换成具体的数，效率高
    //相当于sout（5）
    public static int num = 5;
}