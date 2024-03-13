package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@Setter
@Getter
public class RegularPass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column
    private Date purchaseDate;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private Long durationsInDay;

    @Column
    private Double cost;
}
