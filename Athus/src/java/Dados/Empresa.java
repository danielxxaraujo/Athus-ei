/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findById", query = "SELECT e FROM Empresa e WHERE e.id = :id"),
    @NamedQuery(name = "Empresa.findByCnpj", query = "SELECT e FROM Empresa e WHERE e.cnpj = :cnpj"),
    @NamedQuery(name = "Empresa.findByDenominacao", query = "SELECT e FROM Empresa e WHERE e.denominacao = :denominacao"),
    @NamedQuery(name = "Empresa.findByFantasia", query = "SELECT e FROM Empresa e WHERE e.fantasia = :fantasia"),
    @NamedQuery(name = "Empresa.findByEndereco", query = "SELECT e FROM Empresa e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "Empresa.findByBairro", query = "SELECT e FROM Empresa e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Empresa.findByCep", query = "SELECT e FROM Empresa e WHERE e.cep = :cep"),
    @NamedQuery(name = "Empresa.findByCidade", query = "SELECT e FROM Empresa e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Empresa.findByUf", query = "SELECT e FROM Empresa e WHERE e.uf = :uf"),
    @NamedQuery(name = "Empresa.findByFones", query = "SELECT e FROM Empresa e WHERE e.fones = :fones"),
    @NamedQuery(name = "Empresa.findByContato", query = "SELECT e FROM Empresa e WHERE e.contato = :contato"),
    @NamedQuery(name = "Empresa.findByEmail", query = "SELECT e FROM Empresa e WHERE e.email = :email")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Denominacao")
    private String denominacao;
    @Column(name = "Fantasia")
    private String fantasia;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "UF")
    private String uf;
    @Column(name = "Fones")
    private String fones;
    @Column(name = "Contato")
    private String contato;
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private Collection<Filial> filialCollection;

    public Empresa() {
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFones() {
        return fones;
    }

    public void setFones(String fones) {
        this.fones = fones;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Filial> getFilialCollection() {
        return filialCollection;
    }

    public void setFilialCollection(Collection<Filial> filialCollection) {
        this.filialCollection = filialCollection;
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
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Empresa[ id=" + id + " ]";
    }
    
}
