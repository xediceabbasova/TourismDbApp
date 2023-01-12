package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDao {

    public Connection connect() throws Exception {

        String url = "jdbc:mysql://localhost:3306/tourism";
        String name = "root";
        String password = "12345";

        Connection c = DriverManager.getConnection(url, name, password);
        return c;
    }

}
