package Negocios;

import Dados.Usuario;
import java.util.Calendar;

public class NMenu {
    
    public String Cabecalho(Usuario usuarioAtivo){
        
        String texto = "";
        
        texto += "<!DOCTYPE html>";
        texto += "<html>";
        texto += "<head>";
        texto += "   <title>Athus-EI :: Menu</title>";
        texto += "   <link rel='stylesheet' href='estilo.css' type='text/css'>";
        texto += "   <link rel='shortcut icon' href='imagens/logo_ico.png'>";
        texto += "</head>";
        texto += "<body>";
        texto += "   <div id='corpo'>";
        texto += "       <div id='cabecalho'>"
                            + "<table border=0 width=100%>"
                            + "<tr>"
                            + "<td width='20px'><a href='/Athus/Acesso'><img src='imagens/logo_tridimensional.png' width='100px' heigth='100px'></a></td>"
                            + "<td style='align: left;'>Athus Ambiental - EI (Enverionment Intelligence)</td>"
                            + "<td width='10px'><img src='imagens/usuario.png' width='30px' heigth='30px'></td>"
                            + "<td width='200px'>"+ usuarioAtivo.getNome() +"</td>"
                            + "</tr></table>"
                + "      </div>";
        texto += "       <div id='conteudo'>";        
        
        return texto;
    }
    
    public String RodaPe(){
        
        String texto = "";
        
        texto += "       </div>";
        texto += "       <div id='rodape'>Sistema desenvolvido pela Athus Ambiental-EI &copy - "+ String.valueOf(Calendar.getInstance().get(Calendar.YEAR))
                +" - Versão 1.0.5</div>";
        texto += "   </div>";
        texto += "</body>";
        texto += "</html>";
        
        return texto;
    }
}