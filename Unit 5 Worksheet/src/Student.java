import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private String studentGrade;
    private ArrayList<Double> grades;

    public void constructName(String studentName) {
    String name = studentName;
    }

    public void constructGrade(String studentGrade) {
        String grade = studentGrade;
    }

    public boolean passingOrFailing (ArrayList grades) {
        int total =0;
        for (int i = 0; i < grades.size() - 1; i ++) {

            total += grades.indexOf(i);
        }
        int average = total/grades.size();
        if (average > 65) {
            return true;
        } else {
            return false;
        }
    }

    public int numberOfClasses() {
        int classes = 0;
        for (int i = 0; i < grades.size(); i++) {
            classes++;
        }
        return classes;
    }

    public String returnName (String studentName) {
        return studentName;
    }

    public int returnGrade (ArrayList grades) {
        int total =0;
        for (int i = 0; i < grades.size() - 1; i ++) {

            total += grades.indexOf(i);
        }
        int average = total/grades.size();
        return average;
    }

    //if i need to declare outside the parameters i'll do so here
    public void addToTheGrades (ArrayList grades, int newGrade) {
        grades.add(0, newGrade);
    }

    public String nameAndGrade(String studentName, int average) {
        return (studentName + average);
    }

    //here is the end of the methods and stuff










}
