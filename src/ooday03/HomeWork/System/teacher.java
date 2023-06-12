package ooday03.HomeWork.System;

public class teacher extends worker implements solveProblem,edit {
    public teacher(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void finishWork() {
        System.out.println("教书");
    }

    public void finishProblem() {
        System.out.println(name + "解决企业问题");
    }

    @Override
    public void trainWorker() {
        System.out.println(name + "培训员工");
    }

    @Override
    public void editBooks() {
        System.out.println(name + "整理书籍");
    }
}
