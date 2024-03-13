package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
public class ParkingSlip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = ParkingTicket.class)
    @JoinColumn(name = "parkingticket_id", referencedColumnName = "id")
    private ParkingTicket parkingTicket;

    @Column
    private Timestamp actualEntryTime;

    @Column
    private Timestamp actualExitTime;

    @Column
    private Double basicCost;

    @Column
    private Double penalty;

    @Column
    private Double totalCost;

    @Column
    private Boolean isPaid;
}
