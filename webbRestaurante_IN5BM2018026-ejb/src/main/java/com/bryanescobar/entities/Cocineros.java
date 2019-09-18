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
@Table(name = "cocineros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cocineros.findAll", query = "SELECT c FROM Cocineros c")
    , @NamedQuery(name = "Cocineros.findByIdcocineros", query = "SELECT c FROM Cocineros c WHERE c.idcocineros = :idcocineros")
    , @NamedQuery(name = "Cocineros.findByNombre", query = "SELECT c FROM Cocineros c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Cocineros.findByApellido", query = "SELECT c FROM Cocineros c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Cocineros.findBySueldo", query = "SELECT c FROM Cocineros c WHERE c.sueldo = :sueldo")})
public class Cocineros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcocineros")
    private Integer idcocineros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sueldo")
    private String sueldo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cocinerosIdcocineros")
    private List<Detallefactura> detallefacturaList;

    public Cocineros() {
    }

    public Cocineros(Integer idcocineros) {
        this.idcocineros = idcocineros;
    }

    public Cocineros(Integer idcocineros, String nombre, String apellido, String sueldo) {
        this.idcocineros = idcocineros;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Integer getIdcocineros() {
        return idcocineros;
    }

    public void setIdcocineros(Integer idcocineros) {
        this.idcocineros = idcocineros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcocineros != null ? idcocineros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cocineros)) {
            return false;
        }
        Cocineros other = (Cocineros) object;
        if ((this.idcocineros == null && other.idcocineros != null) || (this.idcocineros != null && !this.idcocineros.equals(other.idcocineros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Cocineros[ idcocineros=" + idcocineros + " ]";
    }
    
}
