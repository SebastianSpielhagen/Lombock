package org.spielhagen;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Sebastian");
        student1.setNname("Sp.");
        student1.setAddress("Bochum");
        student1.setAge(50);
        student1.setGrade(10);

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Siqi");
        student2.setNname("Z.");
        student2.setAddress("Gelsenkirchen");
        student2.setAge(28);
        student2.setGrade(9);

        Student student3 = new Student();
        student3.setId(2);
        student3.setName("Ivan");
        student3.setNname("C.");
        student3.setAge(38);
        student3.setAddress("Köln");
        student3.setGrade(9);

       Teacher teacher = new Teacher ();
         teacher.setId(1);
            teacher.setName("Coach Dominic");
            teacher.setSubject("Java");


        Course course = new Course();
        course.setId(1);
        course.setName("Java Kurs - ffm-java-23-2 - neue fische GmbH");
        course.setTeacher(teacher);
        course.setStudents(List.of(student1, student2, student3));

        System.out.println("--------------------------");
        System.out.println("Name des Kurses: " + course.getName());
        System.out.println("Raum: Kugelfisch 4");
        System.out.println("--------------------------");
        System.out.println("Name des Coaches: " + course.getTeacher().getName());
        System.out.println("--------------------------");
        System.out.println("Wieviele Schüler: " + course.getStudents().size());
        System.out.println("--------------------------");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}