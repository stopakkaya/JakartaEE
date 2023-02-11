package com.platonakademisi.jakartauuid.repository;

import com.platonakademisi.jakartauuid.model.Building;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BuildingRepository extends ListCrudRepository<Building, UUID> {
}
