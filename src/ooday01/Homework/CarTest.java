package ooday01.Homework;

import ooday01.Homework.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 =  new Car("奥迪","红色",1000);
        Car car2 =  new Car("开拓者","白色",5000);
        Car car3 =  new Car("玛莎拉蒂","黑红色",2000);
        car1.run();
        car2.start();
        car3.stop();
    }
}
