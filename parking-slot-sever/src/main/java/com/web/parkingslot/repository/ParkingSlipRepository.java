package com.web.parkingslot.repository;

import com.web.parkingslot.model.ParkingSlip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSlipRepository extends JpaRepository<ParkingSlip, Long> {
}
