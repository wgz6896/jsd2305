package ooday01.Homework;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("liu",18,'男');
        student.sayHello();
    }
}
class Student{
    String name;
    int age  ;
    char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void sayHello(){
        System.out.println("大家好我是"+name+"我今年"+age+"岁，是一个"+gender+"生");
    }
}