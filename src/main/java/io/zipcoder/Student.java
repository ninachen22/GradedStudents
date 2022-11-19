package io.zipcoder;

import java.util.ArrayList;

public class Student {
    public String firstName;
    public String lastName;
    public static ArrayList<Double> examScores;

    public Student(){}
    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getExamScores(ArrayList<Double> examScoresList) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores:");
        for (int i = 0; i < examScoresList.size(); i++) { //maybe format to have no decimals
            sb.append("\n\tExam " + (i+1) + " -> " + examScoresList.get(i)); //the \t tabs!
        }
        return sb.toString();
    }
//    public Double[] getStudentScores(ArrayList<Double> examScores) {
//        Double[] studentScores = new Double[examScores.size()];
//        for (int i = 0; i < examScores.size(); i++) {
//            studentScores[i].equals(examScores.get(i));
//        }
//        return studentScores;
//    }
    public static Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set((examNumber - 1), newScore);
    }

    public static Double getAverageExamScore(ArrayList<Double> examScores) {
        double sumOfScores = 0;
        for (int i = 0; i < examScores.size(); i++) {
            sumOfScores += examScores.get(i);
        }
        return sumOfScores/getNumberOfExamsTaken();
    }
    public String toString(ArrayList<Double> examScores) {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: " + this.firstName);
        sb.append("\n> Average Score: " + getAverageExamScore(examScores));
        sb.append("\n> " + getExamScores(examScores));
        return sb.toString();
    }


}
