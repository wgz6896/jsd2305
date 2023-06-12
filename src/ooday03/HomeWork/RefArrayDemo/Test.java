package ooday03.HomeWork.RefArrayDemo;

public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        Cat[] cats = new Cat[2];
        dogs[0] = new Dog("小狗1",4);
        dogs[1] = new Dog("小狗2",5);
        cats[0] = new Cat("猫咪1",2);
        cats[1] = new Cat("猫咪2",3);
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].eat();
            System.out.println(dogs[i].name+"\t"+dogs[i].age);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat();
            System.out.println(cats[i].name);
        }
    }
}

abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void eat() {
        System.out.println("吃骨头");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void eat() {
        System.out.println(name + "吃鱼");
    }

}