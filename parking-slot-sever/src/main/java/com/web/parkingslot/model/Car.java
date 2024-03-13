package com.web.parkingslot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Car {
    private int id;
    private int userId;

    private String licensePlate;
}
