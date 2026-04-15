package task_3;

import java.util.HashMap;

public class Student {
    static int totalNumOfStudents = 0;
    String name; 
    HashMap<String, Double> courseAndGrades = new HashMap<>();

    Student(){totalNumOfStudents++;}

    Student(String stName){
        this.name = stName; 
    }

    Student (String stName, HashMap<String, Double> courseAndGrades){
        this.name = stName; 
        this.courseAndGrades = courseAndGrades;
    }

    void setName(String studentName){
        this.name = studentName;
    }

    void setCourseAndGrades (HashMap<String, Double> coursesAndGrades){
        this.courseAndGrades = coursesAndGrades;
    }

    void totalNumberofStudents (int totalNumberofStudents) {
        this.totalNumOfStudents = totalNumberofStudents;
    }

    String getName(){
        return this.name;
    }

    HashMap<String, Double> getCoursesandGrades (){
        return this.courseAndGrades;
    }

    int getTotalNumberOfStudents (){
        return totalNumOfStudents;
    }

    void printCoursesAndGrades() {
        System.out.println(this.courseAndGrades.toString());

        String[] setOfKeys = new String[this.courseAndGrades.keySet().size()];
        for (String key : setOfKeys){
            System.out.printf("%s, %f\n", key, this.courseAndGrades.get(key));
        }
     }
}