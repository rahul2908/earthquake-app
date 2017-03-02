package com.example.android.quakereport;

/**
 * Created by dell on 2/8/2017.
 */


public class Earthquake {
    private double magnitude;
    private String location;
    private Long time;
    private String url;
    public Earthquake(double mag, String place, Long tym,String ur) {
        this.magnitude=mag;
        this.location=place;
        this.time=tym;
        this.url = ur;
    }
    public double getMagnitude(){
        return magnitude;
    }

    public String getLocation(){
        return location;
    }
    public Long getDate(){
        return time;
    }
    public String getUrl(){
        return url;
    }



}
