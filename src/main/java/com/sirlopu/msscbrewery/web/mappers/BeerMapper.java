package com.sirlopu.msscbrewery.web.mappers;

import com.sirlopu.msscbrewery.domain.Beer;
import com.sirlopu.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
