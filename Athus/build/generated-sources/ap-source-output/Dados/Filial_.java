package Dados;

import Dados.Empresa;
import Dados.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-17T15:30:49")
@StaticMetamodel(Filial.class)
public class Filial_ { 

    public static volatile SingularAttribute<Filial, String> denominacao;
    public static volatile SingularAttribute<Filial, Integer> id;
    public static volatile SingularAttribute<Filial, String> cnpj;
    public static volatile SingularAttribute<Filial, Empresa> empresa;
    public static volatile CollectionAttribute<Filial, Usuario> usuarioCollection;

}