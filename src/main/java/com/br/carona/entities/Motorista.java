/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.carona.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author shu
 */
@Entity
@Table(name = "motorista")
public class Motorista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motorista_id")
    private Long motoristaId;
    @Column(name = "ativo")
    private Boolean ativo;
    @OneToMany(mappedBy = "motoristaId")
    private List<Carona> caronaList;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne
    private Usuario usuarioId;

    public Motorista() {
    }

    public Motorista(Long motoristaId) {
        this.motoristaId = motoristaId;
    }

    public Long getMotoristaId() {
        return motoristaId;
    }

    public void setMotoristaId(Long motoristaId) {
        this.motoristaId = motoristaId;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<Carona> getCaronaList() {
        return caronaList;
    }

    public void setCaronaList(List<Carona> caronaList) {
        this.caronaList = caronaList;
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
        hash += (motoristaId != null ? motoristaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motorista)) {
            return false;
        }
        Motorista other = (Motorista) object;
        if ((this.motoristaId == null && other.motoristaId != null) || (this.motoristaId != null && !this.motoristaId.equals(other.motoristaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.carona.entities.Motorista[ motoristaId=" + motoristaId + " ]";
    }
    
}
