package Negocios;

import Dados.Banco;
import Dados.Log;
import java.util.logging.Logger;


public class NLog {
    
    public Boolean Salvar(Log log){
        
        Boolean erro = false;
        
        Banco acesso = Banco.getInstance();
                
        try{
            acesso.Banco().getTransaction().begin();
            
            if (log.getId() == null){
                acesso.Banco().persist(log);
            } else {
                acesso.Banco().merge(log);
            }
            
            acesso.Banco().flush();
            
            erro = true;
            
        } catch (Exception e) {
            Logger.getGlobal().info(e.toString());
        } finally {
            acesso.Banco().getTransaction().commit();
        }
        
        return erro;
    }
    
}
