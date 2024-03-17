package com.web.parkingslot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "username") })
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String username;

    @Column()
    private String fullName;

    @Column()
    private String password;

    @Column()
    private String phone;

    @Column()
    private String userStatus;

    @Column()
    private Date dob;
    @Column()
    private String img;

    @Column()
    private Date passwordLastSet;

    @Enumerated(EnumType.STRING)
    @Column()
    private GenderEnum gender;

    @Column(name = "create_date", updatable = false)
    private Date createdDate;

    @JsonManagedReference
    @ManyToMany()
    @JoinTable(name = "user_parking", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "parkinglot_id"))
    private List<ParkingLot> parkingLots;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<ParkingTicket> tickets;

    @JsonManagedReference
    @OneToOne
    private Role role;
}
