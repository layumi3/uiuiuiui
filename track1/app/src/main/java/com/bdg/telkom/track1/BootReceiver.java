package com.bdg.telkom.track1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by lacorp on 5/26/2016.
 */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, NewIntentService.class);

        context.startService(intent1);
    }
}
