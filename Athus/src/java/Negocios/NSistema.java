package Negocios;


import Dados.Banco;
import Dados.Sistema;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

public class NSistema {
    
    public List<Sistema> Listar(){
        
        Banco banco = Banco.getInstance();
        
        List<Sistema> sistemas = new ArrayList<Sistema>();
        
        String script = " SELECT  ID, Descricao, HRef, Imagem, Width1, Height1, Titulo, Width2, Height2 FROM sistema ";
        
        try {
            
            sistemas = banco.Banco().createNativeQuery(script, Sistema.class).getResultList();
            
        } catch (Exception ex) {
            Logger.getGlobal().info(ex.toString());
        }
        
        return sistemas;
                
    }
}