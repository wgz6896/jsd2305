package ooday05.enum_;

public class EnumTest {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        Season []seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        Season s1 = Season.WINTER;
    }
}
