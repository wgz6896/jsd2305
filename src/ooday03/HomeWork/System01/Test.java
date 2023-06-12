package ooday03.HomeWork.System01;

public class Test {
    public static void main(String[] args) {
        teacher teacher = new teacher("wu");
//        teacher.name;
        manager manager = new manager("liu");
        projectManage projectManage  = new projectManage("ww");
        teacherHead teacherHead = new teacherHead("ee");
        teacher.clockIn();
        teacher.editBooks();
        projectManage.finishWork();
        projectManage.editBooks();
        manager.editBooks();
        manager.clockIn();
        manager.finishProblem();
        teacher.finishProblem();
    }
}

interface solveProblem {
    void finishProblem();

    void trainWorker();
}

interface edit {
    void editBooks();
}

abstract class worker {
    String name;

    worker(String name) {
        this.name = name;
    }

    abstract void finishWork();

    void clockIn() {
        System.out.println(name + " 打卡了");
    }
}

class teacher extends worker implements edit, solveProblem {
    teacher(String name) {
        super(name);
    }

    public void editBooks() {
        System.out.println("老师编辑书籍");
    }

    public void finishProblem() {
        System.out.println("老师解决问题");
    }

    public void trainWorker() {
        System.out.println("老师培训员工");
    }

    void finishWork() {
        System.out.println("教书");
    }
}

class manager extends worker implements edit, solveProblem {
    manager(String name) {
        super(name);
    }

    @Override
    public void finishProblem() {
        System.out.println("经理解决问题");
    }

    @Override
    public void trainWorker() {
        System.out.println("经理培训员工");
    }

    @Override
    public void editBooks() {
        System.out.println("经理编辑书籍");
    }

    @Override
    void clockIn() {
        super.clockIn();
    }

    void finishWork() {
        System.out.println("管理员工");
    }
}

class teacherHead extends worker {
    teacherHead(String name) {
        super(name);
    }

    void finishWork() {
        System.out.println("带领班级");
    }
}

class projectManage extends worker implements edit {
    public projectManage(String name) {
        super(name);
    }

    @Override
    public void editBooks() {
        System.out.println("项目经理编辑书籍");
    }

    @Override
    void finishWork() {
        System.out.println("完成项目");
    }
}