/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.bondary;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import occ.ues.edu.sv.ingenieria.prn335.controller.Cine;
import occ.ues.edu.sv.ingenieria.prn335.entity.Pelicula;

/**
 *
 * @author melvin
 */
@WebServlet(name = "FrmServlet", urlPatterns = {"/FrmServlet"})
public class FrmServlet extends HttpServlet {
    Cine cine=new Cine();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FrmServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FrmServlet at " + request.getContextPath() + "</h1>");
            
            
                    
         int idpelicula=Integer.parseInt(request.getParameter("idPelicula"));
            String titulo=request.getParameter("Titulo");
            String duracion=request.getParameter("Duracion");
            String director=request.getParameter("Director");
            String genero=request.getParameter("Genero");
            LocalDate fecha= LocalDate.parse(request.getParameter("FechaEstreno"));
            char clasificacion=request.getParameter("Clasificacion").charAt(0);
            String sinopsis=request.getParameter("Sinopsis");
            
            
            if(request.getParameter("btnAceptar").equals("Aceptar")){

            
            cine.agregarPelicula(idpelicula, titulo, duracion, director, genero, fecha, clasificacion, sinopsis);
            
            
 
            }else if (request.getParameter("btnAceptar").equals("Modificar")) {
                cine.modificarPelicula(idpelicula, titulo, duracion, director, genero, fecha, clasificacion, sinopsis);  
            }
            

            
            
            //tabla
            out.println("<table border='1' >");
            out.println("<tr><th>Id</th><th>Titulo</th><th>Duracion</th><th>Director</th><th>Genero</th>"
                    + "<th>Fecha</th><th>Clasificacion</th><th>Sinopsis</th></tr>");
            for (Pelicula pelicula : cine.getListaPeliculas()) {
                out.print("<tr><td>" + String.valueOf(pelicula.getIdPelicula()) + "</td>"
                        + "<td>" + pelicula.getTitulo() + "</td>"
                        + "<td>" + pelicula.getDuracion() + "</td>"
                        + "<td>" + pelicula.getDirector() + "</td>"
                        + "<td>" + pelicula.getGenero() + "</td>"
                        + "<td>" + pelicula.getFechaEstreno().toString() + "</td>"
                        + "<td>" + pelicula.getClasificacion() + "</td>"
                        + "<td>" + pelicula.getSinopsis() + "</td></tr>");
            }
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>"); 
          
            
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
