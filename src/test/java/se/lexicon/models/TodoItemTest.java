package se.lexicon.models;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoItemTest {

    @Test
    public void test_create_TodoItem_successfully() {
        TodoItem testObject = new TodoItem(
                3,
                "tests",
                "testing",
                LocalDate.parse("2022-01-31"),
                true,
                null
        );

        assertEquals(3,testObject.getId());
        assertEquals("tests", testObject.getTitle());
        assertEquals("testing",testObject.getTaskDescription());
        assertEquals(LocalDate.parse("2022-01-31"),testObject.getDeadLine());
        assertTrue(testObject.isDone());
        assertEquals(null,testObject.getCreator());

    }

}