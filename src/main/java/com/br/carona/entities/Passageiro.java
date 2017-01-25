/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.carona.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author shu
 */
@Entity
@Table(name = "passageiro")
public class Passageiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "passageiro_id")
    private Long passageiroId;
    @Column(name = "ativo")
    private Boolean ativo;
    @JoinColumn(name = "carona_id", referencedColumnName = "carona_id")
    @ManyToOne
    private Carona caronaId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario usuarioId;

    public Passageiro() {
    }

    public Passageiro(Long passageiroId) {
        this.passageiroId = passageiroId;
    }

    public Long getPassageiroId() {
        return passageiroId;
    }

    public void setPassageiroId(Long passageiroId) {
        this.passageiroId = passageiroId;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Carona getCaronaId() {
        return caronaId;
    }

    public void setCaronaId(Carona caronaId) {
        this.caronaId = caronaId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passageiroId != null ? passageiroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passageiro)) {
            return false;
        }
        Passageiro other = (Passageiro) object;
        if ((this.passageiroId == null && other.passageiroId != null) || (this.passageiroId != null && !this.passageiroId.equals(other.passageiroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.carona.entities.Passageiro[ passageiroId=" + passageiroId + " ]";
    }
    
}
