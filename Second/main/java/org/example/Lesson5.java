package org.example;

public class Lesson5 {
    public static void main(String[] args) {
        Student student = new Student("Rudik", "Anton", 31);
        System.out.println(student.getAge());
        Student.str = "Animal";
        String str = "Ryd";
        student.print();
      //  Student student1 = new Student("Ivanov", "Ivan", 33);
      //  student1.print();
       // Student student2 = new Student("Tarasov", "Taras", 33, 123431);
      //  student2.print();



        /////encapsulation/////

        System.out.println(student.getAge());
        int msstudentage = student.getAge();

        Cat cat = new Cat(1, "brown", "true", 'm', new Eyes("Blue", 2, true, 2));



    }
}