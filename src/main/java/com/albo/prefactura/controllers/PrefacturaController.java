package com.albo.prefactura.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albo.prefactura.entities.SearchLog;
import com.albo.prefactura.services.IRecintoService;
import com.albo.prefactura.services.ISearchLogService;
import com.albo.soa.entities.Inventario;
import com.albo.soa.services.alt.IInventarioAltService;

@RestController
@RequestMapping("/preFactura")
public class PrefacturaController {

    private final Logger logger = LoggerFactory.getLogger(PrefacturaController.class);

    @Autowired
    private IRecintoService recintoService;

    @Autowired
    private ISearchLogService searchLogService;

    @Autowired
    private IInventarioAltService inventarioAltService;

    @PostMapping(value = "/guardarBusqueda", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<?> guardarBusqueda(SearchLog searchLog) {
        SearchLog searchLogCreada = new SearchLog();
        searchLogCreada = searchLogService.saveOrUpdate(searchLog);

        Inventario inventarioAlt = inventarioAltService.findById("asdf").orElse(null);

        return new ResponseEntity<SearchLog>(searchLogCreada, HttpStatus.OK);
    }
}
