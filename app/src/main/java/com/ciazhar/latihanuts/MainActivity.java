package com.ciazhar.latihanuts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.ciazhar.latihanuts.model.Sender;

public class MainActivity extends AppCompatActivity {

    EditText subject, email, body;
    SharedPreferences sharedPreferences , sharedPreferences2;
    public static final String mypreference = "mypref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        subject = (EditText) findViewById(R.id.main_subject);
        email = (EditText) findViewById(R.id.main_email);
        body = (EditText) findViewById(R.id.main_subject);

        String sSubject = subject.getText().toString();
        String sEmail= email.getText().toString();
        String sBody = body.getText().toString();

        Log.i("ssubject",sSubject);
        Log.i("semail",sEmail);
        Log.i("sbody",sBody);

        Sender sender = new Sender(sSubject,sEmail,sBody);

        String sSender = sender.toJson();
        Log.i("sSender",sSender);

        SharedPreferences.Editor editor = getSharedPreferences(mypreference,MODE_PRIVATE).edit();
        editor.putString("sender",sSender);
        editor.apply();

        sharedPreferences2 = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        Log.i("subject",sharedPreferences2.getString("sender","No_name"));

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);


    }
}

