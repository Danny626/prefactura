package com.albo.prefactura.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albo.prefactura.dtos.ParamBusquedaInvDTO;
import com.albo.prefactura.entities.Recinto;
import com.albo.prefactura.entities.SearchLog;
import com.albo.prefactura.services.ISearchLogService;
import com.albo.soa.entities.Inventario;
import com.albo.soa.services.alt.IInventarioAltService;
import com.albo.soa.services.vir.IInventarioVirService;

@RestController
@RequestMapping("/preFactura")
public class PrefacturaController {

    private final Logger logger = LoggerFactory.getLogger(PrefacturaController.class);

    @Autowired
    private ISearchLogService searchLogService;

    @Autowired
    private IInventarioAltService inventarioAltService;
    
    @Autowired
    private IInventarioVirService inventarioVirService;

    @PostMapping(value = "/buscarInventario", 
        consumes = { MediaType.APPLICATION_JSON_VALUE }, 
        produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<?> buscarInventario(
        @RequestBody ParamBusquedaInvDTO paramBusquedaInv
    ) {
        String nroRegistro = paramBusquedaInv.getNroRegistro();
        String docEmbarque = paramBusquedaInv.getDocEmbarque();

        if(nroRegistro == null || nroRegistro.equals("")) {
            nroRegistro = "%";
        }

        if(docEmbarque == null || docEmbarque.equals("")) {
            docEmbarque = "%";
        }

        List<Inventario> inventariosResult = new ArrayList<>();

        switch (paramBusquedaInv.getCodRecinto()) {
            case "ALT01":
                inventariosResult = inventarioAltService.buscar(paramBusquedaInv.getGestion().toString(),
                paramBusquedaInv.getCodRecinto(), nroRegistro, docEmbarque); 
                break;

            case "VIR01":
                inventariosResult = inventarioVirService.buscar(paramBusquedaInv.getGestion().toString(),
                paramBusquedaInv.getCodRecinto(), nroRegistro, docEmbarque); 
                break;
        
            default:
                String msjeRecinto = "Error. Código de recinto incorrecto"; 
                logger.error(msjeRecinto);
                return new ResponseEntity<String>(msjeRecinto, HttpStatus.BAD_REQUEST);
        }

        // guardamos registro de la búsqueda q se realizó
        guardarBusqueda(paramBusquedaInv);

        return new ResponseEntity<List<Inventario>>(inventariosResult, HttpStatus.OK);
    }
    
    public SearchLog guardarBusqueda(ParamBusquedaInvDTO paramBusquedaInv) {
        Recinto recinto = new Recinto();
        recinto.setRecCod(paramBusquedaInv.getCodRecinto());

        SearchLog searchLog = new SearchLog();
        searchLog.setCreateAt(new Date());
        searchLog.setDocEmbarque(paramBusquedaInv.getDocEmbarque());
        searchLog.setGestion(paramBusquedaInv.getGestion());
        searchLog.setNroRegistro(paramBusquedaInv.getNroRegistro());
        searchLog.setRecinto(recinto);

        searchLog = searchLogService.saveOrUpdate(searchLog);

        return searchLog;
    }
}
