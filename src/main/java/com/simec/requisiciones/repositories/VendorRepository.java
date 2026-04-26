package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.Vendor.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
