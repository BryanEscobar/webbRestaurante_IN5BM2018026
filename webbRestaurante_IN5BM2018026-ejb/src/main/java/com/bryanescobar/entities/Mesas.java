/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdmesas", query = "SELECT m FROM Mesas m WHERE m.idmesas = :idmesas")
    , @NamedQuery(name = "Mesas.findByCategorias", query = "SELECT m FROM Mesas m WHERE m.categorias = :categorias")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmesas")
    private Integer idmesas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categorias")
    private String categorias;
    @JoinColumn(name = "areas_idareas", referencedColumnName = "idareas")
    @ManyToOne(optional = false)
    private Areas areasIdareas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mesasIdmesas")
    private List<Facturas> facturasList;

    public Mesas() {
    }

    public Mesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    public Mesas(Integer idmesas, String categorias) {
        this.idmesas = idmesas;
        this.categorias = categorias;
    }

    public Integer getIdmesas() {
        return idmesas;
    }

    public void setIdmesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public Areas getAreasIdareas() {
        return areasIdareas;
    }

    public void setAreasIdareas(Areas areasIdareas) {
        this.areasIdareas = areasIdareas;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesas != null ? idmesas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idmesas == null && other.idmesas != null) || (this.idmesas != null && !this.idmesas.equals(other.idmesas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Mesas[ idmesas=" + idmesas + " ]";
    }
    
}
