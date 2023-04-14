package com.example.ui.Entity;

public class Doctor {
    private String id;
    private String doctor_name;
    private String doctor_email;
    private String doctor_password;
    private String doctor_speciality;
    private String doctor_experience;
    private String doctor_address;


    public Doctor(String id, String doctor_name, String doctor_email, String doctor_password, String doctor_speciality, String doctor_experience, String doctor_address) {
        this.id = id;
        this.doctor_name = doctor_name;
        this.doctor_email = doctor_email;
        this.doctor_password = doctor_password;
        this.doctor_speciality = doctor_speciality;
        this.doctor_experience = doctor_experience;
        this.doctor_address = doctor_address;
    }

    public String getId() {
        return id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public String getDoctor_password() {
        return doctor_password;
    }

    public String getDoctor_speciality() {
        return doctor_speciality;
    }

    public String getDoctor_experience() {
        return doctor_experience;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }

    public void setDoctor_password(String doctor_password) {
        this.doctor_password = doctor_password;
    }

    public void setDoctor_speciality(String doctor_speciality) {
        this.doctor_speciality = doctor_speciality;
    }

    public void setDoctor_experience(String doctor_experience) {
        this.doctor_experience = doctor_experience;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }
}
