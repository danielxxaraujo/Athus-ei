package Dados;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-17T15:30:49")
@StaticMetamodel(Log.class)
public class Log_ { 

    public static volatile SingularAttribute<Log, String> evento;
    public static volatile SingularAttribute<Log, Date> data;
    public static volatile SingularAttribute<Log, Integer> sistema;
    public static volatile SingularAttribute<Log, String> matricula;
    public static volatile SingularAttribute<Log, Integer> id;
    public static volatile SingularAttribute<Log, Integer> acao;

}