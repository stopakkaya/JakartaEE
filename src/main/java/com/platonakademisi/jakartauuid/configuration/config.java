package com.platonakademisi.jakartauuid.configuration;

import com.platonakademisi.jakartauuid.service.BuildingService;
import com.platonakademisi.jakartauuid.service.ConstructorService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration(proxyBeanMethods = false)
public class config {
  @Bean
  public RestTemplate restTemplate() {
    System.out.println("rest template created!");
    return new RestTemplateBuilder().build();
  }

  @Bean
  public ConstructorService constructorService(RestTemplate restTemplate) {
    System.out.println("constructorService created!");
    return new ConstructorService(restTemplate);
  }

  @Bean
  public BuildingService buildingService(RestTemplate restTemplate) {
    System.out.println("buildingService created!");
    return new BuildingService(restTemplate);
  }
}
