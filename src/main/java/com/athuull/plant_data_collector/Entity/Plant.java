package com.athuull.plant_data_collector.Entity;

import jakarta.persistence.*;

@Entity
@Table()
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String scientificName;
    private String description;


    // No-arg constructor
    public Plant() {
    }

    // Constructor with all fields
    public Plant(Long id, String name, String scientificName, String description) {
        this.id = id;
        this.name = name;
        this.scientificName = scientificName;
        this.description = description;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for better logging
    @Override
    public String toString() {
        return "Plant{id=" + id + ", name='" + name + "', scientificName='" + scientificName + "', description='" + description + "'}";
    }
}