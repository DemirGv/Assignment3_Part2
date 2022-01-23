package se.lexicon.models;

public class TodoItemTask {

//    Fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

//Constructors
    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = 0;
        this.assigned = assigned;
        this.todoItem = todoItem;
        if (todoItem == null) throw new RuntimeException("todoItem was null");
        this.assignee = assignee;
    }

    public TodoItemTask() {
    }

//    Methods
    public String getSummary(){
        return "id: " + id + "assigned: " + assigned + "todoItem: " + todoItem + "assignee: " + assignee;
}

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

}
