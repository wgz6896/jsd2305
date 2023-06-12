package ooday03.HomeWork.System;

public class headTeacher extends worker {
    public headTeacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.println("带班");
    }

    @Override
    public String toString() {
        return "班主任"
                + name + '\'' +
                ", 年龄为： " + age +
                ", 薪水为： " + salary +
                '}';
    }
}
