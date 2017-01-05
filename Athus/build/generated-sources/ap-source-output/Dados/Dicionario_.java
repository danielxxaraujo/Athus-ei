package Dados;

import Dados.Sistema;
import Dados.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-17T15:30:49")
@StaticMetamodel(Dicionario.class)
public class Dicionario_ { 

    public static volatile SingularAttribute<Dicionario, Date> data;
    public static volatile SingularAttribute<Dicionario, String> periodo;
    public static volatile SingularAttribute<Dicionario, Sistema> sistema;
    public static volatile SingularAttribute<Dicionario, Usuario> usuario;
    public static volatile SingularAttribute<Dicionario, Integer> id;
    public static volatile SingularAttribute<Dicionario, String> script;
    public static volatile SingularAttribute<Dicionario, String> descricao;

}