package com.ahmethan.business;

import com.ahmethan.entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{
    private CustomerValidation customerValidation;

    public StarBucksCustomerManager(CustomerValidation customerValidation) {
        this.customerValidation = customerValidation;
    }
    @Override
    public void save(Customer customer) {
        if (customerValidation.checkIfRealPerson(customer)) {
            super.save(customer);
            addStar(customer);
        }
        else {
            throw new RuntimeException("Kayıt Yapılmadı");
        }
    }
    public void addStar(Customer customer){
        System.out.println("Star Added to Customer");
    }
}
