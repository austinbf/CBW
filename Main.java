package p166;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Student[] students = new Student[4];

    public static void main(String[] args) {
        students[0] = new Student("cbw", "nan", 17);
        students[1] = new Student("ccc", "nan", 18);
        System.out.println("------------------下面的操作有-----------------");
        System.out.println("------------------1.通过名字查询---------------");
        System.out.println("------------------2.通过性别查询---------------");
        System.out.println("------------------请输入你需要的操作------------");
        switch (in.nextInt()) {
            case 1 -> {
                System.out.println("请输入想要查询的名字");
                searchByName();
            }
            case 2 -> {
                System.out.println("请输入想要查询的性别");
                searchByGender();
            }
            default -> System.out.println("没有该操作");
        }
    }

    public static void searchByName() {
        int k = 0;
        String name = in.next();
        for (int i = 0; i < students.length; i++) {

            if (students[i].getName().equals(name) || students[i].getGender().equals(name)) {
                System.out.println(students[i].getName());
                System.out.println(students[i].getGender());
                System.out.println(students[i].getAge());
                k++;
            }
            if (k == 0) {
                System.out.println("没有该对象");
            }

        }
    }

    public static void searchByGender() {
        int k = 0;
        String Gender = in.next();
        for (int i = 0; i < students.length; i++) {

            if (students[i].getName().equals(Gender) || students[i].getGender().equals(Gender)) {
                System.out.println(students[i].getName());
                System.out.println(students[i].getGender());
                System.out.println(students[i].getAge());
                k++;
            }
            if (k == 0) {
                System.out.println("没有该对象");
            }

        }
    }
}