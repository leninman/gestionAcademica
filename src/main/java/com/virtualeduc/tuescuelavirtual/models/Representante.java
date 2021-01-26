/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtualeduc.tuescuelavirtual.models;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Lenin
 */
@Entity
@Table(name = "representantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representante.findAll", query = "SELECT r FROM Representante r")
    , @NamedQuery(name = "Representante.findByIdRpr", query = "SELECT r FROM Representante r WHERE r.idRpr = :idRpr")
    , @NamedQuery(name = "Representante.findByTipoDocRpr", query = "SELECT r FROM Representante r WHERE r.tipoDocRpr = :tipoDocRpr")
    , @NamedQuery(name = "Representante.findByNumDocRpr", query = "SELECT r FROM Representante r WHERE r.numDocRpr = :numDocRpr")
    , @NamedQuery(name = "Representante.findByPrimNombRpr", query = "SELECT r FROM Representante r WHERE r.primNombRpr = :primNombRpr")
    , @NamedQuery(name = "Representante.findBySegNombRpr", query = "SELECT r FROM Representante r WHERE r.segNombRpr = :segNombRpr")
    , @NamedQuery(name = "Representante.findByPrimApellRpr", query = "SELECT r FROM Representante r WHERE r.primApellRpr = :primApellRpr")
    , @NamedQuery(name = "Representante.findBySegApellRpr", query = "SELECT r FROM Representante r WHERE r.segApellRpr = :segApellRpr")
    , @NamedQuery(name = "Representante.findBySexoRpr", query = "SELECT r FROM Representante r WHERE r.sexoRpr = :sexoRpr")
    , @NamedQuery(name = "Representante.findByFechNacRpr", query = "SELECT r FROM Representante r WHERE r.fechNacRpr = :fechNacRpr")
    , @NamedQuery(name = "Representante.findByEdadRpr", query = "SELECT r FROM Representante r WHERE r.edadRpr = :edadRpr")
    , @NamedQuery(name = "Representante.findByEdoCivRpr", query = "SELECT r FROM Representante r WHERE r.edoCivRpr = :edoCivRpr")
    , @NamedQuery(name = "Representante.findByParentescoRpr", query = "SELECT r FROM Representante r WHERE r.parentescoRpr = :parentescoRpr")
    , @NamedQuery(name = "Representante.findByDirPpalRpr", query = "SELECT r FROM Representante r WHERE r.dirPpalRpr = :dirPpalRpr")
    , @NamedQuery(name = "Representante.findByDirSecRpr", query = "SELECT r FROM Representante r WHERE r.dirSecRpr = :dirSecRpr")
    , @NamedQuery(name = "Representante.findByTlfPpalRpr", query = "SELECT r FROM Representante r WHERE r.tlfPpalRpr = :tlfPpalRpr")
    , @NamedQuery(name = "Representante.findByTlfSecRpr", query = "SELECT r FROM Representante r WHERE r.tlfSecRpr = :tlfSecRpr")
    , @NamedQuery(name = "Representante.findByEmailRpr", query = "SELECT r FROM Representante r WHERE r.emailRpr = :emailRpr")})
