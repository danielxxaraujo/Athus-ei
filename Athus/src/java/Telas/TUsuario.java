package Telas;

import Dados.Log;
import Dados.Usuario;
import Negocios.NLog;
import Negocios.NUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "TUsuario", urlPatterns = {"/TUsuario"})
public class TUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession();
        
        String mensagem = "";
     
        try  {
            
            if (request.getParameter("email") != null && !request.getParameter("email").isEmpty()
                    && request.getParameter("senha") != null && !request.getParameter("senha").isEmpty()){
                
                String email = request.getParameter("email");
                String senha = request.getParameter("senha");
                
//                email = "daniel@athus-ei.com.br";
//                senha = "9999";                
                
                Usuario usuario = new NUsuario().ConsultarEmail(email);

                if (usuario !=  null){
                    if (usuario.getSenha().equals(senha)){
                        session.setAttribute("matricula", usuario.getCodigo());
                        new NLog().Salvar(new Log(new Date(Calendar.getInstance().getTimeInMillis()), 1, 1, "Acesso", usuario.getCodigo()));
                        response.sendRedirect("Acesso");
                    } else {
                        mensagem = "Usuário ou Senha inválidos.";
                    }
                } else {
                    mensagem = "Não foi possível conectar a base de dados.";
                }
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("   <title>Athus-EI - Identificação</title>");
            out.println("   <link rel='stylesheet' href='login.css' type='text/css'>");
            out.println("   <link rel='shortcut icon' href='imagens/logo_ico.png'>");
            out.println("   <style> input { text-align: center;}</style>");
            out.println("</head>");
            out.println("<body>");
            
            if (!mensagem.isEmpty())
                out.println("<h1>"+ mensagem +"</h1>");
            
            out.println("   <form action='TUsuario'>");
            out.println("   <table border=0 width=100%>");
            out.println("       <tr><td width=33% height=100px></td><td width=33%></td><td width=33%></td></tr>");
            out.println("       <tr><td width=33% height=300px></td><td width=33%>");
            
            out.println("   <table id='senha' border=0 width=100% cellpading=5>");
            out.println("       <tr><td height=20px></td></tr>");
            out.println("       <tr><td><img src='imagens/logo.png'></td></tr>");
            out.println("       <tr><th>Informe o e-mail</th></tr>");
            out.println("       <tr><td><input type='text' name='email' value='' size=50></td></tr>");
            out.println("       <tr><th>Senha</th></tr>");
            out.println("       <tr><td><input type='password' name='senha' value='' size=20></td></td></tr>");
            out.println("       <tr><td><input type='submit' value='Acessar'></td></tr>");
            out.println("       <tr><td height=20px></td></tr>");
            out.println("   </table>");
            
            out.println("       </td><td width=33%></td></tr>");
            out.println("   </table>");
            out.println("   </form>");
            out.println("</body>");
            out.println("</html>");
        }  catch (Exception e){
            out.println("<DIV>"+ e +"</DIV>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}