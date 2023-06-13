package ooday04;

import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

public class Test {
    public static void main(String[] args) {
       /* Dog dog = new Dog("wih", 48, "rw");
        ee dog1 = new Dog("RF",4,"34F");
        dog1.swim();
        Animal dog2= new Dog("5",1,"4");
        System.out.println(dog.name);*/
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("65",2,"s");
        //左边编译类型为Animal（这是在创建数组时候确定的）
        animals[1] = new Dog("ee",12,"d");
        animals[2] = new Fish("h",65,"jde");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Dog){
                Dog dog = (Dog)animals[i];
                dog.lookHome();
                dog.swim();
            }
            if(animals[i] instanceof Fish){
                Fish fish = (Fish)animals[i];
                fish.swim();
                fish.eat();
            }
        }
        animals[0].eat();
        Animal dog = new Dog("e", 12, "e");
        ee a = (ee)dog;
        Dog o  =(Dog) dog;
        Master master = new Master();
        master.feed(dog);
        master.feed(animals[1]);
        master.feed(animals[2]);
    }
}
