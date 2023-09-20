package org.example.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "locationsequence", sequenceName = "locationsequence", allocationSize = 1)
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator = "locationsequence")
    @Column(name = "location_id")
    private int locationId;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "placeName")
    private String placeName;

    @Column(name = "des")
    private String des;

}
