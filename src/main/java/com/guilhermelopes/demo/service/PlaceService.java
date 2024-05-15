package com.guilhermelopes.demo.service;

import com.github.slugify.Slugify;
import com.guilhermelopes.demo.api.PlaceRequest;
import com.guilhermelopes.demo.api.PlaceResponse;
import com.guilhermelopes.demo.domain.Place;
import com.guilhermelopes.demo.repositories.PlaceRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PlaceService {

    private final PlaceRepository placeRepository;
    private Slugify slg;

    public PlaceService(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest request){
        var place =  new Place(null, request.name(), slg.slugify(request.name()), request.state(), null, null);
        return this.placeRepository.save(place);
    }
}
