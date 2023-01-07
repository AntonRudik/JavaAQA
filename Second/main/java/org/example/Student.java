package org.example;

public class Student {
    int n = 444;
    private String famile;
    private String name;
    private int age = 28;
    private int level;
    private int id;
    static public String str = "Human";

    public int getAge() {
        return age;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void modifyLevel(int mark){
        if((level<10)&&(level>0)) {

        }

    }

    public Student(String famile, String name, int age) {
        int id;
        this.famile = famile;
        this.name = name;
        this.age =validate(age);
        this.id = (int)(Math.random()*100);
        this.level = 0;
    }

    private int validate(int age) {
        int result = 16;
        if ((age>15)&&(age<65)) {
            return age;
        }
        return 16;
    }

    public Student(String famile, String name, int age, int id) {
        this.famile = famile;
        this.name = name;
        this.age = age;
        this.id = id;
        this.level = 0;
    }

    public Student(){
        System.out.println("constructor");
        this.famile = "Antonov";
        this.name = "Abtin";
        this.age = 25;
        this.id = 55555555;
        this.level = 100;
    };

    public void print(){
        System.out.println("FAMILY "+this.famile);
        System.out.println("NAME "+this.name);
        System.out.println("AGE"+ this.age);
        System.out.println("ID "+this.id);
        System.out.println(str);
    }
}
