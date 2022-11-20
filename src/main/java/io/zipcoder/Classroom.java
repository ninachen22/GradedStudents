package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    Student student = new Student();
    Student[] students;
    public int compare(Student s1, Student s2) {
        if (s1.getAverageExamScore() == s2.getAverageExamScore()) {
            return 0;
        } else if (s1.getAverageExamScore() > s2.getAverageExamScore()) {
            return 1;
        } else {
            return -1;
        }
    }
    //Comparator<Student> scoreComparator = Comparator.compare(student, student);

    public Classroom() {
        this.students = new Student[30];
    }
    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }
    public Double getAverageExamScore() {
        double sumOfAverages = 0;
        for (int i = 0; i < students.length; i++) {
            sumOfAverages += Student.getAverageExamScore(students[i].examScores);
        }
        return sumOfAverages/students.length;
    }
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            students[i] = student;
        }
    }
    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (student.firstName == firstName && student.lastName == lastName) {
                students[i] = null;
                //for (students[i] =< ) //want for every s at i and after to shift left
            }
        }
    }
    public void getStudentByScore() {
        Arrays.sort(students);
    }
    public void getGradeBook() {

    }

}
