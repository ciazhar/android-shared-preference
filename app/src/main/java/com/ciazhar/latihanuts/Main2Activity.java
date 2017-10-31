package com.ciazhar.latihanuts;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView sender;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sharedPreferences = getSharedPreferences(MainActivity.mypreference, Context.MODE_PRIVATE);
        Log.i("subject",sharedPreferences.getString("sender","No_name"));

        sender = (TextView) findViewById(R.id.two_sender);

    }
}
