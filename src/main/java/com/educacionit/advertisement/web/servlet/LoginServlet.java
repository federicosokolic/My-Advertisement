
package com.educacionit.advertisement.web.servlet;


import com.educacionit.advertisement.web.data.DBConnectionManager;
import com.educacionit.advertisement.web.data.User;
import com.educacionit.advertisement.web.data.UserDao;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet ("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String email = request.getParameter ("email");

        String password = request.getParameter ("password");

        ServletContext ctx = request.getServletContext();

        DBConnectionManager db = (DBConnectionManager) ctx.getAttribute("db");

        UserDao dao = new UserDao (db.getConnection());

        User u = dao.login (email, password);

        PrintWriter out = response.getWriter();

        if (u == null) {


            response.sendRedirect("login.jsp?error=1001");

        } else {

            HttpSession session = request.getSession ();
            session.setAttribute("user", u);

            response.sendRedirect("dashboard.jsp");
        }
    }
}