package com.ahmethan.business;

import com.ahmethan.entities.Customer;

public class BaseCustomerManager implements CustomerManager{
    @Override
    public void save(Customer customer) {
        System.out.println("Saved To DataBase : " + customer.getFirstName() +" " + customer.getLastName());
    }
}
