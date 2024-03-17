package com.web.parkingslot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingHistory {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn
    private ParkingLot parkingLot;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
