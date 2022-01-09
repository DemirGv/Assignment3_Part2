package se.lexicon;
import se.lexicon.models.TodoItemTask;

/**
 * app for models
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TodoItemTask todoItemTask = new TodoItemTask();
        System.out.println( "id:"+ todoItemTask.getId());
    }
}
