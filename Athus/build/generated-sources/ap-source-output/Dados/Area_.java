package Dados;

import Dados.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-17T15:30:49")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Integer> id;
    public static volatile CollectionAttribute<Area, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Area, String> descricao;

}