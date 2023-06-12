package ooday03;

public class Array {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("j",23,"e");
        dogs[2] = new Dog("eh ",12,"ww ");
        dogs[1] = new Dog("es",4,"feha");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].name+dogs[i].color);
        }
        int []arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
}
