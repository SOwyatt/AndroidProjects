//TODO Step 14 is not completed

package org.pltw.examples.collegeapp214;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProfileFragment extends android.support.v4.app.Fragment {
    
    private TextView mFirstNameTextView;
    private EditText mFirstNameEditText;
    private TextView mLastNameTextView;
    private EditText mLastNameEditText;
    private Button mSubmitButton;
    private DatePicker mDOBPicker;
    
    private static final int WITHIN_8_YEARS = 2011;
    private static final String TAG = "ProfileFragment";
    
    private Profile mProfileModel;
    
    public View onCreateView(LayoutInflater l, ViewGroup v, Bundle b) {
        super.onCreateView(l, v, b);
        View rootView = l.inflate(R.layout.fragment_profile, v, false);
        
        mProfileModel = new Profile();
        
        //Connecting TextView and EditViews to xml
        
        mFirstNameTextView = rootView.findViewById(R.id.profile_firstname);
        mLastNameTextView = rootView.findViewById(R.id.profile_lastname);
        mFirstNameEditText = rootView.findViewById(R.id.profile_firstname_edittext);
        mLastNameEditText = rootView.findViewById(R.id.profile_lastname_edittext);
        mSubmitButton = rootView.findViewById(R.id.profile_submit_button);
        mDOBPicker = rootView.findViewById(R.id.profile_birthdate_picker);
        
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set textViews when submit button is clicked
                mFirstNameTextView.setText(mFirstNameEditText.getText().toString());
                mLastNameTextView.setText(mLastNameEditText.getText().toString());
            }
        });
        
        //Code for calendar/Date picker, modified from step 29(g)
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(mProfileModel.getDOB());
        mDOBPicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), null);
        
        mDOBPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date = new GregorianCalendar(mDOBPicker.getYear(), mDOBPicker.getMonth(), mDOBPicker.getDayOfMonth()).getTime();
                mProfileModel.setDOB(date);
            }
        });
        
        mFirstNameTextView.setText(mProfileModel.getFirstName());
        mLastNameTextView.setText(mProfileModel.getLastName());
        
        return rootView;
    }
}
