package com.bdg.telkom.track1;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by lacorp on 5/15/2016.
 * TODO set username/user_id for each session
 * ref for check http://androidexample.com/Android_Session_Management_Using_SharedPreferences_-_Android_Example/index.php?view=article_discription&aid=127&aaid=147
 */
public class SessionManager {


    public void setPreferences(Context context, String key, String value){
        SharedPreferences.Editor editor = context.getSharedPreferences("TrackingCar", Context.MODE_PRIVATE).edit();
        editor.putString(key,value);
        editor.commit();

    }

    public String getPreferences(Context context, String key){
        SharedPreferences prefs = context.getSharedPreferences("TrackingCar", Context.MODE_PRIVATE);
        String position = prefs.getString(key, "");
        return position;
    }

}
