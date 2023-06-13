package homework;

public class StaticBlock {
    static {
        System.out.println("静态块");
    }
    StaticBlock(){
        System.out.println("构造方法");
    }
}
