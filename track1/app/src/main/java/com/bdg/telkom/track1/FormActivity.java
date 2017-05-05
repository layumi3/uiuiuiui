package com.bdg.telkom.track1;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

import model.Track;

/**
 * Created by lacorp on 5/13/2016.
 */
public class FormActivity extends AppCompatActivity {

    private EditText mCarName;
    private EditText mNopol;
    private EditText mDepart;
    private EditText mArrive;
    private EditText mRequester;
    private Button mStartTrack;

    Track track;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_input_activity);

        Toast toast = Toast.makeText(getApplicationContext(),"Please input data trip :)",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
        mCarName = (EditText)findViewById(R.id.car_name);
        mNopol = (EditText)findViewById(R.id.nopol);
        mDepart = (EditText)findViewById(R.id.depart);
        mArrive = (EditText)findViewById(R.id.arrive);
        mRequester = (EditText)findViewById(R.id.requester);

        mStartTrack = (Button) findViewById(R.id.action_form);
//
        mStartTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String carName = mCarName.getText().toString();
                Toast.makeText(getApplication(),"Dta" ,Toast.LENGTH_SHORT).show();
//                String nopol = mNopol.getText().toString();
//                String depart = mDepart.getText().toString();
//                String arrive = mArrive.getText().toString();
//                String requester = mRequester.getText().toString();
//                track = new Track(carName, nopol, depart, arrive, requester);

//                new saveOrder().execute();
            }
        });
    }



    class saveOrder extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... params) {

            /*Built Params*/

            return null;
        }
    }
}
