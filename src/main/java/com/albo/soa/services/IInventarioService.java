package com.albo.soa.services;

import java.util.List;

import com.albo.soa.entities.Inventario;

public interface IInventarioService extends ReadOnlyService<Inventario, String>{

    List<Inventario> buscar(
        String gestion,
        String recinto,
        String nroReg,
        String docEmbarque
    );
}
