package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);
        // When
        String output = student.getExamScores(examScores);
        // Then
        System.out.println(output);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        // When
        student.addExamScore(100.0);
        String output = student.getExamScores(examScores);
        // Then
        System.out.println(output);
    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0));
        Student student = new Student(firstName, lastName, examScores);
        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores(examScores);
        // Then
        System.out.println(output);
    }

    @Test
    public void testAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.));
        Student student = new Student(firstName, lastName, examScores);
        // When
        Double output = student.getAverageExamScore(examScores);
        // Then
        System.out.println(output);
    }

    @Test
    public void testToString() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.));
        Student student = new Student(firstName, lastName, examScores);
        // When
        String output = student.toString(examScores);
        // Then
        System.out.println(output);
    }

}