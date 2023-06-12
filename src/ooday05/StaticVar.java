package ooday05;

public class StaticVar {
    int a ;
    static int b;
    StaticVar(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+"\t"+b);
    }
}
