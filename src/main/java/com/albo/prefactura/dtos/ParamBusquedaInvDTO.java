package com.albo.prefactura.dtos;

public class ParamBusquedaInvDTO {
    
    private String codRecinto;
    private Integer gestion;
    private String nroRegistro;
    private String docEmbarque;

    public Integer getGestion() {
        return gestion;
    }
    public void setGestion(Integer gestion) {
        this.gestion = gestion;
    }
    public String getNroRegistro() {
        return nroRegistro;
    }
    public void setNroRegistro(String nroRegistro) {
        this.nroRegistro = nroRegistro;
    }
    public String getDocEmbarque() {
        return docEmbarque;
    }
    public void setDocEmbarque(String docEmbarque) {
        this.docEmbarque = docEmbarque;
    }
    public String getCodRecinto() {
        return codRecinto;
    }
    public void setCodRecinto(String codRecinto) {
        this.codRecinto = codRecinto;
    }
    
}
