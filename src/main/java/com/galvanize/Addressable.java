package com.galvanize;
import java.util.List;

interface Addressable {
    public List<Address> getAddresses();
    public void addAddress(Address newAddress);
};