package Negocios;

import Dados.Banco;
import Dados.Usuario;
import Views.VUsuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class NUsuario {
    
    public Usuario Salvar(Usuario usuario){
        
        Banco banco = Banco.getInstance();
        
        try{
            
            banco.Banco().getTransaction().begin();
            
            if (usuario.getId().equals(0)){
                banco.Banco().persist(usuario);
            } else {
                banco.Banco().merge(usuario);
            }
            
            banco.Banco().flush();
            
        } catch (Exception ex) {
            Logger.getGlobal().info(ex.toString());
        } finally {
            banco.Banco().getTransaction().commit();
        }
        
        return usuario;
    }
    
    public Usuario ConsultarEmail(String opcao){
        
        Banco banco = Banco.getInstance();
        
        Usuario usuario = null;
        
        try{
            
            usuario = banco.Banco()
                .createNamedQuery("Usuario.findByEmail", Usuario.class)
                .setParameter("email", opcao)
                .getSingleResult();
                    
        } catch (Exception e) {
            Logger.getGlobal().info(e.toString());
        }
        
        return usuario;
    }
    
    public Usuario ConsultarMatricula(String opcao){
                
        Banco banco = Banco.getInstance();
        
        Usuario usuario = null;
        
        try{

            usuario = banco.Banco()
                .createNamedQuery("Usuario.findByCodigo", Usuario.class)
                .setParameter("codigo", opcao)
                .getSingleResult();
                         
        } catch (Exception e) {
            Logger.getGlobal().info(">>>>>>> ConsultarMatricula:"+ opcao +"::::: " + e.toString());
        }
        return usuario;
    }
    
    public Usuario Consultar(String id){
        
        Banco banco = Banco.getInstance();
        
        Usuario usuario = null;
        
        try {
            
            usuario = 
                banco.Banco()
                    .createNamedQuery("Usuario.findById", Usuario.class)
                    .setParameter("id", Integer.parseInt(id))
                    .getSingleResult();
            
        } catch (Exception ex) {
            Logger.getGlobal().info(ex.toString());
        }
        
        return usuario;
    }
    
    public List<VUsuario> ListarView(String opcao){
        
        Banco banco = Banco.getInstance();
        
        List<VUsuario> vUsuarios = new ArrayList<VUsuario>();
        
        String script = " SELECT ID, Filial, Empresa, CNPJ, Denominacao, empresaCNPJ, empresaDenominacao, Fantasia, Endereco"
                + ", Bairro, CEP, Cidade, UF, empresaFones, Contato, empresaemail, Area, Descricao, Codigo, Nome, email, Fones "
                + "FROM v_usuario ";
        
        try{
            
            vUsuarios = banco.getInstance().Banco().createNativeQuery(script, VUsuario.class).getResultList();
            
        } catch (Exception ex){
            Logger.getGlobal().info(ex.toString());
        }
        
        return vUsuarios;
    }
    
    public Usuario UsuarioAtivo(String opcao){
        
        Usuario mcUsuario = null;
        
        mcUsuario = ConsultarMatricula(opcao);
        
        if (mcUsuario == null){
            mcUsuario.setId(1);
            mcUsuario.setCodigo("1");
            mcUsuario.setNome("Visitante");
        }
        
        return mcUsuario ;
    }
}
