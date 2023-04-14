package com.example.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.database.DbHelper;

public class UpdateActivity extends AppCompatActivity {
    EditText patient_firstname, patient_lastname, patient_bluetooth;
    Button update_button, delete_button;
    String id, firstname, lastname, bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_activity);
        patient_firstname = findViewById(R.id.patientFirstName2);
        patient_lastname = findViewById(R.id.patientLastName2);
        patient_bluetooth = findViewById(R.id.smartwatch_Bluetooth2);
        update_button = findViewById(R.id.add_button2);
        delete_button = findViewById(R.id.delete_button);

        getAndSetIntentData();
/*
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(firstname);
        }
        */
        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbHelper db = new DbHelper(UpdateActivity.this);
                firstname =patient_firstname.getText().toString().trim();
                lastname = patient_lastname.getText().toString().trim();
                bluetooth = patient_bluetooth.getText().toString().trim();
                db.updatePatient(id, firstname, lastname, bluetooth);
                startActivity(new Intent(UpdateActivity.this, PatientsActivity.class));


            }
        });
        getAndSetIntentData();

        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmDialog();

            }

        });


    }


    void getAndSetIntentData() {
        if (getIntent().hasExtra("id") && getIntent().hasExtra("firstname") && getIntent().hasExtra("lastname") && getIntent().hasExtra("bluetooth")) {
            //getting data from intent
            id = getIntent().getStringExtra("id");
            firstname = getIntent().getStringExtra("firstname");
            lastname = getIntent().getStringExtra("lastname");
            bluetooth = getIntent().getStringExtra("bluetooth");
            //setting data to intent

            patient_firstname.setText(firstname);
            patient_lastname.setText(lastname);
            patient_bluetooth.setText(bluetooth);
        } else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
    void confirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Delete " + firstname + " ?");
        builder.setMessage("Are you sure you want to delete " + firstname + " ?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                DbHelper myDB = new DbHelper(UpdateActivity.this);
                myDB.deleteOneRow(id);
                finish();
                startActivity(new Intent(UpdateActivity.this, PatientsActivity.class));

            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.create().show();
    }
}