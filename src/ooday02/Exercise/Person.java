package ooday02.Exercise;

public class Person {
    String name;
    int age;
    String address;
//
//    Person() {
//    }
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void say(){
        System.out.println(name+ "  " + age + "  " + address);
    }
}
class Student extends Person {
    public Student(String name, int age, String address) {
        super(name, age, address);
    }
    void sss(){
        System.out.println(name + age +address);

    }

    @Override
    void say() {
        System.out.println("giao");
    }
}