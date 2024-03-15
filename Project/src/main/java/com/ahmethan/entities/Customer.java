package com.ahmethan.entities;



public class Customer extends BaseEntity {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String nationalId;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int dateOfBirth, String nationalId) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = (int) dateOfBirth;
        this.nationalId = nationalId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getdateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
