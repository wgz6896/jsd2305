package day05;

import java.util.Arrays;
//import java.util.Arrays;
public class MaxOfArray {
    public static void main(String[] args) {
      int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("=========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}