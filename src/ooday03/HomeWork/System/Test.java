package ooday03.HomeWork.System;

public class Test {
    public static void main(String[] args) {
        teacher liuxi = new teacher("刘喜老师", 30,10000);
        manage qijie = new manage("琦姐", 31, 50000);
        projectManage wu = new projectManage("wu", 18, 15645);
        headTeacher zhangxu= new headTeacher("张旭", 45, 45845);
        liuxi.finishProblem();
        wu.editBooks();
        qijie.trainWorker();
        System.out.println(zhangxu);
    }
}
