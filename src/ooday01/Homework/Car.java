package ooday01.Homework;

public class Car {
    String brand;
    String color;
    double price;

    public Car() {

    }

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void start() {
        System.out.println(brand + "牌子的" + color + "的" + price + "块钱的车启动了");
    }

    public void run() {
        System.out.println(brand + "牌子的" + color + "的" + price + "块钱的车开跑了");

    }

    public void stop() {
        System.out.println(brand + "牌子的" + color + "的" + price + "块钱的车停止了");

    }
}
