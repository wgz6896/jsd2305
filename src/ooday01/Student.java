package ooday01;
//
public class Student {
    String name ;
    int age ;
    String className;
    String stuId;
    void study(){//这个this是谁调用，其成员变量就代表谁的，，
        //比如外部建一个zs的Student的对象，
        // 对zs的成员变量进行赋值后，其方法中进行调用的成员属性，实际上就是调用了这个类方法中所赋值的内容
        //实际上this即使指本类里面的name，这个name就是外部进行调用的引用对象所赋值的值
        System.out.println(this.name + "在学习");//this是默认存在的
    }

    public Student() {
        System.out.println("oye");
    }

    public Student(String name, int age, String className, String stuId) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", stuId='" + stuId + '\'' +
                '}';
    }

    void sayHi(){
        System.out.println("大家好我叫"+name+"今年"+age);
    }
    void sahh(String className){
        System.out.println("我的班级是"+className);
    }
}
