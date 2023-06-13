package ooday05;

public class StaticMethod {
    int a ;
    static int b;
    void show(){//有隐式this传递,就代表有对象
        System.out.println(a);
        System.out.println(b);
    }
    static void test(){//没有隐式this传递，就代表没有对象

//        System.out.println(a);
        System.out.println(b);
    }
}
class O extends StaticBlock{
    public O(String name, int age) {
        super(name, age);
    }
}