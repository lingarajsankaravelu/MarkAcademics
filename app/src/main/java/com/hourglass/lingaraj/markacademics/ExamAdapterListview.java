package com.hourglass.lingaraj.markacademics;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.security.PublicKey;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingaraj on 2/8/16.
 */
public class ExamAdapterListview extends BaseAdapter {

    private  Context tcontext;
    private LayoutInflater layoutInflater;
    private ViewHolder holder=null;
    public int selectedIndex = -1;

    String examType[];
    ExamAdapterListview(Context context)
    {
        this.tcontext = context;
        this.examType = tcontext.getResources().getStringArray(R.array.exam_type);
        this.layoutInflater = LayoutInflater.from(tcontext);


    }
    public void setSelectedIndex(int position)
    {
        this.selectedIndex = position;
        notifyDataSetChanged();
    }
    public int getCount()
    {
     return  examType.length;

    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView = this.layoutInflater.inflate(R.layout.exam_type_list_layout,null);
            holder=new ViewHolder();
            holder.examTypeTextView = (TextView) convertView.findViewById(R.id.textView_list);
            convertView.setTag(holder);
        }
        else
        {
             holder=(ViewHolder)convertView.getTag();


        }
        holder.examTypeTextView.setText(examType[position]);
        if(position==selectedIndex)
        {
            convertView.setBackgroundColor(Color.GREEN);
        }
        else
        {
            convertView.setBackgroundColor(tcontext.getResources().getColor(R.color.colorPrimary));
        }


            return convertView;
    }
    static class  ViewHolder
    {
        TextView  examTypeTextView;
    }

}
