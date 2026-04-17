package task_3;

import java.rmi.StubNotFoundException;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("John");
        student2.setName("Emily");

        System.out.println("TESTING CONSTRUCTORS, GETTERES, AND SETTERS");

        System.out.println(student1.getName());
        System.out.println(student2.getName());

        HashMap<String, Double> coursesNGradesJohn = new HashMap<>();
        HashMap<String, Double> coursesNGradesEmily = new HashMap<>();

        coursesNGradesJohn.put("English", 89.5);
        coursesNGradesJohn.put("Math", 91.2);

        coursesNGradesEmily.put("English", 78.9);
        coursesNGradesEmily.put("Math", 94.5);

        student1.setcoursesNGrades(coursesNGradesJohn);
        student2.setcoursesNGrades(coursesNGradesEmily);

        System.out.println(student1.getCoursesNGrades());
        System.out.println(student2.getCoursesNGrades());

        System.out.println(student1.getGrade("English"));

        System.out.println();
        System.out.println();

        System.out.println("TESTING COURSESNGRADES PRINT FUNCTION");

        student1.printCoursesNGrades();
        student2.printCoursesNGrades();

        System.out.println();

        System.out.println("TESTING GPA FUNCTION");
        System.out.println(student1.getGPA());
        System.out.println(student2.getGPA());
    }
}
