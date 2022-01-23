package se.lexicon.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void test_create_Person_successfully() {
        Person testObject = new Person(3, "Test", "Testson", "TT@email.se") {
            @Override
            public String getTaskDescription() {
                return null;
            }
        };

        assertEquals(3,testObject.getId());
        //assertEquals( null,testObject.getFirstName());
        assertEquals("Test",testObject.getFirstName());
        assertEquals("Testson",testObject.getLastName());
        assertEquals("TT@email.se",testObject.getEmail());
        //assertTrue(testObject.getSummary().contains("TT@email.se"));
    }
}