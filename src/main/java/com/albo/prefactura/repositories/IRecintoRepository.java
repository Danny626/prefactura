package com.albo.prefactura.repositories;

import com.albo.prefactura.entities.Recinto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecintoRepository extends JpaRepository<Recinto, String> {
}
