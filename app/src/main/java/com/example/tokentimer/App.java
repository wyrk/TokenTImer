package com.example.tokentimer;

import android.app.Application;
import android.content.Context;
import android.util.Log;


/**
 * Created by Djuro on 25.10.2016.
 */

public class App extends Application{
    private static final String TAG = App.class.getName();

    private static App mInstance;
    private static final long startTime = System.currentTimeMillis();



    @Override
    public void onCreate() {
        super.onCreate();

        if (mInstance == null) {
            mInstance = this;
            Log.d(TAG, "start time: " + startTime);
        }
    }



    public static App getInstance() {
        return mInstance;
    }

    public static long getStartTime() {return startTime;}

    public static Context getContext() {
        return mInstance.getApplicationContext();
    }


}
