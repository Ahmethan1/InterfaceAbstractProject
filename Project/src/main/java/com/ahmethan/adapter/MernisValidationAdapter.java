package com.ahmethan.adapter;

import com.ahmethan.KpsPublicService.KPSPublicService;
import com.ahmethan.business.CustomerValidation;
import com.ahmethan.entities.Customer;

public class MernisValidationAdapter implements CustomerValidation {
    KPSPublicService kpsPublicService = new KPSPublicService();
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return kpsPublicService.validate(customer.getNationalId(), customer.getFirstName(), customer.getLastName(),customer.getdateOfBirth());
    }
}
