package ooday03;
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter a = new InterImpl();
        a.show();
        a.test();
    }
}
abstract class Qo{
    abstract void qq();
}
//class PP extends Qo{
//
//}
interface Inter{//接口中只能包含抽象方法
    abstract void show();
    void test();
}
interface Inter1 extends Inter {
    void say();
}
class OO implements Inter1{
    public void test(){}
    public void say(){}
    public void show(){}
}
class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("giao");
    }
    @Override
    public void test() {
        System.out.println("一gi我滴giaogiao" );
    }
}
class  Boo extends InterImpl implements Inter,Inter1{
    @Override
    public void show() {

    }

    @Override
    public void test() {

    }

    @Override
    public void say() {

    }
}