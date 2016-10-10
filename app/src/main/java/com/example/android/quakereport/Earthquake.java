package com.example.android.quakereport;

/**
 * Created by Rudster on 8/16/2016.
 */

public class Earthquake {
    //Earthquakes magnitude
    private double mMagnitude;

    //location of earthquake
    private String mLocation;

    //date of earthquake
    private long mTimeInMilliseconds;

    //Website URL of the earthquake
    private String mUrl;

    /**
     * @param magnitude          is the magnitude of the earthquake
     * @param location           is the location of the earthquake
     * @param timeInMilliseconds is the date of the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return magnitude of earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return earthquake location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return time of earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake
     */
    public String getUrl() {
        return mUrl;
    }
}
