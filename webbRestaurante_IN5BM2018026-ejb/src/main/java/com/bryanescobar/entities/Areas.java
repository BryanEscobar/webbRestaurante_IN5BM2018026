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
@Table(name = "areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a")
    , @NamedQuery(name = "Areas.findByIdareas", query = "SELECT a FROM Areas a WHERE a.idareas = :idareas")
    , @NamedQuery(name = "Areas.findByDescripcion", query = "SELECT a FROM Areas a WHERE a.descripcion = :descripcion")})
public class Areas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idareas")
    private Integer idareas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "areasIdareas")
    private List<Mesas> mesasList;

    public Areas() {
    }

    public Areas(Integer idareas) {
        this.idareas = idareas;
    }

    public Areas(Integer idareas, String descripcion) {
        this.idareas = idareas;
        this.descripcion = descripcion;
    }

    public Integer getIdareas() {
        return idareas;
    }

    public void setIdareas(Integer idareas) {
        this.idareas = idareas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idareas != null ? idareas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.idareas == null && other.idareas != null) || (this.idareas != null && !this.idareas.equals(other.idareas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bryanescobar.entities.Areas[ idareas=" + idareas + " ]";
    }
    
}
