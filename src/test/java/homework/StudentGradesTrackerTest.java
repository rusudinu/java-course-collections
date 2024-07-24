package homework;

import com.codingshadows.homework.StudentGradesTracker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradesTrackerTest {

    @Test
    void testStudentGradesTracker() {
        StudentGradesTracker tracker = new StudentGradesTracker();

        tracker.addStudent("John", 85);
        tracker.addStudent("Jane", 92);
        tracker.addStudent("Jack", 78);
        tracker.addStudent("Jill", 88);
        tracker.addStudent("Jim", 91);

        assertEquals(85, tracker.getGrade("John"));

        tracker.updateGrade("John", 90);
        assertEquals(90, tracker.getGrade("John"));

        tracker.removeStudent("Jack");
        assertNull(tracker.getGrade("Jack"));

        assertEquals(4, tracker.getStudentGrades().size());
        assertTrue(tracker.getStudentGrades().containsKey("Jane"));
    }
}
