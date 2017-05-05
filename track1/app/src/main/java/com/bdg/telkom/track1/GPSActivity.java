package com.bdg.telkom.track1;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lacorp on 5/24/2016.
 */
public class GPSActivity extends AppCompatActivity implements LocationListener{
    private LocationManager lm;


    private TextView tv;
    String mProvider;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gps_activity);

        /********** get Gps location service LocationManager object ***********/
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();

        mProvider = lm.getBestProvider(criteria, false);
        if (mProvider != null && !mProvider.equals("")) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            Location location = lm.getLastKnownLocation(mProvider);
            lm.requestLocationUpdates(mProvider, 15000, 1, this);


            if (location != null)
                onLocationChanged(location);
            else
                showSettingAlert();/*this for alert setting if the gps not avaiable*/
                Toast.makeText(getBaseContext(), "No Location Provider Found Check Your Code", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(getBaseContext(), "Gps turned on "+lm, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onLocationChanged(Location location) {
        TextView latitude = (TextView) findViewById(R.id.latitude);
        TextView longitude = (TextView) findViewById(R.id.longitude);

        longitude.setText("Current Longitude:" + location.getLongitude());
        latitude.setText("Current Latitude:" + location.getLatitude());

        /*TODO update location*/
//        updateLocation();
    }
//    public void updateLocation() {
//        getCurrentLocation();
//    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    public void showSettingAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Location Setting");
        alertDialog.setMessage("Location is not allowed. Do you want to go to settings menu?");
        alertDialog.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        });

        // on pressing cancel button
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }
}
