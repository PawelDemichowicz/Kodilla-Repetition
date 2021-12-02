package com.kodilla.good.patterns.challenges;

public class Customer {
    public String firstName;
    public String secondName;
    public String address;
    public int id;

    public Customer(String firstName, String secondName, String address, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
}
