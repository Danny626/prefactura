package com.albo.prefactura.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recinto", schema = "PUBLIC")
public class Recinto implements Serializable {

    /** inicio campos bd **/
    @Id
    @Column(name = "rec_cod", nullable = false, length = 5)
    private String recCod;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "nombrea", length = 50)
    private String nombrea;

    @Column(name = "estado", length = 5)
    private String estado;

    @Column(name = "tipo", length = 10)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "adu_cod", referencedColumnName = "adu_cod")
    private Aduana aduana;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "recinto")
    private List<SearchLog> searchLogs = new ArrayList<>();

    /** fin campos bd **/

    /** inicio getters y setters **/

    public String getRecCod() {
        return recCod;
    }

    public void setRecCod(String recCod) {
        this.recCod = recCod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Aduana getAduana() {
        return aduana;
    }

    public void setAduana(Aduana aduana) {
        this.aduana = aduana;
    }

    public List<SearchLog> getSearchLogs() {
        return searchLogs;
    }

    public void setSearchLogs(List<SearchLog> searchLogs) {
        this.searchLogs = searchLogs;
    }

    /** fin getters y setters **/

    @Serial
    private static final long serialVersionUID = -981894483357603615L;
}
