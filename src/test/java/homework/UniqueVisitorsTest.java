package homework;

import com.codingshadows.homework.UniqueVisitors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueVisitorsTest {

    @Test
    void testUniqueVisitors() {
        UniqueVisitors visitors = new UniqueVisitors();

        visitors.addVisitor("Alice");
        visitors.addVisitor("Bob");
        visitors.addVisitor("Charlie");
        visitors.addVisitor("Diana");
        visitors.addVisitor("Eve");

        assertEquals(5, visitors.size());
        assertTrue(visitors.containsVisitor("Alice"));

        visitors.addVisitor("Alice"); // duplicate
        assertEquals(5, visitors.size()); // still 5

        assertFalse(visitors.containsVisitor("Frank"));
        assertTrue(visitors.getVisitors().contains("Bob"));
    }
}
