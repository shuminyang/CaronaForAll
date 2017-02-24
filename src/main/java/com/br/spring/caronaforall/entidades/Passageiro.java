package com.br.spring.caronaforall.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "passageiro")
@XmlRootElement
public class Passageiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_passageiro")
    private Integer idPassageiro;
    @Column(name = "ativo")
    private Boolean ativo;
    @JoinColumn(name = "id_carona", referencedColumnName = "id_carona")
    @ManyToOne
    private Carona idCarona;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario idUsuario;

    public Passageiro() {
    }

    public Passageiro(Integer idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public Integer getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(Integer idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Carona getIdCarona() {
        return idCarona;
    }

    public void setIdCarona(Carona idCarona) {
        this.idCarona = idCarona;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPassageiro != null ? idPassageiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passageiro)) {
            return false;
        }
        Passageiro other = (Passageiro) object;
        if ((this.idPassageiro == null && other.idPassageiro != null) || (this.idPassageiro != null && !this.idPassageiro.equals(other.idPassageiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.spring.caronaforall.entidades.Passageiro[ idPassageiro=" + idPassageiro + " ]";
    }

}
