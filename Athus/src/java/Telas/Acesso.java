package Telas;

import Dados.Sistema;
import Dados.Usuario;
import Negocios.NMenu;
import Negocios.NSistema;
import Negocios.NUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Acesso", urlPatterns = {"/Acesso"})
public class Acesso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try{
            
            HttpSession session = request.getSession();
            
            if (session.getAttribute("matricula") == null){
                response.sendRedirect("TUsuario");
            } else {
                
                Usuario usuarioAtivo = new NUsuario().ConsultarMatricula(session.getAttribute("matricula").toString());
            
                List<Sistema> sistemas = new NSistema().Listar();

                out.println(new NMenu().Cabecalho(usuarioAtivo));
                
                    out.println("<table border=0 width=100%>");
                    out.println("   <tr>");
                        int linha = 0;
                        for (int x = 0; x < sistemas.size(); x++){
                            
                            out.println("<td style='text-align: center;'>"
                                    + "<a href='"+ sistemas.get(x).getHRef() +"'>"
                                    + "<img src='"+ sistemas.get(x).getImagem()+"' width='"+ sistemas.get(x).getWidth1()+"' height='"+ sistemas.get(x).getHeight1()+"' ><br>"
                                    + "<img src='"+ sistemas.get(x).getTitulo()+"' width='"+ sistemas.get(x).getWidth2()+"' height='"+ sistemas.get(x).getHeight2()+"' >"
                                    + "</a></td>");
                            
                            linha ++;
                            if (linha >= 5){
                                out.println("</tr><tr>");
                                linha = 0;
                            }
                        }
                    out.println("   </tr>");   
                    out.println("</table>");

                out.println(new NMenu().RodaPe());
            }
        } catch (Exception e){
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