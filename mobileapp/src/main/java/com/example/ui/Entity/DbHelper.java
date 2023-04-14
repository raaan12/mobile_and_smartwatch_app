/*package com.example.mobileapp.Entity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {


    // Définir les constantes pour le nom de la base de données et la version
    private Context context;

    private static final String DATABASE_NAME = "myapp.db";
    private static final int DATABASE_VERSION = 1;

    // Définir les constantes pour les noms de tables et les colonnes pour la table patients
    public static final String TABLE_PATIENTS = "patients";
    public static final String COLUMN_PATIENT_ID = "_id";
    public static final String COLUMN_PATIENT_FIRSTNAME = "patient_first_name";
    public static final String COLUMN_PATIENT_LASTNAME = "patient_last_name";
    public static final String COLUMN_PATIENT_BLUETOOTH = "patient_bluetooth";
    public static final String COLUMN_PATIENT_DOCTOR = "patient_doctor_id";


    // Définir les constantes pour les noms de tables et les colonnes pour la table docteurs
    public static final String TABLE_DOCTORS = "doctors";
    public static final String COLUMN_DOCTOR_ID = "_id";
    public static final String COLUMN_DOCTOR_NAME = "doctor_name";
    public static final String COLUMN_DOCTOR_EMAIL = "doctor_email";
    public static final String COLUMN_DOCTOR_PASSWORD = "doctor_password";
    public static final String COLUMN_DOCTOR_SPECIALITY = "doctor_speciality";
    public static final String COLUMN_DOCTOR_EXPERIENCE = "doctor_experience";
    public static final String COLUMN_DOCTOR_ADDRESS = "doctor_address";


    // SQL statement pour créer la table patients
    private static final String CREATE_TABLE_PATIENTS =
            "CREATE TABLE " + TABLE_PATIENTS + " (" +
                    COLUMN_PATIENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_PATIENT_FIRSTNAME + " TEXT NOT NULL, " +
                    COLUMN_PATIENT_LASTNAME + " TEXT NOT NULL, " +
                    COLUMN_PATIENT_BLUETOOTH + " TEXT NOT NULL, " +
                    COLUMN_PATIENT_DOCTOR + " INTEGER NOT NULL)";

    // SQL statement pour créer la table docteurs
    private static final String CREATE_TABLE_DOCTORS =
            "CREATE TABLE " + TABLE_DOCTORS + " (" +
                    COLUMN_DOCTOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_DOCTOR_NAME + " TEXT NOT NULL, " +
                    COLUMN_DOCTOR_EMAIL + " TEXT NOT NULL, " +
                    COLUMN_DOCTOR_PASSWORD + " TEXT NOT NULL, " +
                    COLUMN_DOCTOR_SPECIALITY + " TEXT, " +
                    COLUMN_DOCTOR_EXPERIENCE + " TEXT, " +
                    COLUMN_DOCTOR_ADDRESS + " TEXT)";


    // Constructeur DBHelper
    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Fonction onCreate pour créer la base de données
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_PATIENTS);
        db.execSQL(CREATE_TABLE_DOCTORS);
    }

    // Fonction onUpgrade pour mettre à jour la base de données
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PATIENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DOCTORS);
        onCreate(db);
    }

    public void register(String username, String  email , String password ){
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_DOCTOR_NAME,username);
        cv.put(COLUMN_DOCTOR_EMAIL,email);
        cv.put(COLUMN_DOCTOR_PASSWORD,password);
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_DOCTORS,null,cv);
        db.close();

    }



    public int login(String username, String password){
        int result=0;
        String str[]= new String[2];
        str[0] = username;
        str[1] =password;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery( "select * from "+ TABLE_DOCTORS+ " where " + COLUMN_DOCTOR_NAME + "=? and "+ COLUMN_DOCTOR_PASSWORD+ "=? ",str);
        if(c.moveToFirst()) {
            result = 1;
        }
        return result;
    }




    public void updateDoctor(String row_id, String n, String s, String e, String a) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_DOCTOR_NAME, n);
        cv.put(COLUMN_DOCTOR_SPECIALITY, s);
        cv.put(COLUMN_DOCTOR_EXPERIENCE, e);
        cv.put(COLUMN_DOCTOR_ADDRESS, a);
        long result = db.update(TABLE_DOCTORS, cv,"_id=?", new String[]{row_id});
        if (result == -1) {
            Toast.makeText(context, "failed", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Updated successfully", Toast.LENGTH_LONG).show();
            // readAllDataDoctor();
        }
    }
    public Cursor readAllDataDoctor() {
        String query = "select * from " + TABLE_DOCTORS;
        SQLiteDatabase dbs = this.getReadableDatabase();
        Cursor cursor = null;
        if (dbs != null) {
            cursor = dbs.rawQuery(query, null);
        }
        return cursor;
    }
    public void addPatient(String fn, String ln, String bl, String doctorname) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_PATIENT_FIRSTNAME, fn);
        cv.put(COLUMN_PATIENT_LASTNAME, ln);
        cv.put(COLUMN_PATIENT_BLUETOOTH, bl);
        cv.put(COLUMN_PATIENT_DOCTOR, doctorname);

        long result = db.insert(TABLE_PATIENTS, null, cv);
        if (result == -1) {
            Toast.makeText(context, "failed", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Added successfully", Toast.LENGTH_LONG).show();
            readAllDataPatient();
        }
    }
    public Cursor readAllDataPatient() {
        String query = "select * from " + TABLE_PATIENTS + " where " + COLUMN_PATIENT_DOCTOR + " =?";
        SQLiteDatabase dbs = this.getReadableDatabase();
        Cursor cursor = null;
        if (dbs != null) {
            cursor = dbs.rawQuery(query, null);
        }
        return cursor;
    }
    public void updatePatient(String row_id, String fn, String ln, String bl) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_PATIENT_FIRSTNAME, fn);
        cv.put(COLUMN_PATIENT_LASTNAME, ln);
        cv.put(COLUMN_PATIENT_BLUETOOTH, bl);
        long result = db.update(TABLE_PATIENTS, cv, "_id=?", new String[]{row_id});
        if (result == -1) {
            Toast.makeText(context, "failed", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(context, "Updated successfully", Toast.LENGTH_LONG).show();

        }
    }

    public void deleteOneRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(TABLE_PATIENTS, "_id=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Failed to Delete.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Successfully Deleted.", Toast.LENGTH_SHORT).show();
        }
    }

    public void deleteAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PATIENTS);
    }


}

*/