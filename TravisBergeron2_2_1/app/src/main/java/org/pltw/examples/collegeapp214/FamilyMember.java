package org.pltw.examples.collegeapp214;

public abstract class FamilyMember {
    String firstname;
    String lastname;

    public FamilyMember(String first, String last) {
        this.firstname = first;
        this.lastname = last;
    }
    
    public FamilyMember() {
        this.firstname = "Ada";
        this.lastname = "Lovelace";
        this.lastname = "Lovelace";
    }

    // GETTERS

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    // SETTERS

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
