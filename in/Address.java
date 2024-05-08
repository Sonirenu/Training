package com.in;

public class Address {

    private String streetNo;
    private String city;
    private String state;
    private String pin;

    public Address(String streetNo, String city, String state, String pin) {
        this.streetNo = streetNo;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }
}

