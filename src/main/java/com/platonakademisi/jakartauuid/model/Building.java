package com.platonakademisi.jakartauuid.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Building{
    public Building() {
    }

    public Building(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
