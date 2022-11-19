package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void testGetAverageExamScore() {
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<>(Arrays.asList(100.0, 150.0));
        ArrayList<Double> s2Scores = new ArrayList<>(Arrays.asList(225.0, 25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);
        // When
        double output = classroom.getAverageExamScore();
        // Then
        System.out.println(output);
    }
    @Test
    public void testAddStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0));
        Student student = new Student("Leon", "Hunter", examScores);
        // When
        classroom.addStudent(student);

        // Then

    }
}
