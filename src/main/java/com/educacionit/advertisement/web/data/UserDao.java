/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.advertisement.web.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author EducaciónIT
 */
public class UserDao {
    
    private Connection conn;
    
    public UserDao(Connection conn) {
        this.conn = conn;
    }
    
    public User login (String email, String password){
        
        User u = null; 
        
        try {
            
            Statement st = this.conn.createStatement();     //voy a ejecturar una conexion sobre la basde de datos
            
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE email='"+ email + "' and password='"+ password +"'");
            
            while(rs.next()) {              //si hay registros
                
                u = new User();
                
                u.setEmail(rs.getString("email"));
                u.setName(rs.getString("name"));
                u.setLastname(rs.getString("last_name"));
                u.setPassword(rs.getString("password"));
                break;                  //se supone que solo va a haber un registro, ejecutamos el while y sale.
            }
            
        } catch (Exception e) {
            throw new DataException(e);
        }
        
        return u;
    }
    
}
