package com.ahmethan.business;

import com.ahmethan.entities.Customer;

public class CustomerValidationManager implements CustomerValidation{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
