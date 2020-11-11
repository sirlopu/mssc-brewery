package com.sirlopu.msscbrewery.web.services.v2;

import com.sirlopu.msscbrewery.web.model.BeerDto;
import com.sirlopu.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //TODO add a real impl to update a beer
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("deleting a beer...");
    }


}
