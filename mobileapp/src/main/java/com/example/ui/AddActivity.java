package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.database.DbHelper;

public class AddActivity extends AppCompatActivity {
    EditText firstname, lastname, bluetooth, doctorID;
    Button add_button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity);

        firstname = findViewById(R.id.patientFirstName);
        lastname = findViewById(R.id.patientLastName);
        bluetooth = findViewById(R.id.smartwatch_Bluetooth);
        //doctorID= findViewById(R.id.ProfileName);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper db = new DbHelper(AddActivity.this);

                db.addPatient(firstname.getText().toString().trim(),
                        lastname.getText().toString().trim(),
                        bluetooth.getText().toString().trim());
                startActivity(new Intent(AddActivity.this, PatientsActivity.class));
            }
        });
    }
}