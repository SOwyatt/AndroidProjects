package org.pltw.examples.collegeapp214;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FamilyMemberFragment extends android.support.v4.app.Fragment {
    public View onCreateView(LayoutInflater l, ViewGroup v, Bundle b) {
        super.onCreateView(l, v, b);
        View rootView = l.inflate(R.layout.fragment_family_member, v, false);
        return rootView;
    }
}
