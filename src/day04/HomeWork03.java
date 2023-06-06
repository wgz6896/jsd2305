package day04;

public class HomeWork03 {
    public static void main(String[] args) {
        int total =0;
        for (int i = 1900; i < 2024; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                total++;
                System.out.println(i);
                if(total == 10){
                    System.out.println();
                }
            }
        }
    }
}
