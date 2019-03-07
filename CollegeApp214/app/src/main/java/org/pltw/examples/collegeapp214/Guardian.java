package org.pltw.examples.collegeapp214;

public class Guardian extends FamilyMember {
    String mOccupation;
    
    public Guardian(String firstName, String lastName, String occupation) {
        super(firstName, lastName);
        mOccupation = occupation;
    }
    
    public Guardian() {
        super();
        mOccupation = "Computer Scientist";
    }
    
    public String getOccupation() {
        return mOccupation;
    }
    
    public void setOccupation(String occupation) {
        mOccupation = occupation;
    }
}
