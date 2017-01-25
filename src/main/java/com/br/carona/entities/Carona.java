/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.carona.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author shu
 */
@Entity
@Table(name = "carona")
public class Carona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "carona_id")
    private Long caronaId;
    @Column(name = "local_partida")
    private String localPartida;
    @Column(name = "local_chegada")
    private String localChegada;
    @Column(name = "lugares")
    private Integer lugares;
    @Column(name = "horario_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioSaida;
    @Column(name = "horario_chegada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioChegada;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "ativo")
    private Boolean ativo;
    @JoinColumn(name = "motorista_id", referencedColumnName = "motorista_id")
    @ManyToOne
    private Motorista motoristaId;
    @OneToMany(mappedBy = "caronaId")
    private List<Passageiro> passageiroList;

    public Carona() {
    }

    public Carona(Long caronaId) {
        this.caronaId = caronaId;
    }

    public Long getCaronaId() {
        return caronaId;
    }

    public void setCaronaId(Long caronaId) {
        this.caronaId = caronaId;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalChegada() {
        return localChegada;
    }

    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public Integer getLugares() {
        return lugares;
    }

    public void setLugares(Integer lugares) {
        this.lugares = lugares;
    }

    public Date getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public Date getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(Date horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Motorista getMotoristaId() {
        return motoristaId;
    }

    public void setMotoristaId(Motorista motoristaId) {
        this.motoristaId = motoristaId;
    }

    public List<Passageiro> getPassageiroList() {
        return passageiroList;
    }

    public void setPassageiroList(List<Passageiro> passageiroList) {
        this.passageiroList = passageiroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caronaId != null ? caronaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carona)) {
            return false;
        }
        Carona other = (Carona) object;
        if ((this.caronaId == null && other.caronaId != null) || (this.caronaId != null && !this.caronaId.equals(other.caronaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.carona.entities.Carona[ caronaId=" + caronaId + " ]";
    }
    
}
