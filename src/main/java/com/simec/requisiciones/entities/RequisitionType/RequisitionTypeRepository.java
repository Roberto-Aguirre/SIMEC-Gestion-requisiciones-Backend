package com.simec.requisiciones.entities.RequisitionType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitionTypeRepository extends JpaRepository<RequisitionType, Long> {

}
