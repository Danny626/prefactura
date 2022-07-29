package com.albo.prefactura.entities;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "search_log", schema = "PUBLIC")
public class SearchLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gestion")
    private Integer gestion;

    @Column(name = "nro_registro", length = 30)
    private String nroRegistro;

    @Column(name = "doc_embarque", length = 30)
    private String docEmbarque;

    @ManyToOne
    @JoinColumn(name = "rec_cod", referencedColumnName = "rec_cod")
    private Recinto recinto;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public Date getCreateAt() { return createAt; }

    public void setCreateAt(Date createAt) { this.createAt = createAt; }

    @Serial
    private static final long serialVersionUID = 1308515150310777933L;

}
