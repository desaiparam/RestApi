package org.example.controller;

import org.example.model.Location;
import org.example.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping("/insertlocation")
    public ResponseEntity<Location> insertLocation(@RequestBody Location location){
        return new ResponseEntity<Location>(locationService.insertLocation(location),HttpStatus.CREATED);
    }

    @GetMapping("/seelocation")
    public List<Location> viewLocation(){
        return locationService.getLocation();
    }
}
