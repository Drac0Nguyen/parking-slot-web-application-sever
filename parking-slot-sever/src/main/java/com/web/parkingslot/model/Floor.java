package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = Block.class)
    @JoinColumn(name = "block_id", referencedColumnName = "id")
    private Block block;

    @JsonManagedReference
    @OneToMany(mappedBy = "floor")
    private List<ParkingSlot> slots;

    @Column
    private Long floorNumber;

    @Column
    private Long maxHeight;

    @Column
    private Long numberOfSlots;

    @Column
    private Boolean isCovered;

    @Column
    private Boolean isAccessible;

    @Column
    private Boolean isFloorFull;

    @Column
    private Boolean isReservedReqCustomer;

    @Column
    private Long numberOfWings;
}
