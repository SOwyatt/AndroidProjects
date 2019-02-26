package org.pltw.examples.collegeapp214;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    
    private TextView mFirstNameTextView;
    private TextView mLastNameTestView;
    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    
    private FamilyMember mFamilyMemberModel;
    
    
    public View onCreateView(LayoutInflater l, ViewGroup v, Bundle b) {
        super.onCreateView(l, v, b);
        View rootView = l.inflate(R.layout.fragment_family_member, v, false);
        return rootView;
    }
}
