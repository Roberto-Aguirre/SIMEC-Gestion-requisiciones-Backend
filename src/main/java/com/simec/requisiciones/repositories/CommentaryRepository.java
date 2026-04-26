package com.simec.requisiciones.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simec.requisiciones.entities.Commentary.Commentary;

@Repository
public interface CommentaryRepository extends JpaRepository<Commentary, Long> {

}
