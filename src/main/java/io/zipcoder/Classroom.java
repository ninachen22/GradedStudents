package io.zipcoder;

public class Classroom {
    Student student = new Student();
    Student[] students;

    public Classroom() {
        this.students = new Student[30];
    }
    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] students) {
        this.students = students;
    }
    public Object getStudents() {
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

}
