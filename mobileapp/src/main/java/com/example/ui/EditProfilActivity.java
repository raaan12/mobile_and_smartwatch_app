package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.database.DbHelper;

public class EditProfilActivity extends AppCompatActivity {
    Button updateDoctor;
    EditText edUsername, edEmail, edDescription,edExperience, edAddress, edSpeciality;
    String id;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editprofil_activity);

        edUsername = findViewById(R.id.editTextRegName);
        edSpeciality = findViewById(R.id.editTextRegPassword);
        //edDescription = findViewById(R.id.editTextRegPassword);
        edExperience = findViewById(R.id.editTextConfRegPassword);
        edAddress = findViewById(R.id.editTextConfRegPassword);

        updateDoctor = findViewById(R.id.update);

        updateDoctor.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view){
                DbHelper db = new DbHelper(EditProfilActivity.this);
                String username = edUsername.getText().toString().trim();
                String speciality = edSpeciality.getText().toString().trim();
                String experience = edExperience.getText().toString().trim();
                String address = edAddress.getText().toString().trim();

                db.updateDoctor(String.valueOf(1), username, speciality, experience, address);
                startActivity(new Intent(EditProfilActivity.this, ProfilActivity.class));



            }
        });

    }
}