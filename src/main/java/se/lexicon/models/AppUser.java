package se.lexicon.models;

import java.io.Serializable;

public abstract class AppUser extends Person implements Comparable<AppUser>, Serializable {

    private static final String[] ROLE_PREFIX = {"0", "00"};

    private String username;
    private String password;
    private AppRole[] role;

    public AppUser(String username, String password, AppRole[] role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole[] getRole() {
        return role;
    }

    public void setRole(AppRole[] role) {
        this.role = role;
    }
}
