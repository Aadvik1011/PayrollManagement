package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("JDBC Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

