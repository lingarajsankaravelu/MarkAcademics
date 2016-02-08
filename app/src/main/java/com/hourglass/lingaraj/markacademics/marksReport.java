package com.hourglass.lingaraj.markacademics;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

public class marksReport extends AppCompatActivity {
    ListView examTypeListview;
    ExamAdapterListview examAdapterListview;
    FrameLayout mainFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_report);
        examTypeListview = (ListView) findViewById(R.id.test_listView);
        mainFrameLayout = (FrameLayout) findViewById(R.id.marks_report_frame_layout);
        try {
            examAdapterListview = new ExamAdapterListview(marksReport.this);
            examTypeListview.setAdapter(examAdapterListview);
        } catch (Exception e) {
            Log.e("ListViewEr", e.toString());
            e.printStackTrace();
        }

        examTypeListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
              examAdapterListview.setSelectedIndex(position);
              setPositionFragment(position);
            }
        });


    }

    private void setPositionFragment(int position)
    {

        MarksReportFragment marksReportFragment = new MarksReportFragment();
        Fragment fragment = new MarksReportFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.marks_report_frame_layout, fragment).show(fragment).addToBackStack(null).commit();


    }
}
