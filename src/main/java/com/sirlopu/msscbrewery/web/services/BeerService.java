package com.sirlopu.msscbrewery.web.services;

import com.sirlopu.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
