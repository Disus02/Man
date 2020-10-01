package ru.sapteh;

public class Program {
    public static void main(String[] args) {
Student student= new Student("Ivan",18,"Мужской",60,1);
        System.out.println(student.toString());
        student.nextYear();
        System.out.println(student.toString());
        student.nextYear();
        System.out.println(student.toString());

    }
}
