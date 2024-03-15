package com.ahmethan.business;

import com.ahmethan.entities.Customer;

public interface CustomerValidation {
    boolean checkIfRealPerson(Customer customer);
}
