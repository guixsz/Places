package com.guilhermelopes.demo.repositories;

import com.guilhermelopes.demo.domain.Place;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface PlaceRepository extends ReactiveCrudRepository<Place, Long> {
}
