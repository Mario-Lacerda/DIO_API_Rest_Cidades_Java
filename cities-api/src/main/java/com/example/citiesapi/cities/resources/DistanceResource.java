package com.example.citiesapi.cities.resources;

import com.example.citiesapi.cities.service.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distancia")
public class DistanceResource {

    private final DistanceService service;
    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    public DistanceResource(DistanceService service) {
        this.service = service;
    }

    @GetMapping("/metros")
    public ResponseEntity byCube(@RequestParam(name = "origem") final Long city1,
                                 @RequestParam(name = "destino") final Long city2) {
        log.info("byCube");
        return ResponseEntity.ok().body(service.distanceByCubeInMeters(city1, city2));
    }
}
