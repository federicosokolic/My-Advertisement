/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.advertisement.web.data;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author FEDESISAT
 */
public class RegistroDao {

    private Connection conn;

    public RegistroDao(Connection conn) {
        this.conn = conn;
    }

    public void Registro(String email,String usuario, String password, String name, String apellido) {
        
        String em = email;
        String us = usuario;
        String ps = password;
        String nm = name;
        String ap = apellido;     
        
        try {


        Statement st = this.conn.createStatement();
   
        String sql = "INSERT INTO users (email,user_name,password,name,last_name) values ('"
                 + em + "', '" 
                 + us + "', '"   
                 + ps + "', '"
                 + nm + "', '"
                 + ap + "')";

        st.execute(sql);
        st.close();
        conn.close();
        
        } catch (Exception e){
            throw new DataException (e);
        }
        

    }

}
