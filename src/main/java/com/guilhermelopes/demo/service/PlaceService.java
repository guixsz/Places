package com.guilhermelopes.demo.service;

import com.guilhermelopes.demo.api.PlaceRequest;
import com.guilhermelopes.demo.api.PlaceResponse;
import com.guilhermelopes.demo.domain.Place;
import com.guilhermelopes.demo.repositories.PlaceRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest request){
        var place =  new Place(null, request.name(), request.slug(), request.state(), request.createdAt(), request.updatedAt());
        return this.placeRepository.save(place);
    }
}
