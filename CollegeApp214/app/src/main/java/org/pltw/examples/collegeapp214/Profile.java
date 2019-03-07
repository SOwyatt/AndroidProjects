package org.pltw.examples.collegeapp214;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Profile {
    String mFirstName;
    String mLastName;
    
    Date mDOB;
    
    public Profile(String first, String last) {
        mFirstName = first;
        mLastName = last;
    }
    
    public Profile() {
        mFirstName = "Alan";
        mLastName = "Turing";
        try {
            mDOB = new SimpleDateFormat("dd/MM/yyyy").parse("23/06/1912");
        }
        catch (Exception e) {
            System.out.println("Exception is occurred!");
        }
    }
    
    public String getFirstName() {
        return mFirstName;
    }
    
    public String getLastName() {
        return mLastName;
    }
    
    public Date getDOB() {
        return mDOB;
    }
    
    public void setDOB(Date DOB) {
        mDOB = DOB;
    }
    
    public void setLastName(String lastName) {
        mLastName = lastName;
    }
    
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }
}
