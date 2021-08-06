package com.example.citiesapi.cities.resources;

import com.example.citiesapi.cities.entities.City;
import com.example.citiesapi.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public List<City> cidades() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<City> optional = repository.findById(id);

        if(optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
