package com.example.android.quakereport;

/**
 * Created by Ezbery on 11.03.2017.
 */

public class Earthquake {

    private double mMagnitude;

    private long mTimeInMiliSeconds;

    private String mLocation;

    private String mURL;

    public Earthquake(double magnitude, String place, long time, String URL) {
        mMagnitude = magnitude;
        mTimeInMiliSeconds = time;
        mLocation = place;
        mURL=URL;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getmTimeInMiliSeconds() {
        return mTimeInMiliSeconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getURL(){return mURL;}
}
