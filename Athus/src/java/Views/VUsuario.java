package Views;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "v_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VUsuario.findAll", query = "SELECT v FROM VUsuario v"),
    @NamedQuery(name = "VUsuario.findById", query = "SELECT v FROM VUsuario v WHERE v.id = :id"),
    @NamedQuery(name = "VUsuario.findByFilial", query = "SELECT v FROM VUsuario v WHERE v.filial = :filial"),
    @NamedQuery(name = "VUsuario.findByEmpresa", query = "SELECT v FROM VUsuario v WHERE v.empresa = :empresa"),
    @NamedQuery(name = "VUsuario.findByCnpj", query = "SELECT v FROM VUsuario v WHERE v.cnpj = :cnpj"),
    @NamedQuery(name = "VUsuario.findByDenominacao", query = "SELECT v FROM VUsuario v WHERE v.denominacao = :denominacao"),
    @NamedQuery(name = "VUsuario.findByEmpresaCNPJ", query = "SELECT v FROM VUsuario v WHERE v.empresaCNPJ = :empresaCNPJ"),
    @NamedQuery(name = "VUsuario.findByEmpresaDenominacao", query = "SELECT v FROM VUsuario v WHERE v.empresaDenominacao = :empresaDenominacao"),
    @NamedQuery(name = "VUsuario.findByFantasia", query = "SELECT v FROM VUsuario v WHERE v.fantasia = :fantasia"),
    @NamedQuery(name = "VUsuario.findByEndereco", query = "SELECT v FROM VUsuario v WHERE v.endereco = :endereco"),
    @NamedQuery(name = "VUsuario.findByBairro", query = "SELECT v FROM VUsuario v WHERE v.bairro = :bairro"),
    @NamedQuery(name = "VUsuario.findByCep", query = "SELECT v FROM VUsuario v WHERE v.cep = :cep"),
    @NamedQuery(name = "VUsuario.findByCidade", query = "SELECT v FROM VUsuario v WHERE v.cidade = :cidade"),
    @NamedQuery(name = "VUsuario.findByUf", query = "SELECT v FROM VUsuario v WHERE v.uf = :uf"),
    @NamedQuery(name = "VUsuario.findByEmpresaFones", query = "SELECT v FROM VUsuario v WHERE v.empresaFones = :empresaFones"),
    @NamedQuery(name = "VUsuario.findByContato", query = "SELECT v FROM VUsuario v WHERE v.contato = :contato"),
    @NamedQuery(name = "VUsuario.findByEmpresaemail", query = "SELECT v FROM VUsuario v WHERE v.empresaemail = :empresaemail"),
    @NamedQuery(name = "VUsuario.findByArea", query = "SELECT v FROM VUsuario v WHERE v.area = :area"),
    @NamedQuery(name = "VUsuario.findByDescricao", query = "SELECT v FROM VUsuario v WHERE v.descricao = :descricao"),
    @NamedQuery(name = "VUsuario.findByCodigo", query = "SELECT v FROM VUsuario v WHERE v.codigo = :codigo"),
    @NamedQuery(name = "VUsuario.findByNome", query = "SELECT v FROM VUsuario v WHERE v.nome = :nome"),
    @NamedQuery(name = "VUsuario.findByEmail", query = "SELECT v FROM VUsuario v WHERE v.email = :email"),
    @NamedQuery(name = "VUsuario.findByFones", query = "SELECT v FROM VUsuario v WHERE v.fones = :fones")})
public class VUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "Filial")
    private int filial;
    @Column(name = "Empresa")
    private Integer empresa;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "Denominacao")
    private String denominacao;
    @Column(name = "empresaCNPJ")
    private String empresaCNPJ;
    @Column(name = "empresaDenominacao")
    private String empresaDenominacao;
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
    @Column(name = "empresaFones")
    private String empresaFones;
    @Column(name = "Contato")
    private String contato;
    @Column(name = "empresaemail")
    private String empresaemail;
    @Basic(optional = false)
    @Column(name = "Area")
    private int area;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Codigo")
    private String codigo;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "Fones")
    private String fones;

    public VUsuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
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

    public String getEmpresaCNPJ() {
        return empresaCNPJ;
    }

    public void setEmpresaCNPJ(String empresaCNPJ) {
        this.empresaCNPJ = empresaCNPJ;
    }

    public String getEmpresaDenominacao() {
        return empresaDenominacao;
    }

    public void setEmpresaDenominacao(String empresaDenominacao) {
        this.empresaDenominacao = empresaDenominacao;
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

    public String getEmpresaFones() {
        return empresaFones;
    }

    public void setEmpresaFones(String empresaFones) {
        this.empresaFones = empresaFones;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmpresaemail() {
        return empresaemail;
    }

    public void setEmpresaemail(String empresaemail) {
        this.empresaemail = empresaemail;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFones() {
        return fones;
    }

    public void setFones(String fones) {
        this.fones = fones;
    }
    
}
