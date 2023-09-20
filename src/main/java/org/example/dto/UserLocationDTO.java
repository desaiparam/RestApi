package org.example.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private int userId;
    private String userName;
    private double latitude;
    private double longitude;
    private String place;
}