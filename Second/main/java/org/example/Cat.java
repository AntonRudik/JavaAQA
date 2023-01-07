package org.example;

public class Cat {
    public static final String str="Animal";
    private int age;
    private String color;
    private String stiril;
    private char sex;
    public Eyes eyes;

    public Cat(int age, String color, String stiril, char sex, Eyes eyes) {
        this.age = age;
        this.color = color;
        this.stiril = stiril;
        this.sex = sex;
        this.eyes = eyes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStiril(String stiril) {
        this.stiril = stiril;
    }

    public int getAge() {
        return age;
    }
}
