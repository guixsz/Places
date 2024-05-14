package com.guilhermelopes.demo.config;

import com.guilhermelopes.demo.repositories.PlaceRepository;
import com.guilhermelopes.demo.service.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@Configuration
@EnableR2dbcAuditing
public class PlaceServiceConfig {
    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}