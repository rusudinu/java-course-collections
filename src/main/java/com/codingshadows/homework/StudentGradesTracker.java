package com.codingshadows.homework;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesTracker {

    private Map<String, Integer> studentGrades;

    public StudentGradesTracker() {
        // TODO instantiate the studentGrades map
    }

    public void addStudent(String name, int grade) {
        // TODO add the student to the map with the given grade
    }

    public void updateGrade(String name, int newGrade) {
        // TODO update the grade of the student with the given name
        // make sure that the student exists in the map

    }

    public void removeStudent(String name) {
        // TODO remove the student with the given name from the map
    }

    public Integer getGrade(String name) {
        // TODO return the grade of the student with the given name
    }

    public Map<String, Integer> getStudentGrades() {
        return new HashMap<>(studentGrades);
    }
}

