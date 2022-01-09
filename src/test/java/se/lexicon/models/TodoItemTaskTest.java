package se.lexicon.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoItemTaskTest {

    @Test
    public void name() {
        TodoItemTask testObject = new TodoItemTask(0,true,new TodoItem(),null);

        assertEquals(0, testObject.getId());
        assertTrue(testObject.isAssigned());
        assertEquals(new TodoItem(),testObject.getTodoItem());
        assertEquals(null,testObject.getAssignee());
    }
}