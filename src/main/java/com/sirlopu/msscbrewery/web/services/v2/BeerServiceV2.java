package com.sirlopu.msscbrewery.web.services.v2;

import com.sirlopu.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    BeerDtoV2 getBeerById(UUID beerId);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeerById(UUID beerId);
}
