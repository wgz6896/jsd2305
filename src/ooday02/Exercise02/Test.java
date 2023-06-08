package ooday02.Exercise02;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("小白", 78, "红色");
        dog.eat();
        dog.lookHome();
        Cat cat = new Cat("小花", 45, "白色");
        cat.layEggs();
        cat.eat();
    }
}
