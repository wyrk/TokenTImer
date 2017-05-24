package com.example.tokentimer;


import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Djuro on 23.05.2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = MyFirebaseInstanceIDService.class.getName();

    @Override
    public void onTokenRefresh() {
        Log.d(TAG, "time when token generated: " + System.currentTimeMillis());
        Log.d(TAG, "millis since start of app till token generated: " + (System.currentTimeMillis() - App.getStartTime()));
    }
}
