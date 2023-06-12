package ooday02.Exercise04;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Student("wu",78,"458460");
        people[1] = new Teacher("hu",42,"45525");
        people[2] = new Person("shabui",748);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    String stuId;

    public Student(String name, int age, String stuId) {
        super(name, age);
        this.stuId = stuId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                '}';
    }
}

class Teacher extends Person {
    private String salary;

    public Teacher(String name, int age, String salary) {
        super(name, age);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}