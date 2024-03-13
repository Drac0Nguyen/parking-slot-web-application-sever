package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
public class ParkingSlot {
    @Id
    @GeneratedValue
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = Floor.class)
    @JoinColumn(name = "floor_id", referencedColumnName = "id")
    private Floor floor;

    @Column
    private Long slotNumber;

    @Column
    private Long wingCode;
}
