package com.example.hw2cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class theCV extends AppCompatActivity {

    private TextView cphone;
    private Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_cv);



        TextView cname,Cage,cjob,cemail;


        cname = findViewById(R.id.textCVname);
        Cage = findViewById(R.id.textCVage);
        cjob = findViewById(R.id.textCVjob);
        cphone = findViewById(R.id.textCVphone);
        cemail = findViewById(R.id.textCVemail);
        call = findViewById(R.id.callButton);




        Bundle receive = getIntent().getExtras();

        String namee = receive.getString("name");
        cname.setText(namee);

        String old = String.valueOf(receive.getInt("age"));
        Cage.setText(old);

        String work = receive.getString("job");
        cjob.setText(work);

        String phoneNumber = String.valueOf(receive.getInt("phone"));
        cphone.setText(String.valueOf(phoneNumber));

        String mail = receive.getString("email");
        cemail.setText(mail);




        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent calling = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:99111111"));

                startActivity(calling);
            }
        });


    }
}