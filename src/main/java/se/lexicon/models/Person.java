package se.lexicon.models;

public abstract class Person extends Object {

//    Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public abstract String getTaskDescription();

//    Constructors
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

    @Override
    public String toString() {
        return "Person{" + id + "name: " + firstName + " " + lastName + "email: " + email +"}";
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
}