public class Representante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RPR")
    private Long idRpr;
    @Basic(optional = false)
    @Column(name = "TIPO_DOC_RPR")
    private String tipoDocRpr;
    @Basic(optional = false)
    @Column(name = "NUM_DOC_RPR")
    private String numDocRpr;
    @Basic(optional = false)
    @Column(name = "PRIM_NOMB_RPR")
    private String primNombRpr;
    @Column(name = "SEG_NOMB_RPR")
    private String segNombRpr;
    @Basic(optional = false)
    @Column(name = "PRIM_APELL_RPR")
    private String primApellRpr;
    @Column(name = "SEG_APELL_RPR")
    private String segApellRpr;
    @Basic(optional = false)
    @Column(name = "SEXO_RPR")
    private String sexoRpr;
    @Basic(optional = false)
    @Column(name = "FECH_NAC_RPR")
    @Temporal(TemporalType.DATE)
    private Date fechNacRpr;
    @Basic(optional = false)
    @Column(name = "EDAD_RPR")
    private int edadRpr;
    @Basic(optional = false)
    @Column(name = "EDO_CIV_RPR")
    private String edoCivRpr;
    @Basic(optional = false)
    @Column(name = "PARENTESCO_RPR")
    private String parentescoRpr;
    @Basic(optional = false)
    @Column(name = "DIR_PPAL_RPR")
    private String dirPpalRpr;
    @Basic(optional = false)
    @Column(name = "DIR_SEC_RPR")
    private String dirSecRpr;
    @Basic(optional = false)
    @Column(name = "TLF_PPAL_RPR")
    private String tlfPpalRpr;
    @Basic(optional = false)
    @Column(name = "TLF_SEC_RPR")
    private String tlfSecRpr;
    @Column(name = "EMAIL_RPR")
    private String emailRpr;
 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRpr1")
    private Collection<Alumno> alumnoCollection;
  
    @OneToMany(mappedBy = "idRpr2")
    private Collection<Alumno> alumnoCollection1;

    public Representante() {
    }

    public Representante(Long idRpr) {
        this.idRpr = idRpr;
    }

    public Representante(Long idRpr, String tipoDocRpr, String numDocRpr, String primNombRpr, String primApellRpr, String sexoRpr, Date fechNacRpr, int edadRpr, String edoCivRpr, String parentescoRpr, String dirPpalRpr, String dirSecRpr, String tlfPpalRpr, String tlfSecRpr) {
        this.idRpr = idRpr;
        this.tipoDocRpr = tipoDocRpr;
        this.numDocRpr = numDocRpr;
        this.primNombRpr = primNombRpr;
        this.primApellRpr = primApellRpr;
        this.sexoRpr = sexoRpr;
        this.fechNacRpr = fechNacRpr;
        this.edadRpr = edadRpr;
        this.edoCivRpr = edoCivRpr;
        this.parentescoRpr = parentescoRpr;
        this.dirPpalRpr = dirPpalRpr;
        this.dirSecRpr = dirSecRpr;
        this.tlfPpalRpr = tlfPpalRpr;
        this.tlfSecRpr = tlfSecRpr;
    }

    public Long getIdRpr() {
        return idRpr;
    }

    public void setIdRpr(Long idRpr) {
        this.idRpr = idRpr;
    }

    public String getTipoDocRpr() {
        return tipoDocRpr;
    }

    public void setTipoDocRpr(String tipoDocRpr) {
        this.tipoDocRpr = tipoDocRpr;
    }

    public String getNumDocRpr() {
        return numDocRpr;
    }

    public void setNumDocRpr(String numDocRpr) {
        this.numDocRpr = numDocRpr;
    }

    public String getPrimNombRpr() {
        return primNombRpr;
    }

    public void setPrimNombRpr(String primNombRpr) {
        this.primNombRpr = primNombRpr;
    }

    public String getSegNombRpr() {
        return segNombRpr;
    }

    public void setSegNombRpr(String segNombRpr) {
        this.segNombRpr = segNombRpr;
    }

    public String getPrimApellRpr() {
        return primApellRpr;
    }

    public void setPrimApellRpr(String primApellRpr) {
        this.primApellRpr = primApellRpr;
    }

    public String getSegApellRpr() {
        return segApellRpr;
    }

    public void setSegApellRpr(String segApellRpr) {
        this.segApellRpr = segApellRpr;
    }

    public String getSexoRpr() {
        return sexoRpr;
    }

    public void setSexoRpr(String sexoRpr) {
        this.sexoRpr = sexoRpr;
    }

    public Date getFechNacRpr() {
        return fechNacRpr;
    }

    public void setFechNacRpr(Date fechNacRpr) {
        this.fechNacRpr = fechNacRpr;
    }

    public int getEdadRpr() {
        return edadRpr;
    }

    public void setEdadRpr(int edadRpr) {
        this.edadRpr = edadRpr;
    }

    public String getEdoCivRpr() {
        return edoCivRpr;
    }

    public void setEdoCivRpr(String edoCivRpr) {
        this.edoCivRpr = edoCivRpr;
    }

    public String getParentescoRpr() {
        return parentescoRpr;
    }

    public void setParentescoRpr(String parentescoRpr) {
        this.parentescoRpr = parentescoRpr;
    }

    public String getDirPpalRpr() {
        return dirPpalRpr;
    }

    public void setDirPpalRpr(String dirPpalRpr) {
        this.dirPpalRpr = dirPpalRpr;
    }

    public String getDirSecRpr() {
        return dirSecRpr;
    }

    public void setDirSecRpr(String dirSecRpr) {
        this.dirSecRpr = dirSecRpr;
    }

    public String getTlfPpalRpr() {
        return tlfPpalRpr;
    }

    public void setTlfPpalRpr(String tlfPpalRpr) {
        this.tlfPpalRpr = tlfPpalRpr;
    }

    public String getTlfSecRpr() {
        return tlfSecRpr;
    }

    public void setTlfSecRpr(String tlfSecRpr) {
        this.tlfSecRpr = tlfSecRpr;
    }

    public String getEmailRpr() {
        return emailRpr;
    }

    public void setEmailRpr(String emailRpr) {
        this.emailRpr = emailRpr;
    }

    @XmlTransient
    public Collection<Alumno> getAlumnoCollection() {
        return alumnoCollection;
    }

    public void setAlumnoCollection(Collection<Alumno> alumnoCollection) {
        this.alumnoCollection = alumnoCollection;
    }

    @XmlTransient
    public Collection<Alumno> getAlumnoCollection1() {
        return alumnoCollection1;
    }

    public void setAlumnoCollection1(Collection<Alumno> alumnoCollection1) {
        this.alumnoCollection1 = alumnoCollection1;
    }



  
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRpr != null ? idRpr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representante)) {
            return false;
        }
        Representante other = (Representante) object;
        if ((this.idRpr == null && other.idRpr != null) || (this.idRpr != null && !this.idRpr.equals(other.idRpr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.virtualeduc.tuescuelavirtual.models.Representante[ idRpr=" + idRpr + " ]";
    }
    
}