package ooday02.Exercise03;

public class Exercise {
    public static void main(String[] args) {

    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sayHello(){
        System.out.println("我叫" + name + "我今年"+age);
    }
}
class Student extends Person{
    String className;
    Student(String name,int age){
        super(name, age);
        this.name = name;
        this.age =age;
    }
}