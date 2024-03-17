package com.web.parkingslot.repository;

import com.web.parkingslot.model.ParkingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<ParkingTicket,Long> {
}
