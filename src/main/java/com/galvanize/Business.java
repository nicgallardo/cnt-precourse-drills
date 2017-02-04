package com.galvanize;
import java.util.List;

public class Business implements Addressable{

    private String name = "";
    
    private List<Address> addresses; //= new ArrayList<>();

    public Business(String name){
        this.name = name;
    }

    public List<Address> getAddresses(){
        return addresses;
    }

    public void addAddress(Address newAddress){
        addresses.add(newAddress);
    }

    public String getName(){
        return this.name;
    }

}

