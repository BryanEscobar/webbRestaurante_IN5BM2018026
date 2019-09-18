/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryanescobar.entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdplatos", query = "SELECT p FROM Platos p WHERE p.idplatos = :idplatos")
    , @NamedQuery(name = "Platos.findByPlatos", query = "SELECT p FROM Platos p WHERE p.platos = :platos")
    , @NamedQuery(name = "Platos.findByPrecio", query = "SELECT p FROM Platos p WHERE p.precio = :precio")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idplatos")
    private Integer idplatos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "platos")
    private String platos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @JoinColumn(name = "detallefactura_iddetallefactura", referencedColumnName = "iddetallefactura")
    @ManyToOne(optional = false)
    private Detallefactura detallefacturaIddetallefactura;

    public Platos() {
    }

    public Platos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public Platos(Integer idplatos, String platos, double precio) {
        this.idplatos = idplatos;
        this.platos = platos;
        this.precio = precio;
    }

    public Integer getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public String getPlatos() {
        return platos;
    }

    public void setPlatos(String platos) {
        this.platos = platos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Detallefactura getDetallefacturaIddetallefactura() {
        return detallefacturaIddetallefactura;
    }

    public void setDetallefacturaIddetallefactura(Detallefactura detallefacturaIddetallefactura) {
        this.detallefacturaIddetallefactura = detallefacturaIddetallefactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplatos != null ? idplatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idplatos == null && other.idplatos != null) || (this.idplatos != null && !this.idplatos.equals(other.idplatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Platos[ idplatos=" + idplatos + " ]";
    }
    
}
