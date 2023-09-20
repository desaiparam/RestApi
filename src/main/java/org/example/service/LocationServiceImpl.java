package org.example.service;

import org.example.dto.UserLocationDTO;
import org.example.model.Location;
import org.example.model.User;
import org.example.repository.LocationRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location insertLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getLocation() {
        return locationRepository.findAll();
    }
}
