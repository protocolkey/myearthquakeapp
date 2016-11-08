package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Don on 10/27/2016.
 */

public class EqAdapter extends ArrayAdapter <clsEQData>{

    public EqAdapter(Context context, ArrayList<clsEQData> LstEqData) {
        super(context, 0, LstEqData);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View LstView = convertView;
        if(convertView==null){
            LstView = LayoutInflater.from(getContext()).inflate( R.layout.list_layout,parent,false);
        }
        clsEQData ThisEqData = getItem(position);
        TextView txtMag = (TextView) LstView.findViewById(R.id.txtMag);
        TextView txtFirstLoc = (TextView) LstView.findViewById(R.id.txtFirstLoc);
        TextView txtSecondLoc = (TextView) LstView.findViewById(R.id.txtSecondLoc);
        TextView txtDate = (TextView) LstView.findViewById(R.id.txtDate);
        TextView txtTime = (TextView) LstView.findViewById(R.id.txtTime);


        txtMag.setText(ThisEqData.getMag());
        txtFirstLoc.setText(ThisEqData.getFirst_Loc());
        txtSecondLoc.setText(ThisEqData.getSecond_Loc());
        txtDate.setText(ThisEqData.getDate());
        txtTime.setText(ThisEqData.getTime());



        return LstView;

    }
}
