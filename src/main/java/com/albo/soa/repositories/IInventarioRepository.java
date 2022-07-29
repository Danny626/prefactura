package com.albo.soa.repositories;

import com.albo.soa.entities.Inventario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IInventarioRepository extends JpaRepository<Inventario, String> {

    @Query("FROM Inventario inv "
        + "WHERE inv.invGestion = :gestion "
        + "AND inv.invRecinto.recCod = :recinto "
        + "AND inv.invNroreg LIKE :nroReg "
        + "AND inv.invEmbarque LIKE :docEmbarque")
	List<Inventario> buscar(
        @Param("gestion") String gestion,
        @Param("recinto") String recinto,
        @Param("nroReg") String nroReg,
        @Param("docEmbarque") String docEmbarque
    );
}
