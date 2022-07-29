package com.albo.prefactura.repositories;

import com.albo.prefactura.entities.Aduana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAduanaRepository extends JpaRepository<Aduana, Integer> {
}
