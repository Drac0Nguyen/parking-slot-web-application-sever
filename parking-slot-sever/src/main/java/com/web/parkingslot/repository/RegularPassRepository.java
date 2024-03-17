package com.web.parkingslot.repository;

import com.web.parkingslot.model.RegularPass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularPassRepository extends JpaRepository<RegularPass,Long> {
}
