package com.example.android.quakereport;

import java.security.PrivateKey;

/**
 * Created by Don on 10/27/2016.
 */

public class clsEQData {
    private String Mag;
    private String First_Loc;



    private String Second_Loc;
    private String Date;
    private String Time;



    public clsEQData(String mag, String first_location, String  Second_location,String date,String time ) {

        this.Mag = mag;
        this.First_Loc = first_location;
        this.Second_Loc= Second_location;
        this.Date = date;
        this.Time=time;
    }

    public String getMag() {
        return Mag;
    }



    public String getDate() {
        return Date;
    }
    public String getTime() {
        return Time;
    }


    public String getSecond_Loc() {
        return Second_Loc;
    }

    public String getFirst_Loc() {
        return First_Loc;
    }

}
