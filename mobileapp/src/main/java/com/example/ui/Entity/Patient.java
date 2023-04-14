package com.example.ui.Entity;

public class Patient {
    private String id;
    private String first_name;
    private String last_name;
    private String bluetooth;
    private String doctor_id;

    public Patient(String id, String first_name, String last_name, String bluetooth, String doctor_id) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.bluetooth = bluetooth;
        this.doctor_id = doctor_id;
    }


    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }
}
