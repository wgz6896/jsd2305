package ooday03.HomeWork.System;

public class projectManage extends worker implements edit{
    public projectManage(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.println("完成项目");
    }

    public void editBooks(){
        System.out.println(name +"整理书籍");
    }
}
