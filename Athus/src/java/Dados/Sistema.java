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

@Entity
@Table(name = "sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sistema.findAll", query = "SELECT s FROM Sistema s"),
    @NamedQuery(name = "Sistema.findById", query = "SELECT s FROM Sistema s WHERE s.id = :id"),
    @NamedQuery(name = "Sistema.findByDescricao", query = "SELECT s FROM Sistema s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Sistema.findByHRef", query = "SELECT s FROM Sistema s WHERE s.hRef = :hRef"),
    @NamedQuery(name = "Sistema.findByImagem", query = "SELECT s FROM Sistema s WHERE s.imagem = :imagem"),
    @NamedQuery(name = "Sistema.findByWidth1", query = "SELECT s FROM Sistema s WHERE s.width1 = :width1"),
    @NamedQuery(name = "Sistema.findByHeight1", query = "SELECT s FROM Sistema s WHERE s.height1 = :height1"),
    @NamedQuery(name = "Sistema.findByTitulo", query = "SELECT s FROM Sistema s WHERE s.titulo = :titulo"),
    @NamedQuery(name = "Sistema.findByWidth2", query = "SELECT s FROM Sistema s WHERE s.width2 = :width2"),
    @NamedQuery(name = "Sistema.findByHeight2", query = "SELECT s FROM Sistema s WHERE s.height2 = :height2")})
public class Sistema implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistema")
    private Collection<Dicionario> dicionarioCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "HRef")
    private String hRef;
    @Column(name = "Imagem")
    private String imagem;
    @Column(name = "Width1")
    private Integer width1;
    @Column(name = "Height1")
    private Integer height1;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Width2")
    private Integer width2;
    @Column(name = "Height2")
    private Integer height2;

    public Sistema() {
    }

    public Sistema(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHRef() {
        return hRef;
    }

    public void setHRef(String hRef) {
        this.hRef = hRef;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getWidth1() {
        return width1;
    }

    public void setWidth1(Integer width1) {
        this.width1 = width1;
    }

    public Integer getHeight1() {
        return height1;
    }

    public void setHeight1(Integer height1) {
        this.height1 = height1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getWidth2() {
        return width2;
    }

    public void setWidth2(Integer width2) {
        this.width2 = width2;
    }

    public Integer getHeight2() {
        return height2;
    }

    public void setHeight2(Integer height2) {
        this.height2 = height2;
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
        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dados.Sistema[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Dicionario> getDicionarioCollection() {
        return dicionarioCollection;
    }

    public void setDicionarioCollection(Collection<Dicionario> dicionarioCollection) {
        this.dicionarioCollection = dicionarioCollection;
    }
    
}
