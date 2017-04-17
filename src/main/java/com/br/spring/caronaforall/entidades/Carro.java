package com.br.spring.caronaforall.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "carro")
@XmlRootElement
public class Carro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_carro")
    private Integer idCarro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "placa", unique = true)
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lugares")
    private int lugares;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_inclusao")
    private Date dataInclusao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_alteracao")
    private Date dataAlteracao;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario idUsuario;

    public Carro() {
    }

    public Carro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public Carro(Integer idCarro, String placa, int lugares) {
        this.idCarro = idCarro;
        this.placa = placa;
        this.lugares = lugares;
    }

    public Integer getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Integer idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarro != null ? idCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carro)) {
            return false;
        }
        Carro other = (Carro) object;
        if ((this.idCarro == null && other.idCarro != null) || (this.idCarro != null && !this.idCarro.equals(other.idCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.br.spring.caronaforall.entidades.Carro[ idCarro=" + idCarro + " ]";
    }

}
