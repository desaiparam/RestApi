package org.example.service;

import org.example.model.Location;
import org.example.model.User;

import java.util.List;

public interface LocationService {

    Location insertLocation(Location location);

    List<Location> getLocation();
}
