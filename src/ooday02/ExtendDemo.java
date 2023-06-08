package ooday02;

public class ExtendDemo {
    public static void main(String[] args) {
        Student student = new Student("wu", 18, '男', "454654");
        student.eat();
//        Teacher teacher = new Teacher("liu", 28, '女', "4555");
//        teacher.eat();
//        student.study();
//        teacher.teach();
//        student.sleep();
        student.say();
    }
}

class Person {
    String name;
    int age;
    char gender;
    public Person() {
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void eat(){
        System.out.println();
    }
    void sleep(){
        System.out.println(name+"正在睡觉");
    }
}
class Student extends Person {
    String stuId;
    public Student(String name, int age, char gender, String stuId) {
        super(name, age, gender);
//        this(Student);
        this.stuId = stuId;
    }
    void say(){
        System.out.println(stuId);
    }
    void study(){
        System.out.println("学生在学习");
    }
}
class Teacher extends Person{
    String salary;
    public Teacher(String name, int age, char gender, String salary) {
        super(name, age, gender);
    }
    @Override
    void eat() {
        System.out.println("老师在吃饭");
    }
    void teach(){
        System.out.println("老师在教书");

    }
}