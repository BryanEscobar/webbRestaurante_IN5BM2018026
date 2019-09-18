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
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByIdclientes", query = "SELECT c FROM Clientes c WHERE c.idclientes = :idclientes")
    , @NamedQuery(name = "Clientes.findByNombre", query = "SELECT c FROM Clientes c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Clientes.findByApellido", query = "SELECT c FROM Clientes c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Clientes.findByCategoria", query = "SELECT c FROM Clientes c WHERE c.categoria = :categoria")
    , @NamedQuery(name = "Clientes.findByNit", query = "SELECT c FROM Clientes c WHERE c.nit = :nit")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclientes")
    private Integer idclientes;
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
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nit")
    private String nit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clientesIdclientes")
    private List<Facturas> facturasList;

    public Clientes() {
    }

    public Clientes(Integer idclientes) {
        this.idclientes = idclientes;
    }

    public Clientes(Integer idclientes, String nombre, String apellido, String categoria, String nit) {
        this.idclientes = idclientes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.nit = nit;
    }

    public Integer getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Integer idclientes) {
        this.idclientes = idclientes;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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
        hash += (idclientes != null ? idclientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idclientes == null && other.idclientes != null) || (this.idclientes != null && !this.idclientes.equals(other.idclientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Clientes[ idclientes=" + idclientes + " ]";
    }
    
}
