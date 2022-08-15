package com.example.hw2cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

                CV cv= new CV("Bader",23,"Engineer",99111111,"email@email.com");

                Intent send = new Intent(MainActivity.this,theCV.class);

                send.putExtra("name",cv.getName());
                send.putExtra("age", cv.getAge());
                send.putExtra("job", cv.getJob());
                send.putExtra("phone", cv.getPhone());
                send.putExtra("email", cv.getEmail());

                startActivity(send);

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