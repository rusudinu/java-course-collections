package homework;

import com.codingshadows.homework.StudentCourseRegistration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentCourseRegistrationTest {

    @Test
    void testStudentCourseRegistration() {
        StudentCourseRegistration registration = new StudentCourseRegistration();

        registration.addStudent("Alice");
        registration.addCourse("Alice", "Math");
        registration.addCourse("Alice", "Science");

        registration.addStudent("Bob");
        registration.addCourse("Bob", "History");
        registration.addCourse("Bob", "Art");

        assertTrue(registration.getCourses("Alice").contains("Math"));

        registration.removeCourse("Alice", "Math");
        assertFalse(registration.getCourses("Alice").contains("Math"));

        assertTrue(registration.getStudentCourses().containsKey("Bob"));
        assertEquals(2, registration.getCourses("Bob").size());
    }
}

