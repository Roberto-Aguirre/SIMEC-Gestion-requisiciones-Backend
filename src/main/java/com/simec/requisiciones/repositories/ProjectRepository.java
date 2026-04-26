package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.Project.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
