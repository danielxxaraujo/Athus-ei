/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "dicionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dicionario.findAll", query = "SELECT d FROM Dicionario d"),
    @NamedQuery(name = "Dicionario.findById", query = "SELECT d FROM Dicionario d WHERE d.id = :id"),
    @NamedQuery(name = "Dicionario.findByPeriodo", query = "SELECT d FROM Dicionario d WHERE d.periodo = :periodo"),
    @NamedQuery(name = "Dicionario.findByDescricao", query = "SELECT d FROM Dicionario d WHERE d.descricao = :descricao"),
    @NamedQuery(name = "Dicionario.findByScript", query = "SELECT d FROM Dicionario d WHERE d.script = :script"),
    @NamedQuery(name = "Dicionario.findByData", query = "SELECT d FROM Dicionario d WHERE d.data = :data")})
public class Dicionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Periodo")
    private String periodo;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Script")
    private String script;
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "Sistema", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Sistema sistema;
    @JoinColumn(name = "Usuario", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Dicionario() {
    }

    public Dicionario(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dicionario)) {
            return false;
        }
        Dicionario other = (Dicionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Dicionario[ id=" + id + " ]";
    }
    
}
