package p166;

import java.util.Scanner;

public class Student {
    String name;
    String gender;
    int age;


    public Student(String name, String gender, int age) {

        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drink() {
        System.out.println(name + "同学喜欢喝可乐");
    }

    public void eat() {
        System.out.println(name + "b2同学喜欢吃牛肉");
    }

    protected void play() {
        System.out.println(name + "b3同学喜欢打篮球");
    }

    public void sleep() {
        System.out.println(name + "同学要睡觉了");
    }

    public String toString() {
        return name + "同学的" + "性别是" + gender + "年龄是" + age;
    }


}