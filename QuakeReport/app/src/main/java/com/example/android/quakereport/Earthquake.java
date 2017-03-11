package com.example.android.quakereport;

/**
 * Created by Ezbery on 11.03.2017.
 */

public class Earthquake {

    private String mMagnitude;

    private String mDate;

    private String mLocation;

    public Earthquake(String magnitude, String place, String time) {
        mMagnitude = magnitude;
        mDate = time;
        mLocation = place;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }
}
