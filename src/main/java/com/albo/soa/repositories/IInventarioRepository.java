package com.albo.soa.repositories;

import com.albo.soa.entities.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInventarioRepository extends JpaRepository<Inventario, String> {
}
