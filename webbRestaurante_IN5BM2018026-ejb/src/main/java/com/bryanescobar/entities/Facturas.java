/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findByIdfacturas", query = "SELECT f FROM Facturas f WHERE f.idfacturas = :idfacturas")
    , @NamedQuery(name = "Facturas.findByFecha", query = "SELECT f FROM Facturas f WHERE f.fecha = :fecha")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfacturas")
    private Integer idfacturas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturasIdfacturas")
    private List<Detallefactura> detallefacturaList;
    @JoinColumn(name = "clientes_idclientes", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes clientesIdclientes;
    @JoinColumn(name = "mesas_idmesas", referencedColumnName = "idmesas")
    @ManyToOne(optional = false)
    private Mesas mesasIdmesas;
    @JoinColumn(name = "meseros_idmeseros", referencedColumnName = "idmeseros")
    @ManyToOne(optional = false)
    private Meseros meserosIdmeseros;

    public Facturas() {
    }

    public Facturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public Facturas(Integer idfacturas, Date fecha) {
        this.idfacturas = idfacturas;
        this.fecha = fecha;
    }

    public Integer getIdfacturas() {
        return idfacturas;
    }

    public void setIdfacturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    public Clientes getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Clientes clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Mesas getMesasIdmesas() {
        return mesasIdmesas;
    }

    public void setMesasIdmesas(Mesas mesasIdmesas) {
        this.mesasIdmesas = mesasIdmesas;
    }

    public Meseros getMeserosIdmeseros() {
        return meserosIdmeseros;
    }

    public void setMeserosIdmeseros(Meseros meserosIdmeseros) {
        this.meserosIdmeseros = meserosIdmeseros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfacturas != null ? idfacturas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.idfacturas == null && other.idfacturas != null) || (this.idfacturas != null && !this.idfacturas.equals(other.idfacturas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Facturas[ idfacturas=" + idfacturas + " ]";
    }
    
}
