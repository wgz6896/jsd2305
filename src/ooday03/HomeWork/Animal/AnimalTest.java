package ooday03.HomeWork.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("狗", 78, "HONGSE");
        Cat cat = new Cat("猫",23," 阿达");
        Fish fish = new Fish("鱼",83,"huh");
        dog.eat();
        cat.eat();
        fish.eat();
        dog.swim();
        fish.swim();
        dog.lookHome();
        fish.breathe();
        cat.climbTree();
        System.out.println(dog.name+"\t"+ dog.age+"\t");
        System.out.println(cat.name+ cat.age+ cat.color);
    }
}

abstract class Animal {
    String name;
    int age;
    String color;
    Animal (String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    abstract void eat();
    void drink(){
        System.out.println(name+"在喝水");
    }
}

class Dog extends Animal implements Swim{
    Dog(String name,int age,String color){
        super(name, age ,color);
    }
    void eat(){
        System.out.println(name + "再吃骨头");
    }
    public void swim(){
        System.out.println(name +"狗刨");
    }
    void lookHome(){
        System.out.println(name +"看家");
    }
}

class Fish extends Animal implements Swim{
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(name + " 再吃小虾米");
    }
    public void swim(){
        System.out.println(name+"鱼游泳");
    }
    void breathe(){
        System.out.println(name +"水下呼吸");
    }
}

class Cat extends Animal{
    Cat(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(name + "再吃鱼");
    }
    void climbTree(){
        System.out.println(name +"爬树");
    }
}
interface Swim{
    void swim();
}