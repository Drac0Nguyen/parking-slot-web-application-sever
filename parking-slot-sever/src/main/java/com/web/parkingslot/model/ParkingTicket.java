package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
public class ParkingTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @JsonBackReference
    @ManyToOne(targetEntity = ParkingSlot.class)
    @JoinColumn(name = "parkingslot_id", referencedColumnName = "id")
    private ParkingSlot parkingSlot;

    @Column
    private Timestamp startTimestamp;

    @Column
    private Date bookingDate;

    @Column
    private Long durationInMinutes;

    @JsonManagedReference
    @OneToMany(mappedBy = "parkingTicket")
    private List<ParkingSlip> parkingSlips;
}
