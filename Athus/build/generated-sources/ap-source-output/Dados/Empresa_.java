package Dados;

import Dados.Filial;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-17T15:30:49")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> cidade;
    public static volatile SingularAttribute<Empresa, String> fones;
    public static volatile SingularAttribute<Empresa, String> endereco;
    public static volatile SingularAttribute<Empresa, String> bairro;
    public static volatile SingularAttribute<Empresa, String> denominacao;
    public static volatile SingularAttribute<Empresa, String> cnpj;
    public static volatile SingularAttribute<Empresa, String> cep;
    public static volatile SingularAttribute<Empresa, String> uf;
    public static volatile SingularAttribute<Empresa, String> fantasia;
    public static volatile CollectionAttribute<Empresa, Filial> filialCollection;
    public static volatile SingularAttribute<Empresa, Integer> id;
    public static volatile SingularAttribute<Empresa, String> contato;
    public static volatile SingularAttribute<Empresa, String> email;

}