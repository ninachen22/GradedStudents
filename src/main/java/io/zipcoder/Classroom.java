package io.zipcoder;

public class Classroom {
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
//    public Double getAverageExamScore(Student[] averageStudentScores) {
//        double sumOfAverages = 0;
//        for (int i = 0; i < averageStudentScores.length; i++) {
//            sumOfAverages += students[i].getStudentScores();
//            //sumOfAverages += Student.getAverageExamScore(students[i]);
//        }
//        return sumOfAverages/students.length;
//    }

}
