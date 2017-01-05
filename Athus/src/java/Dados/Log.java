package Dados;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l"),
    @NamedQuery(name = "Log.findById", query = "SELECT l FROM Log l WHERE l.id = :id"),
    @NamedQuery(name = "Log.findByData", query = "SELECT l FROM Log l WHERE l.data = :data"),
    @NamedQuery(name = "Log.findBySistema", query = "SELECT l FROM Log l WHERE l.sistema = :sistema"),
    @NamedQuery(name = "Log.findByAcao", query = "SELECT l FROM Log l WHERE l.acao = :acao"),
    @NamedQuery(name = "Log.findByEvento", query = "SELECT l FROM Log l WHERE l.evento = :evento"),
    @NamedQuery(name = "Log.findByMatricula", query = "SELECT l FROM Log l WHERE l.matricula = :matricula")})

public class Log implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @Column(name = "SISTEMA")
    private int sistema;
    @Basic(optional = false)
    @Column(name = "ACAO")
    private int acao;
    @Column(name = "EVENTO")
    private String evento;
    @Basic(optional = false)
    @Column(name = "MATRICULA")
    private String matricula;

    public Log() {
    }

    public Log(Integer id) {
        this.id = id;
    }

    public Log(Integer id, Date data, int sistema, int acao, String matricula) {
        this.id = id;
        this.data = data;
        this.sistema = sistema;
        this.acao = acao;
        this.matricula = matricula;
    }
    
    public Log(Date data, int sistema, int acao, String evento, String matricula) {
        this.data = data;
        this.sistema = sistema;
        this.acao = acao;
        this.evento = evento;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }

    public int getAcao() {
        return acao;
    }

    public void setAcao(int acao) {
        this.acao = acao;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Log[ id=" + id + " ]";
    }
    
}
