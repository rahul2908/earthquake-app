package com.example.android.quakereport;

/**
 * Created by dell on 2/8/2017.
 */


public class Earthquake {
    private String magnitude;
    private String location;
    private String time;
    public Earthquake(String mag, String place, String tym) {
        magnitude=mag;
        location=place;
        time=tym;
    }
    public String getMagnitude(){
        return magnitude;
    }
    public String getLocation(){
        return location;
    }
    public String getDate(){
        return time;
    }

}
