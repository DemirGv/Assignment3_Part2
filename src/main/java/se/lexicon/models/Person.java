package se.lexicon.models;


public class Person {

//    Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;

//    Constructor
    public Person(int id, String firstName, String lastName, String email) {
        this.id = 0;
        this.firstName = firstName;
        if (firstName == null) throw new RuntimeException("firstName was null");
        this.lastName = lastName;
        if (lastName == null) throw new RuntimeException("lastName was null");
        this.email = email;
        if (email == null) throw new RuntimeException("email was null");
    }

    public Person() {
    }

    //    Methods
//getSummary() should return a description of the object. Like {id: 4, name: Nisse Olsson, email: nisse@gmail.com}
    public String getSummary(){
        return "id: " + id + "name: " + firstName + " " + lastName + "email: " + email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
