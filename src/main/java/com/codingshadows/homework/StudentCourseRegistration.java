package com.codingshadows.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentCourseRegistration {

    private Map<String, Set<String>> studentCourses;

    public StudentCourseRegistration() {
        this.studentCourses = new HashMap<>();
    }

    public void addStudent(String student) {
        studentCourses.put(student, new HashSet<>());
    }

    public void addCourse(String student, String course) {
        // TODO use computeIfAbsent to add the course to the student
    }

    public void removeCourse(String student, String course) {
        // TODO remove the course from the student
        // make sure to check if the student exists
    }

    public Set<String> getCourses(String student) {
        return studentCourses.getOrDefault(student, new HashSet<>());
    }

    public Map<String, Set<String>> getStudentCourses() {
        return new HashMap<>(studentCourses);
    }
}
