package com.galvanize;
import java.util.ArrayList;

interface Addressable {
    public ArrayList<Address> getAddresses();
    public void addAddress(Address newAddress);
};