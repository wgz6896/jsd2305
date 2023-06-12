package ooday03;

abstract class Animal {
    String name;
    int age;
    String color;
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    abstract void eat();
    void drink() {
        System.out.println(color + "色的" + age + "岁的" + name + "正在喝东西");
    }
}
class Chicken extends Animal {
    String address;

    Chicken(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color);
    }
}
class Dog extends Animal implements ee {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    public void swim(){
        System.out.println(name+"小狗会游泳");
    }
    void lookHome() {
        System.out.println(color + "的狗狗在看家");
    }
    @Override
    void eat() {
        System.out.println(color + "的狗狗在吃饭");
    }

}

class Fish extends Animal implements ee{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }
    public void swim(){
        System.out.println("小鱼会游泳");
    }
    void eat() {
        System.out.println("老默，我想吃鱼了");
    }
}

class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    void layEggs() {
        System.out.println(color + "的小鸡在下蛋");
    }

    @Override
    void eat() {
        System.out.println(color + "的小鸡在吃饭");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}