package com.sirlopu.msscbrewery.web.services;

import com.sirlopu.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
