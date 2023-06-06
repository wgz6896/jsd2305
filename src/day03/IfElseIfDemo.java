package day03;

public class IfElseIfDemo {
    public static void main(String[] args) {
        double price = 1400;
        if (price >= 2000) {
            price *= 0.5;
        } else if (price >= 1000) {
            price *= 0.7;
        } else if (price >= 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
    }
}
