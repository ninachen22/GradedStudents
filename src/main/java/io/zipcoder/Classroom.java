package io.zipcoder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class Classroom {
    Student student = new Student();
    static Student[] students;
//    public int compareScore(Student s1, Student s2) {
//        if (s1.getAverageExamScore() == s2.getAverageExamScore()) {
//            return 0;
//        } else if (s1.getAverageExamScore() > s2.getAverageExamScore()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//    public int compareName(Student s1, Student s2) {
//        return s1.firstName.compareTo(s2.firstName);
//    }
static Comparator<Student> scoreComparator = Comparator.comparing(Student::getAverageExamScore);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getFirstName);

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
    public Student[] getStudentByScore() {
        Arrays.sort(students, nameComparator);
        Arrays.sort(students, scoreComparator);
        return students;
    }
    public static HashMap getGradeBook() {
        Arrays.sort(students, nameComparator);
        String grade = "";
        HashMap<Student, String> gradeBook = new HashMap<>();
        for (Student s : students) {
            grade = gradingCurveLetterGrade(s.getAverageExamScore());
            gradeBook.put(s, grade);
        }
        return gradeBook;
    }
    public static String gradingCurveLetterGrade(double studentScore) {
        Arrays.sort(students, scoreComparator);
        double lowScore = students[students.length].getAverageExamScore();
        double scoreRange = students[0].getAverageExamScore() - students[students.length].getAverageExamScore();
        double A = scoreRange * 0.9 + lowScore;
        double B = scoreRange * 0.71 + lowScore;
        double C = scoreRange * 0.5 + lowScore;
        double D = scoreRange * 0.11 + lowScore;
        double F = lowScore;
        if (studentScore >= A) {
            return "A";
        } if (studentScore >= B && studentScore < A) {
            return "B";
        } if (studentScore >= C && studentScore < B) {
            return "C";
        } if (studentScore >= D && studentScore < C) {
            return "D";
        } else {
            return "F";
        }
    }

}
