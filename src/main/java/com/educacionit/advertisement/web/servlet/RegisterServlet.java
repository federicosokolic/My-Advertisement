/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.advertisement.web.servlet;

import com.educacionit.advertisement.web.data.DBConnectionManager;
import com.educacionit.advertisement.web.data.RegistroDao;
import com.educacionit.advertisement.web.data.UserDao;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FEDESISAT
 */
@WebServlet("/registro")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");

        String apellido = request.getParameter("apellido");

        String email = request.getParameter("email");

        String usuario = request.getParameter("usuario");

        String contrasenia = request.getParameter("contrasenia");

        ServletContext ctx = request.getServletContext();               // CONSULTAR SI ES NECESARIO

        DBConnectionManager db = (DBConnectionManager) ctx.getAttribute("db"); 
        
        RegistroDao dao = new RegistroDao(db.getConnection());

//        System.out.println(nombre + " " + usuario + " " + contrasenia + " " + nombre + " " + apellido);

        dao.Registro(email,usuario,contrasenia,nombre,apellido);
        
        response.sendRedirect("registro.jsp?userok=1000");

    }

}
