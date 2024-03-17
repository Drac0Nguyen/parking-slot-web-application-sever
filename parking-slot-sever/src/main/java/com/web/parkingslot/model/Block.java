package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String blockCode;

    @Column
    private Long numberOfFloors;

    @Column
    private Boolean isBlockFull;

    @JsonBackReference
    @ManyToOne(targetEntity = ParkingLot.class)
    @JoinColumn(name = "parkinglot_id", referencedColumnName = "id")
    private ParkingLot parkingLot;

    @JsonManagedReference
    @OneToMany(mappedBy = "block")
    private List<Floor> floors;

}
