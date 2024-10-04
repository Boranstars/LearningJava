package com.test.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------欢迎来到黑马学生管理系统----------------");

        while (true) {
            System.out.print("""
                    1：添加学生
                    2：删除学生
                    3：修改学生
                    4：查询学生
                    5：退出
                    请输入您的选择:
                                                                                            
                    """);
            switch (sc.nextInt()) {
                case 1:
                    addStudent(studentArrayList);
                    break;
                case 2:
                    deleteStudent(studentArrayList);
                    break;
                case 3:
                    modifyStudent(studentArrayList);
                    break;
                case 4:
                    queryStudent(studentArrayList);
                    break;
                case 5:
                    System.out.println("退出系统");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> studentArrayList) {
        System.out.println("添加学生");
        Scanner _sc = new Scanner(System.in);

        System.out.println("请输入学生id：");
        String _id = _sc.next();


        if (contains(studentArrayList, _id)) {
            System.out.println("学生已经存在，无法添加，可以修改");
            return;
        }


        // 运行到这里说明学生不存在，可以添加
        System.out.println("请输入学生姓名：");
        String _name = _sc.next();

        System.out.println("请输入学生年龄：");
        int _age = _sc.nextInt();

        System.out.println("请输入学生地址：");
        String _address = _sc.next();

        Student _st = new Student(_id, _name, _age, _address);
        studentArrayList.add(_st);
    }

    public static boolean contains(ArrayList<Student> studentArrayList, String _id) {
        for (Student student : studentArrayList) {
            if (student.getId().equals(_id)) {

                return true;
            }
        }
        return false;
    }

    public static void deleteStudent(ArrayList<Student> studentArrayList) {
        System.out.println("删除学生");
        if (studentArrayList.isEmpty()) {
            System.out.println("未添加任何学生，无法删除");
            return;
        }

        System.out.println("请输入要删除的学生id");
        Scanner _sc = new Scanner(System.in);
        String idToDelete = _sc.next();
        boolean deleteSuccess = false;
        for (Student student : studentArrayList) {
            if (student.getId().equals(idToDelete)) {
                deleteSuccess = studentArrayList.remove(student);
                break;
            }

        }
        if (!deleteSuccess) {
            System.out.printf("删除失败! %s 不是已经储存的学生id\n", idToDelete);
        } else {
            System.out.printf("学生%s 删除成功，\n", idToDelete);
        }
    }

    public static void modifyStudent(ArrayList<Student> studentArrayList) {
        System.out.println("修改学生");
        if (studentArrayList.isEmpty()) {
            System.out.println("未添加任何学生，无法修改");
            return;
        }
        System.out.println("请输入要修改的学生id");
        Scanner _sc = new Scanner(System.in);
        String idToModify = _sc.next();
        boolean modifySuccess = false;
        for (Student student : studentArrayList) {
            if (student.getId().equals(idToModify)) {
                System.out.println("请依次输入需要修改的信息，为空则不修改");
                System.out.println("请输入学生姓名：");
                String newName = _sc.next();
                student.setName(newName.isEmpty() ? student.getName() : newName);
                System.out.println("请输入学生年龄：");
                int newAge = _sc.nextInt();
                student.setAge(newAge == 0 ? student.getAge() : newAge);
                System.out.println("请输入学生地址：");
                String newAddress = _sc.next();
                student.setAddress(newAddress.isEmpty() ? student.getAddress() : newAddress);
                System.out.println("修改成功");
                modifySuccess = true;
                break;

            }
        }
        if (!modifySuccess) {
            System.out.printf("修改失败! %s 不是已经储存的学生id\n", idToModify);
        }

    }

    public static void queryStudent(ArrayList<Student> studentArrayList) {
        System.out.println("查询学生");
        if (studentArrayList.isEmpty()) {
            System.out.println("未添加任何学生，无法查询");
            return;
        }
        System.out.println("id\t\t\t姓名\t\t年龄\t\t家庭住址");
        for (Student student : studentArrayList) {
            System.out.println(student.toString());
        }
    }
}
