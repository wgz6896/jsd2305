package ooday03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("小白", 78, "红色");
        dog.eat();
        dog.lookHome();
        Cat cat = new Cat("小花", 45, "白色");
        cat.layEggs();
        cat.eat();
        dog.swim();
        Fish fish = new Fish("h", 45, "ee");
        fish.swim();
        ArrayList<Dog> dogs = new ArrayList<>();
    }
}
