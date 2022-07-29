package com.albo.prefactura.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aduana", schema = "PUBLIC")
public class Aduana implements Serializable {

    /** Inicio Campos BD **/
    @Id
    @Column(name = "adu_cod", nullable = false)
    private Integer aduCod;

    @Column(name = "adu_nombre", length = 50)
    private String aduNombre;

    @Column(name = "adu_pais", length = 50)
    private String aduPais;

    @Column(name = "adu_estado", length = 5)
    private String aduEstado;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aduana")
    private List<Recinto> recintos = new ArrayList<>();

    /** Fin Campos BD **/

    /** Inicio Getters y setters **/

    public Integer getAduCod() {
        return aduCod;
    }

    public void setAduCod(Integer aduCod) {
        this.aduCod = aduCod;
    }

    public String getAduNombre() {
        return aduNombre;
    }

    public void setAduNombre(String aduNombre) {
        this.aduNombre = aduNombre;
    }

    public String getAduPais() {
        return aduPais;
    }

    public void setAduPais(String aduPais) {
        this.aduPais = aduPais;
    }

    public String getAduEstado() {
        return aduEstado;
    }

    public void setAduEstado(String aduEstado) {
        this.aduEstado = aduEstado;
    }

    public List<Recinto> getRecintos() {
        return recintos;
    }

    public void setRecintos(List<Recinto> recintos) {
        this.recintos = recintos;
    }
    /** Fin Getters y setters **/

    @Serial
    private static final long serialVersionUID = -2579314335013870590L;
}
