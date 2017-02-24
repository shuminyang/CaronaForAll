package com.br.spring.caronaforall.entidades;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "carona")
@XmlRootElement
public class Carona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carona")
    private Integer idCarona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "local_partida")
    private String localPartida;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "local_chegada")
    private String localChegada;
    @Column(name = "lugares_disponiveis")
    private Integer lugaresDisponiveis;
    @Column(name = "horario_partida")
    @Temporal(TemporalType.DATE)
    private Date horarioPartida;
    @Size(max = 255)
    @Column(name = "custo")
    private String custo;
    @Column(name = "ativo")
    private Boolean ativo;
    @JoinColumn(name = "id_carona", referencedColumnName = "id_motorista", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Motorista motorista;
    @OneToMany(mappedBy = "idCarona")
    private List<Passageiro> passageiroList;

    public Carona() {
    }

    public Carona(Integer idCarona) {
        this.idCarona = idCarona;
    }

    public Carona(Integer idCarona, String localPartida, String localChegada) {
        this.idCarona = idCarona;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
    }

    public Integer getIdCarona() {
        return idCarona;
    }

    public void setIdCarona(Integer idCarona) {
        this.idCarona = idCarona;
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

    public Integer getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void setLugaresDisponiveis(Integer lugaresDisponiveis) {
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public Date getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(Date horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @XmlTransient
    public List<Passageiro> getPassageiroList() {
        return passageiroList;
    }

    public void setPassageiroList(List<Passageiro> passageiroList) {
        this.passageiroList = passageiroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarona != null ? idCarona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carona)) {
            return false;
        }
        Carona other = (Carona) object;
        if ((this.idCarona == null && other.idCarona != null) || (this.idCarona != null && !this.idCarona.equals(other.idCarona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.spring.caronaforall.entidades.Carona[ idCarona=" + idCarona + " ]";
    }

}
