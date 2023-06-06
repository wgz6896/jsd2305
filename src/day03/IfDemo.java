package day03;
public class IfDemo {
    public static void main(String[] args) {
        double price = 600;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println("最终的消费金额为： " + price);
    }
}
