package ooday03.HomeWork.System;

abstract public class worker {
    String name;
    int age;
    double salary;
    public worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void clockIn(){
        System.out.println(name+"上班打卡了");
    }
    void clockOut(){
        System.out.println(name + "下班打卡了");
    }
    abstract void finishWork();
}
