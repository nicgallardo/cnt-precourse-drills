package com.galvanize;
import java.util.ArrayList;

public class Business implements Addressable{
    private String name = "";
    private ArrayList<Address> addresses; //= new ArrayList<>();

    public Business(String name){
        this.name = name;
    }

    public ArrayList<Address> getAddresses(){
        return addresses;
    }

    public void addAddress(Address newAddress){
        addresses.add(newAddress);
    }

    public String getName(){
        return this.name;
    }

}

