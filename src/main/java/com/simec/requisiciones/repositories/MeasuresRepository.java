package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.Measures.Measures;

@Repository
public interface MeasuresRepository extends JpaRepository<Measures, Long> {

}
