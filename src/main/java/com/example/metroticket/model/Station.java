
package com.example.metroticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Station {
    @Id
    private String stationCode;
    private boolean startStation;
    private boolean lastStation;
    private int price;

    // Getters and setters
}
