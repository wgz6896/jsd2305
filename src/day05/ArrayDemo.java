package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int)(Math.random()*100+1);
            System.out.println(arr[i]);
        }
    }
}
