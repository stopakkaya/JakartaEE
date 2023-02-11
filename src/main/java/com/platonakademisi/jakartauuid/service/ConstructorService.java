package com.platonakademisi.jakartauuid.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class ConstructorService {
    private final RestTemplate restTemplate;

    public ConstructorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
