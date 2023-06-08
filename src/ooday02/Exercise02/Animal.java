package ooday02.Exercise02;

class Animal {
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void eat(){
        System.out.println(color + "色的"+age+"岁的"+name+"正在吃东西");
    }
    void drink(){
        System.out.println(color + "色的"+age+"岁的"+name+"正在喝东西");
    }
}
class Chicken extends Animal{
    String address;
    Chicken(String name ,int age,String color){
        super(name,age ,color);
    }
    @Override
    void eat(){
        System.out.println(color );
    }
}
class Dog extends Animal{
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    void lookHome(){
        System.out.println(color+"的狗狗在看家");
    }

    @Override
    void eat() {
        System.out.println(color+"的狗狗在吃饭");
    }
}
class Fish extends Animal{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }
}
class Cat extends Animal{
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    void layEggs(){
        System.out.println(color+"的小鸡在下蛋");
    }

    @Override
    void eat() {
        System.out.println(color+"的小鸡在吃饭");
    }
}