package com.example.mycv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class YourCV_screen extends AppCompatActivity {

    private TextView cphone;
    private Button call;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_cv_screen);

        TextView cname,Cage,cjob,cemail;


        cname = findViewById(R.id.textCVname);
        Cage = findViewById(R.id.textCVage);
        cjob = findViewById(R.id.textCVjob);
        cphone = findViewById(R.id.textCVphone);
        cemail = findViewById(R.id.textCVemail);
        call = findViewById(R.id.callButton);


        Bundle CVpro = getIntent().getExtras();

        String n = CVpro.getString("name");
        cname.setText(n);


        int a = CVpro.getInt("age");
        Cage.setText(String.valueOf(a));


        String j = CVpro.getString("job");
        cjob.setText(j);


        int ph = CVpro.getInt("phone");
        cphone.setText(String.valueOf(ph));


        String em = CVpro.getString("email");
        cemail.setText(em);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = cphone.getText().toString();

                Intent calling = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));

                startActivity(calling);

            }

        });



    }
}