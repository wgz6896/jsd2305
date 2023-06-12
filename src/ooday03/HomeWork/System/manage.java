package ooday03.HomeWork.System;

public class manage extends worker implements solveProblem,edit{
    public manage(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.println("管理员工");
    }

    public void finishProblem(){
        System.out.println(name+"解决企业问题");
    }

    @Override
    public void trainWorker() {
        System.out.println(name+"培训员工");
    }

    @Override
    public void editBooks() {
        System.out.println(name+"整理书籍");
    }
}
