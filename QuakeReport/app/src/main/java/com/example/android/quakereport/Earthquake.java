package com.example.android.quakereport;

/**
 * Created by Ezbery on 11.03.2017.
 */

public class Earthquake {

    private String mMagnitude;

    private long mTimeInMiliSeconds;

    private String mLocation;

    public Earthquake(String magnitude, String place, long time) {
        mMagnitude = magnitude;
        mTimeInMiliSeconds = time;
        mLocation = place;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public long getmTimeInMiliSeconds() {
        return mTimeInMiliSeconds;
    }

    public String getLocation() {
        return mLocation;
    }
}
