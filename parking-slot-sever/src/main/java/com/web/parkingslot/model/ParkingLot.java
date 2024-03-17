package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long numberOfBlocks;

    @Column
    private Boolean isSlotAvailable;

    @Column
    private String address;

    @JsonBackReference
    @ManyToMany(mappedBy = "parkingLots")
    private List<User> users;

    @JsonManagedReference
    @OneToMany(mappedBy = "parkingLot")
    private List<Block> blocks;
}
