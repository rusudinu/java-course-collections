package homework;

import com.codingshadows.homework.LibraryManagementSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagementSystemTest {

    @Test
    void testLibraryManagementSystem() {
        LibraryManagementSystem library = new LibraryManagementSystem();

        library.addGenre("Science Fiction", new ArrayList<>(Arrays.asList("Dune", "Neuromancer")));
        library.addGenre("Fantasy", new ArrayList<>(Arrays.asList("Harry Potter", "Lord of the Rings")));

        library.addBook("Science Fiction", "Foundation");
        assertEquals(3, library.getBooks("Science Fiction").size());

        library.removeBook("Fantasy", "Harry Potter");
        assertEquals(1, library.getBooks("Fantasy").size());

        assertTrue(library.getGenreBooks().containsKey("Fantasy"));
        assertEquals(1, library.getBooks("Fantasy").size());
        assertTrue(library.getBooks("Science Fiction").contains("Foundation"));
    }
}
