package org.pltw.examples.collegeapp214;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class GuardianFragment extends android.support.v4.app.Fragment {
    
    private TextView mFirstNameTextView;
    private TextView mLastNameTextView;
    private TextView mOccupationTextView;
    private EditText mOccupationEditText;
    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    private Button mSubmitButton;
    
    private Guardian mGuardianModel;
    
    
    public View onCreateView(LayoutInflater l, ViewGroup v, Bundle b) {
        super.onCreateView(l, v, b);
        View rootView = l.inflate(R.layout.fragment_guardian, v, false);
        
        mGuardianModel = new Guardian();
        
        //Connecting TextViews and EditTexts to xml
        
        mFirstNameTextView = rootView.findViewById(R.id.guardian_firstname);
        mLastNameTextView = rootView.findViewById(R.id.guardian_lastname);
        mOccupationTextView = rootView.findViewById(R.id.guardian_occupation);
        mOccupationEditText = rootView.findViewById(R.id.guardian_occupation_edittext);
        mFirstNameEditText = rootView.findViewById(R.id.guardian_firstname_edittext);
        mLastNameEditText = rootView.findViewById(R.id.guardian_lastname_edittext);
        mSubmitButton = rootView.findViewById(R.id.guardian_submit_button);
        
        //Setting up button listener
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set names when submit button is clicked
                mFirstNameTextView.setText(mFirstNameEditText.getText().toString());
                mLastNameTextView.setText(mLastNameEditText.getText().toString());
                mOccupationTextView.setText(mOccupationEditText.getText().toString());
            }
        });
        
        mFirstNameTextView.setText(mGuardianModel.getFirstname());
        mLastNameTextView.setText(mGuardianModel.getLastname());
        mOccupationTextView.setText(mGuardianModel.getOccupation());
        
        return rootView;
    }
}