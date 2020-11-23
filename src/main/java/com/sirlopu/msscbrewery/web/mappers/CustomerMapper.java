package com.sirlopu.msscbrewery.web.mappers;

import com.sirlopu.msscbrewery.domain.Customer;
import com.sirlopu.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
