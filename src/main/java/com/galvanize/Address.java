package com.galvanize;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.getStreet() + ", " + this.getCity() + ", " + this.getState() + " " + this.getZip());
        return result.toString();
    }


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setStreet( String newStreet ){
        this.street = newStreet;
    }


    public void setCity( String newCity){
        this.city = newCity;
    }


    public void setState( String newState){
        this.state = newState;
    }


    public void setZip( String newZip){
        this.zip = newZip;
    }

}