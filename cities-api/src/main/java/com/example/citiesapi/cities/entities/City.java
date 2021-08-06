package com.example.citiesapi.cities.entities;

import org.springframework.data.geo.Point;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class City {

    @Id
    private Long id;
    private String nome;
    private Integer uf;
    private Double latitude;
    private Double longitude;

    public City() {
    }

    public City(Long id, String nome, Integer uf, Double latitude, Double longitude) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getUf() {
        return uf;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Point getLocation() { return new Point(latitude, longitude); }
}
