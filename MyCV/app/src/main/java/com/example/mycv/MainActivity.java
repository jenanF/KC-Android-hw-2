package com.example.mycv;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name,age,job,phone,email;
        Button next;


        name = findViewById(R.id.TextPersonName);
        age = findViewById(R.id.TextPersonAge);
        job = findViewById(R.id.TextPersonJob);
        phone = findViewById(R.id.TextPersonPhoneNumber);
        email = findViewById(R.id.TextPersonEmail);
        next = findViewById(R.id.button2);





        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent info = new Intent(MainActivity.this, YourCV_screen.class);

                String namee = name.getText().toString();
                int old = Integer.parseInt(age.getText().toString());
                String work = job.getText().toString();
                int phoneNum = Integer.parseInt(phone.getText().toString());
                String mail = email.getText().toString();


                info.putExtra("name",namee);
                info.putExtra("age",old);
                info.putExtra("job",work);
                info.putExtra("phone",phoneNum);
                info.putExtra("email",mail);

                startActivity(info);
            }
        });






        TextWatcher not = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                String myName = name.getText().toString();
                String myAge = age.getText().toString().trim();
                String myJob = job.getText().toString();
                String myPhone = phone.getText().toString().trim();
                String myEmail = email.getText().toString().trim();

                next.setEnabled(!myAge.isEmpty() && !myName.isEmpty() && !myJob.isEmpty() && !myPhone.isEmpty() && !myEmail.isEmpty());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        name.addTextChangedListener(not);
        age.addTextChangedListener(not);
        job.addTextChangedListener(not);
        phone.addTextChangedListener(not);
        email.addTextChangedListener(not);

    }
}