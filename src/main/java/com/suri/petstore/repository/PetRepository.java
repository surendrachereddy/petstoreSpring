package com.suri.petstore.repository;

import com.suri.petstore.domain.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<PetEntity, Long> {
}
