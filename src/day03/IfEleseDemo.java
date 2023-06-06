package day03;

public class IfEleseDemo {
    public static void main(String[] args) {
        double price =600;
        if(price>500){
            price *= 0.8;
        }else{
            price *= 0.9;
        }
        System.out.println(price);
    }
}
