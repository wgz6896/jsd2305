package homework;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();
        System.out.println(StaticVar.b);
        StaticBlock staticBlock = new StaticBlock();
        StaticMethod.test();
    }
}
