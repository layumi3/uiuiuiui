package com.example.android.hub;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowLocation;
    GPSTracker gps;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
//
//        btnShowLocation = (Button) findViewById(R.id.show_location);
//
//        btnShowLocation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gps = new GPSTracker(MainActivity.this);
//
//                if (gps.canGetLocation()){
//                    double latitude = gps.getLatitude();
//                    double longitude = gps.getLongitude();
//
//                    Toast.makeText(getApplicationContext(), "Your Location is-\nLat:" + latitude + "\nLong : "+longitude, Toast.LENGTH_SHORT).show();
//                }else {
//                    gps.showSettingAlert();
//                }
//            }
//        });
    }
}
