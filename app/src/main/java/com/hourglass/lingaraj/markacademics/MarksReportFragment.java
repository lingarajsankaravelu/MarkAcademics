package com.hourglass.lingaraj.markacademics;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lingaraj on 2/8/16.
 */
public class MarksReportFragment extends android.support.v4.app.Fragment {

    TextView studentName;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.marks_report_layout, container, false);
        studentName = (TextView) view.findViewById(R.id.student_name);



        return  view;
    }

    }
