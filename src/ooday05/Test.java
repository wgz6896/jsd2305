package ooday05;

import sun.security.timestamp.TSRequest;

public class Test {
    public static void main(String[] args) {
//        StaticBlock staticBlock1 = new StaticBlock("liu",18);
//        StaticBlock staticBlock2 = new StaticBlock("wu", 11);
//        System.out.println(staticBlock1.name+ staticBlock1.age);
//        System.out.println(staticBlock2.name+ staticBlock2.age);
//        Test test = new Test();
//        test.say();
//        M.say();
        System.out.println(M.a);
    }
}
class  M{
    static int a = 10;
    int b = 100;
   void say(){
        System.out.println(M.a+b);
        //因为普通方法中，默认有一个this.b+M.a所以可以直接使用
    }
    static void show (){
        System.out.println(a);
//        System.out.println(b);
    }
}