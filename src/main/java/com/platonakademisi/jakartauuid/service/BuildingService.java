package com.platonakademisi.jakartauuid.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class BuildingService {
    private final RestTemplate restTemplate;

    public BuildingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
