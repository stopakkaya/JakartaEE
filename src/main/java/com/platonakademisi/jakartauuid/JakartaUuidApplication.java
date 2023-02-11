package com.platonakademisi.jakartauuid;

import com.platonakademisi.jakartauuid.model.Building;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.platonakademisi.jakartauuid.repository.BuildingRepository;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class JakartaUuidApplication {

    public static void main(String[] args) {
        SpringApplication.run(JakartaUuidApplication.class, args);
    }

  @Bean
  public CommandLineRunner commandLineRunner(BuildingRepository repository) {
    return args -> {
      List<Building> buildings = List.of(new Building("Building1"), new Building("Building2"));
      repository.saveAll(buildings);

      repository.findAll().forEach(System.out::println);
    };
  }
}
