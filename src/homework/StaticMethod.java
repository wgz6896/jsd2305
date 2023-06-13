package homework;

public class StaticMethod {
    int a ;
    static int b;
    void say(){
        System.out.println(a);
    }
    static int plus(int num1,int num2){
        return num1+num2;
    }
    void show(){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(StaticMethod.b);
    }
    static void test(){
        System.out.println(StaticMethod.b);
    }
}
