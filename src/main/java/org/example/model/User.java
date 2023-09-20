package org.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = "usersequence", sequenceName = "usersequence", allocationSize = 1)
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator = "usersequence")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
