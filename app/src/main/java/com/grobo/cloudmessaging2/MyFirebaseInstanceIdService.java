package com.grobo.cloudmessaging2;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String LOG_TAG = MyFirebaseInstanceIdService.class.getName();

    @Override
    public void onTokenRefresh() {
        String refeshedToken = FirebaseInstanceId.getInstance().getToken();

        Log.d(LOG_TAG, "Token" + refeshedToken);
        Toast.makeText(this, "Refreshed token" + refeshedToken, Toast.LENGTH_SHORT).show();
    }
}
