package ooday05;

class StaticBlock {
    String name;
    int age;
    public StaticBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
       String className = "jsd2305";
        System.out.println("班级为"+className);
    }
}
