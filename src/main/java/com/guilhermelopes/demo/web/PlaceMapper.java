package com.guilhermelopes.demo.web;

import com.guilhermelopes.demo.api.PlaceResponse;
import com.guilhermelopes.demo.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
