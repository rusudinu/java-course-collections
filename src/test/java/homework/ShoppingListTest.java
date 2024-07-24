package homework;

import com.codingshadows.homework.ShoppingList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingListTest {

    @Test
    void testShoppingList() {
        ShoppingList list = new ShoppingList();

        list.addItem("Milk");
        list.addItem("Bread");
        list.addItem("Eggs");
        list.addItem("Butter");
        list.addItem("Cheese");

        assertEquals(5, list.size());
        assertTrue(list.getItems().contains("Milk"));

        list.replaceItem(1, "Whole Grain Bread");
        assertEquals("Whole Grain Bread", list.getItems().get(1));

        list.removeItem(3);
        assertEquals(4, list.size());
        assertFalse(list.getItems().contains("Butter"));

        assertTrue(list.containsItem("Cheese"));
        assertFalse(list.containsItem("Butter"));
    }
}

