package com.example.mob201_lab2_bai3_ps08611;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Call Bundle form Intent
        Bundle extras = intent.getExtras();
        // Check if bundle object not exist
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            // Check state with calling phone
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                // get phone number form class Telephony Manager
                String phoneNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                // show result on Toast
                Toast.makeText(context, phoneNumber, Toast.LENGTH_SHORT).show();
            }
            ;

        }
    }
}
