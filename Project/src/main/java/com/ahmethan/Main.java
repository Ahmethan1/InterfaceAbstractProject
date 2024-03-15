package com.ahmethan;

import com.ahmethan.adapter.MernisValidationAdapter;
import com.ahmethan.business.NeroCustomerManager;
import com.ahmethan.business.StarBucksCustomerManager;
import com.ahmethan.entities.Customer;



public class Main {
    public static void main(String[] args) {
        StarBucksCustomerManager starBucksCustomerManager = new StarBucksCustomerManager(new MernisValidationAdapter());
        NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        Customer customer1 = new Customer("Ali İbrahim", "Safa",  1998, "1111111111");
        Customer customer2 = new Customer("Ahmethan", "Safa",  2000, "22222222222");
        starBucksCustomerManager.save(customer1);
        starBucksCustomerManager.addStar(customer1);
        starBucksCustomerManager.save(customer2);
        starBucksCustomerManager.addStar(customer2);

    }
}