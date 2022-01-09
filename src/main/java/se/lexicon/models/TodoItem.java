package se.lexicon.models;

import java.time.LocalDate;


public class TodoItem {

//    Fields
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;
    private LocalDate overdue;

    //    Constructor
    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        // Operator '==' cannot be applied to 'int', 'null'
        this.id = 0;
        this.title = title;
        if(title == null) throw new RuntimeException("title was null");
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        if(deadLine == null) throw new RuntimeException("deadLine was null");
        this.done = done;
        this.creator = creator;
    }

    public TodoItem() {
    }

//    Methods
//getSummary() should return a description of the object. Like {id: 4, name: Nisse Olsson, email: nisse@gmail.com}
public String getSummary(){
    return "id: " + id + "title: " + title + "taskDescription: " + taskDescription + "deadLine: " + deadLine
            + "done: " + done + "creator: " + creator;
}

    // isOverdue() should return true if current date has passed deadLine.
    public boolean isOverdue() {
        this.deadLine = deadLine.of(2022, 1, 31);
        this.overdue = overdue.of(2022, 2, 1);
        overdue.isAfter(deadLine);
        return true;
    }

    public int getId() {
        return id;
    }

        public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
