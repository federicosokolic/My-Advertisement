
package com.educacionit.advertisement.web.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

    private Connection conn;

    public UserDao(Connection conn) {
        this.conn = conn;
    }


    public User login (String email, String password) {

        User u = null;

        try {

            Statement st = this.conn.createStatement();

            ResultSet rs = st.executeQuery("select * from users where email='" + email
                    + "' and password='" + password + "'");

            while (rs.next ()) {

                u = new User ();

                u.setEmail (rs.getString("email"));
                u.setName (rs.getString("name"));
                u.setLastName (rs.getString("last_name"));
                u.setPassword (rs.getString("password"));
            }

        } catch (Exception e) {

            throw new DataException (e);
        }

        return u;
    }
}
