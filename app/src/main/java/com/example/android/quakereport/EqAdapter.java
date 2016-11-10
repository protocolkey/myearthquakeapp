package com.example.android.quakereport;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;
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
        // draw circle
        GradientDrawable magnitudeCircle =  (GradientDrawable) txtMag.getBackground();
        int magnitudeColor = getMagnitudeColor(ThisEqData.getMag());
        magnitudeCircle.setColor(magnitudeColor);

        ///-----------------------------
        txtMag.setText(ThisEqData.getMag());
        txtFirstLoc.setText(ThisEqData.getFirst_Loc());
        txtSecondLoc.setText(ThisEqData.getSecond_Loc());
        txtDate.setText(ThisEqData.getDate());
        txtTime.setText(ThisEqData.getTime());



        return LstView;

    }

    private int getMagnitudeColor(String mag) {
        int Mag = Double.valueOf(mag).intValue();
        int ReturnVal=0;
        switch (Mag) {
            case 0:
            case 1:
                ReturnVal=  R.color.magnitude1;
                break;
            case 2:
                ReturnVal= R.color.magnitude2;
                break;
            case 3:
                ReturnVal= R.color.magnitude3;
                break;
            case 4:
                ReturnVal= R.color.magnitude4;
                break;
            case 5:
                ReturnVal= R.color.magnitude5;
                break;
            case 6:
                ReturnVal= R.color.magnitude6;
                break;
            case 7:
                ReturnVal= R.color.magnitude7;
                break;
            case 8:
                ReturnVal= R.color.magnitude8;
                break;
            case 9:
                ReturnVal= R.color.magnitude9;
                break;
            default:
                ReturnVal= R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), ReturnVal);

    }
}
